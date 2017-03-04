package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object LargestSubArrayWithEqualNo0sAnd1s {
  /*
   * http://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
   * 
   * Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s. Expected time complexity is O(n). */
  
  /*
   * Method 1: 
   *  use two nested loops. The outer loop picks a starting point i. The inner loop considers all subarrays starting from i. 
   *  If size of a subarray is greater than maximum size so far, then update the maximum size.
   *  In the below code, 0s are considered as -1 and sum of all values from i to j is calculated. 
   *  If sum becomes 0, then size of this subarray is compared with largest size so far.*/
  def findSubArray(arr: Array[Int]) {
    //(maxSize,startIdx,idx)
    val (newMaxSize,newStartIdx,i) = arr.foldLeft((-1,0,0))((a,b) => {
      if(a._3 < arr.length-1) {
        val sum = if(b == 0) -1 else 1
         //(maxSize,sum,startIndex,j)
        val (maxSize,newSum,startIdx,j) = arr.drop(a._3 +1).foldLeft((a._1,sum,a._2,a._3+1))((a1,b1) => {
          val newSum = sum + (if(b1 == 0) -1 else 1)
          if(newSum==0 && a1._1 < a1._4 - a._3 + 1){
            (a1._4 - a._3 + 1, 0, a._3, a1._4 +1)
          } else (a1._1,newSum,a1._3,a1._4+1)
        })
        (maxSize,startIdx,a._3+1)
      } else a
    })
    if(newMaxSize == -1){
      println(" No Such Array Exists")
    } else {
      println("Array Exist from "+ newStartIdx+ " to "+ (newStartIdx+newMaxSize-1))
    }
  }
  
  //def
}