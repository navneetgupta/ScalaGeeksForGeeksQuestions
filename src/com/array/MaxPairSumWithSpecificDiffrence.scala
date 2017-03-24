package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object MaxPairSumWithSpecificDiffrence {
  /*
   * http://www.geeksforgeeks.org/maximum-sum-pairs-specific-difference/
   * 
   * Given an array of integers and a number k. We can pair two number of array if difference between them is strictly less than k. 
   * The task is to find maximum possible sum of disjoint pairs. Sum of P pairs is sum of all 2P numbers of pairs.
   */
  
  /*
   * Time complexity : O(N Log N) Auxiliary Space : O(N)*/
  
  def maxPairSum(arr: Array[Int],d: Int): Int = {
    val sArr= arr.sorted
    val n =arr.length
    val dp = new Array[Int](n)
    dp(0) = 0
    for {
      i <- (1 to n-1)
    } yield {
      dp(i) = dp(i-1)
      if(sArr(i)-sArr(i-1) < d) {
        if(i >=2) dp(i) = dp(i) max (dp(i-2) + sArr(i) + sArr(i-1))
        else dp(i) = dp(i) max (sArr(i) + sArr(i-1))
      }
    }
    dp(n-1)
  }
  
  /*
   * */
  
  def maxPairSum2(arr: Array[Int],d: Int): Int = {
    val maxsum = 0
    val n = arr.length
    val sArr = arr.sorted
    processArr(sArr,n-1,d,0)
  }
  
  def processArr(arr: Array[Int],i:Int,d: Int,maxSum: Int) : Int = {
    if(i > 0) {
      if(arr(i)-arr(i-1) < d) {
        val nSum = maxSum + arr(i) + arr(i-1)
        processArr(arr, i-2, d, nSum)
      } else processArr(arr, i-1, d, maxSum)
    } else maxSum
  }
}