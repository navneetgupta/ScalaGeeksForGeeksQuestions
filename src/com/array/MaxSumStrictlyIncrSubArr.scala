package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object MaxSumStrictlyIncrSubArr {
  /*
   * http://www.geeksforgeeks.org/find-maximum-sum-strictly-increasing-subarray/ 
   * Given an array of positive integers. Find the maximum sum of strictly increasing subarrays. 
   * */
  
  /*
   * A Simple Solution is to generate all possible subarrays, and for every subarray check if subarray is strictly increasing or not. 
   * If subarray is strictly increasing, then we calculate sum & update max_sum. Time complexity O(n2).
   * */
  
  /*
   * An efficient solution of this problem take O(n) time. The idea is keep track of maximum sum and current sum. For every element 
   * arr[i], if it is greater than arr[i-1], then we add it to current sum. Else arr[i] is starting point of another potential candidate 
   * for maximum sum increasing subarray, so we update current sum as array. But before updating current sum, we update maximum sum if 
   * required.*/
  
  def maxSum_SIS(arr: Array[Int]) : Int = {
    val (maxSum,currSum,idx) = arr.drop(1).foldLeft((0,arr(0),0))((a,b) => {
      if(arr(a._3) < b)(a._1,a._2+b,a._3+1)
      else (a._1 max a._2,b,a._3+1)
    })
    maxSum max currSum
  }
}