package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object MaxmiseZerosBySinglSubArrayflip {
  /*
   * http://www.geeksforgeeks.org/maximize-number-0s-flipping-subarray/ 
   * 
   * Given a binary array, find the maximum number zeros in an array with one flip of a subarray allowed. A flip operation switches
   * all 0s to 1s and 1s to 0s.
   * */
  
  /*
   * Method 1 (Simple : O(n2))
   * A simple solution is to consider all subarrays and find a subarray with maximum value of (count of 1s) – (count of 0s). 
   * Let this value be max_diff. Finally return count of zeros in original array plus max_diff.
   * */
   def maxZeros(arr: Array[Int]): Int = {
     val (maxDiff,origZeroCount,idx) = arr.foldLeft((0,0,0))((a,b) => {
       val newOrigZerosCont = if(b == 0) a._2+1 else a._2
       val (newMaxDiff,newC0s,newC1s) = arr.drop(a._3).foldLeft((a._1,0,0))((a1,b1) => {
         val (c0s,c1s) = if(b1 ==1) (a1._2,a1._3+1) else (a1._2+1,a1._3)
         (List(a1._1,(c1s-c0s)).max,c0s,c1s)
       })
       (newMaxDiff,newOrigZerosCont,a._3+1)
     })
     maxDiff +origZeroCount
   }
   
   /*
    * This problem can be reduced to largest subarray sum problem. The idea is to consider every 0 as -1 and every 1 as 1, 
    * find the sum of largest subarray sum in this modified array. This sum is our required max_diff ( count of 0s – count 
    * of 1s in any subarray). Finally we return the max_diff plus count of zeros in original array.
    */
   
   def maxZeros2(arr: Array[Int]): Int = {
     val (origZeroCount,maxDiff,currMax) = arr.foldLeft((0,0,0))((a,b) => {
       val nOZCnt = if(b==0)a._1+1 else a._1
       val v = if(b == 1) 1 else -1
       (nOZCnt,List(a._2,List(v,a._3+v).max).max,List(v,a._3+v).max)
     })
     val newMaxDiff = 0 max maxDiff
     newMaxDiff + origZeroCount
   }
}