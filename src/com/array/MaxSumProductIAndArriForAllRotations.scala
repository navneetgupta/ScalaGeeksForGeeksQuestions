package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Mar-2017
 */

object MaxSumProductIAndArriForAllRotations {
  /*
   * http://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/ 
   * */
  
  /*
   * Method 1 (Naive Solution : O(n2) )
   * A simple solution is to try all possible rotations. Compute sum of i*arr[i] for every rotation and return maximum sum.
   */
  
  def maxSum(arr: Array[Int]):Int = {
    val n = arr.length
    arr.foldLeft(Int.MinValue,0)((a,b) => {
      val curSum = ((0 until n) toList).foldLeft(0)((a1,b1) => {
        val indx = (a._2+b1)%n
        a1 + b1 * arr(indx)
      })
      (List(curSum,a._1).max,a._2+1)
    })._1
  }
  
  /*
   * The idea is to compute value of a rotation using value of previous rotation. When we rotate an array by one, 
   * following changes happen in sum of i*arr[i].
   * 1) Multiplier of arr[i-1] changes from 0 to n-1, i.e., arr[i-1] * (n-1) is added to current value.
   * 2) Multipliers of other terms is decremented by 1. i.e., (cum_sum – arr[i-1]) is subtracted from current value where cum_sum 
   * is sum of all numbers.*/
  
  def maxSum2(arr: Array[Int]): Int = {
    val n = arr.length
    val curSum = arr.foldLeft(0)(_+_)
    val curVal = arr.foldLeft(0,0)((a,b) => (a._1 + a._2*b,a._2+1))._1
    //res,curVal,idx
    arr.drop(1).foldLeft((curVal,curVal,1))((a,b) => {
      val nextVal = a._2 - (curSum - arr(a._3-1)) + arr(a._3-1) * (n-1)
       (List(a._1,nextVal).max,nextVal,a._3+1)
    })._1
  }
}