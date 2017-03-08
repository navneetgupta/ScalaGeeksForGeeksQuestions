package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object PythagoreanTriplet {
  /*
   * http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/ 
   * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
   * */
  
  /*Method 1 (Naive)
   * A simple solution is to run three loops, three loops pick three array elements and check if current three elements form a Pythagorean Triplet.
   */
  def findTriplet(arr: Array[Int]):List[(Int,Int,Int)] = {
    val n= arr.length
    val as:IndexedSeq[(Int,Int,Int)] = for {
      i <- (0 to n-1)
      j <- (i+1 to n-1)
      k <- (j+1 to n-1)
    } yield {
      val x = math.pow(arr(i),2)
      val y = math.pow(arr(j),2)
      val z = math.pow(arr(k),2)
      if(x == y+z || y == x+z || z == y+x) {
        (arr(i),arr(j),arr(k))
      } else (0,0,0)
    }
    as.toList.filter(a => a._1+a._2+a._3 != 0)
  }
  
  
  /*Method 2 (Use Sorting)
   * We can solve this in O(n2) time by sorting the array first.
   * 1) Do square of every element in input array. This step takes O(n) time.
   * 2) Sort the squared array in increasing order. This step takes O(nLogn) time.
   * 3) To find a triplet (a, b, c) such that a = b + c, do following.
   * Fix ‘a’ as last element of sorted array.
   * Now search for pair (b, c) in subarray between first element and ‘a’. A pair (b, c) with given sum can be found in O(n) 
   * time using meet in middle algorithm discussed in method 1 of this post.
   * If no pair found for current ‘a’, then move ‘a’ one position back and repeat step 3.2.*/
  
  def findTriplet2(arr:Array[Int]):List[(Int,Int,Int,Boolean)] = {
    arr.foldLeft(0)((a,b) => {arr(a)=b*b;a+1;})
    val sArr = arr.sorted
    val n = sArr.length
    val as = for {
      i <- (n-1 to 2 by -1)
    } yield {
      processArr(sArr,0,i-1,i)
    }
    as.filter(a => a._4).toList
    
  }
  
  @tailrec
  def processArr(arr: Array[Int],l:Int,r:Int,i:Int):(Int,Int,Int,Boolean) = {
    if(l < r) {
      if(arr(l)+arr(r)==arr(i))
        (arr(l),arr(r),arr(i),true)
      else if(arr(l)+arr(r) < arr(i)) processArr(arr, l+1, r, i)
      else processArr(arr, l, r-1, i)
    } else 
        (arr(l),arr(r),arr(i),false)
  }
  
}