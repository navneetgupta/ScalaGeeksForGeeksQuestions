package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 28-Feb-2017
 */

object MaxDiffWithLargerEltAfterSmallerElt {
  
  /*
   * http://www.geeksforgeeks.org/maximum-difference-between-two-elements/ 
   * 
   * Given an array arr[] of integers, find out the difference between any two elements such that larger 
   * element appears after the smaller number in arr[].
   * */
  
  /*
   * Method 1 (Simple)
   * Use two loops. In the outer loop, pick elements one by one and in the inner loop calculate the difference of the picked 
   * element with every other element in the array and compare the difference with the maximum difference calculated so far.
   * */
  def findDiffrence(arr: Array[Int]): Int = {
    val size = arr.length
    var maxDiff = arr(1) - arr(0)
    for {
      i <- (0 until size)
      j <- (i+1 until size)
      if((arr(j)-arr(i)) > maxDiff)
    } yield(maxDiff = arr(j)-arr(i))
    maxDiff
  }
  
  //more space consuming
  def findDiffrence2(arr: Array[Int]): Int = {
    val size = arr.length
    val xs:IndexedSeq[Int] = for {
      i <- (0 until size)
      j <- (i+1 until size)
      if((arr(j)-arr(i)) >= (arr(1)-arr(0)))
    } yield(arr(j)-arr(i))
    xs.max
  }
  
  /*Method 2: 
   * In this method, instead of taking difference of the picked element with every other element, we take the difference with the minimum element found so far. So we need to keep track of 2 things:
      1) Maximum difference found so far (max_diff).
      2) Minimum number visited so far (min_element).
   */
  def findDiffMethod2(arr:Array[Int]) : Int = {
    arr.foldLeft((Int.MinValue,arr(0)))((a,b) => {
      val newMaxDiff = if(b-a._2 > a._1) {
                          b-a._2
                        } else {
                          a._1
                        }
      val newMinElt = if(b < a._2) b else a._2
      (newMaxDiff,newMinElt)
    })._1
  }
  
  /*Method 3: 
   * First find the difference between the adjacent elements of the array and store all differences in an auxiliary array diff[] of size n-1. 
   * Now this problems turns into finding the maximum sum subarray of this difference array.
   * O(n)/O(n)*/
  def findDiffMethod3(arr :Array[Int]): Int = {
    val xs = for {
      i <- List.range(0 , arr.size-1)
    } yield(arr(i+1) - arr(i))
    xs.tail.foldLeft((xs.head,xs.head))((a,b) => {
      val newSum = if(a._2>0) b+a._2 else b
      val newMaxDiff = if(a._1 < newSum) newSum else a._1
      (newMaxDiff,newSum)
    })._1
  }
    
    /*
     * Method 3: 
     * O(n)/O(1)
     * */
    
    def fundDiffMethod3_2(arr:Array[Int]): Int = {
      val d = arr(1)-arr(0)
      arr.view.zipWithIndex.foldLeft((d,d,d))((a,b) => {
        if(b._2 > 0) {
          val diff = b._1 - arr(b._2-1)
          val newCurrentSum = if(a._2 >0) a._2+diff else diff
          if(newCurrentSum> a._3) (diff,newCurrentSum,newCurrentSum) else (diff,newCurrentSum,a._3)
        } else {
          a
        }
      })._3
    }
  
  
  
}