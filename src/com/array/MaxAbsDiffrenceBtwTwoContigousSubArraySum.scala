package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MaxAbsDiffrenceBtwTwoContigousSubArraySum {
  
  /*
   * http://www.geeksforgeeks.org/maximum-absolute-difference-between-sum-of-two-contiguous-sub-arrays/ 
   * */
  
  def maxLeftSubArraySum(arr: Array[Int],sum: Array[Int]) : Array[Int] = {
    sum(0) = arr(0)
    //max_so_far,curr_max,idx
    arr.drop(1).foldLeft((arr(0),arr(0),1))((a,b) => {
      val nCuMx = List(b,a._2+b).max
      val nMxSoFr = List(a._1,nCuMx).max
      sum(a._3) = nMxSoFr
      (nMxSoFr,nCuMx,a._3+1)
    })
    sum
  }
  
  def maxRightSubArraySum(arr: Array[Int],sum: Array[Int]) : Array[Int] = {
    val n = arr.length
    sum(n-1) = arr(n-1)
    //max_so_far,curr_max,idx
    arr.dropRight(1).foldRight((arr(n-1),arr(n-1),n-2))((b,a) => {
      val nCuMx = List(b,a._2+b).max
      val nMxSoFr = List(a._1,nCuMx).max
      sum(a._3) = nMxSoFr
      (nMxSoFr,nCuMx,a._3-1)
    })
    sum
  }
  
  def findMaxAbsDiff(arr: Array[Int]):Int = {
    val n = arr.length
    val leftMax = maxLeftSubArraySum(arr, new Array[Int](n))
    val rightMax = maxRightSubArraySum(arr, new Array[Int](n))
    val invertedArr = new Array[Int](n)
    arr.foldLeft(0)((a,b) => {invertedArr(a) = -b;a+1})
    
    val leftMin = maxLeftSubArraySum(invertedArr, new Array[Int](n))
    leftMin.foldLeft(0)((a,b) => {leftMin(a) = -b;a+1})
    val rightMin = maxRightSubArraySum(invertedArr, new Array[Int](n))
    rightMin.foldLeft(0)((a,b) => {rightMin(a) = -b;a+1})
    
    ((0 until n-1) toList).foldLeft(Int.MinValue)((a,b) => {
      val absVal = List(math.abs(leftMax(b)-rightMin(b+1)),math.abs(leftMin(b)-rightMax(b+1))).max
      if(absVal > a)absVal else a
    })
    
  }
  
}