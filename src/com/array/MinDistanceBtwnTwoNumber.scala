package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 01-Mar-2017
 */

object MinDistanceBtwnTwoNumber {
  /*
   * http://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/ 
   * 
   * Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. 
   * The array might also contain duplicates. You may assume that both x and y are different and present in arr[].
   * */
  
  /*
   * Method 1 (Simple)
   * Use two loops: The outer loop picks all the elements of arr[] one by one. The inner loop picks all the elements after the 
   * element picked by outer loop. If the elements picked by outer and inner loops have same values as x or y then if needed 
   * update the minimum distance calculated so far.
   * */
  
  def findMinDistance(arr:Array[Int],n: Int,x: Int,y: Int) : Int = {
    var min_dist = Int.MaxValue
    for {
      i <- (0 until n)
      j <- (i+1 until n)
      if(((x==arr(i) && y == arr(j))||(y==arr(i) && x == arr(j))) && min_dist > math.abs(i-j))
    } yield {
      min_dist = math.abs(i-j)
    }
    min_dist
  }
  
  def findMinDistance3(arr:Array[Int],n: Int,x: Int,y: Int) : Int = {
      arr.foldLeft((Int.MaxValue,0))((a1,b1) => {
        (arr.view.zipWithIndex.foldLeft(a1._1)((a,b) => {
          if((b._2 > a1._2) && ((x==b1 && y == b._1)||(y==b1 && x == b._1)) && a > math.abs(a1._2-b._2)) {
            math.abs(a1._2-b._2)
          } else {
            a
          }
        }),a1._2+1)
      })._1
  }
  
  /*
   * Method 2 (Tricky)
      1) Traverse array from left side and stop if either x or y is found. Store index of this first occurrence in a variable say prev
      2) Now traverse arr[] after the index prev. If the element at current index i matches with either x or y then check if it is different 
      from arr[prev]. If it is different then update the minimum distance if needed. If it is same then update prev i.e., make prev = i.
   */
  def findMinDistance2(arr:Array[Int],n:Int,x:Int,y:Int) : Int = {
    var min_dist = Int.MaxValue
    val prev = findIndexOfFirstOccrenceOfXOrY(arr, x, y, 0, n)
    prev match {
      case None => new Error("Not Found x or y");0
      case Some(x1) => {
        var prev = x1
        for {
          i <- (x1 until n)
          if(arr(i)==x || arr(i)==y)
        } yield {
          if(arr(prev) != arr(i) && (i-prev) < min_dist) {
            min_dist = i - prev
            prev  = i
          } else prev= i
        }
        min_dist
      }
    }
  }
  
  def findMinDistance4(arr: Array[Int],n:Int,x:Int,y:Int): Int = {
    findIndexOfFirstOccrenceOfXOrY(arr, x, y, 0, n) match {
      case None => new Error("Not Found x or y");0
      case Some(x1) => {
        arr.view.zipWithIndex.foldLeft((Int.MaxValue,x1))((a,b) => {
          if(b._2 > x1 && (b._1 == x || b._1 ==y)) {
            if(arr(a._2) != b._1 && (b._2-a._2) < a._1) {
              (b._2-a._2,b._2)
            } else {
              (a._1,b._2)
            }
          } else {
            a
          }
        })._1
      }
    }
  }
  
  def findIndexOfFirstOccrenceOfXOrY(arr: Array[Int],x: Int,y:Int,i:Int,n:Int): Option[Int] = {
    if(i < n && (arr(i) == x || arr(i) == y))
      Some(i)
    else if(i<n) None 
    else findIndexOfFirstOccrenceOfXOrY(arr, x, y, i+1, n)
  }
}