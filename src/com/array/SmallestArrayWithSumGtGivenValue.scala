package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */

object SmallestArrayWithSumGtGivenValue {
  /*
   * http://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
   *  
   * A simple solution is to use two nested loops. The outer loop picks a starting element, the inner loop considers all 
   * elements (on right side of current start) as ending element. Whenever sum of elements between current start and end 
   * becomes more than the given number, update the result if current length is smaller than the smallest length so far.
   * Time complexity of the above approach is clearly O(n2).
   * */
  
  def smallestArrayLength(arr: Array[Int],sum:Int) : Int = {
    val n = arr.length
    processArray(arr,sum,0,n+1,n)
  }
  
  @tailrec
  def processArray(arr: Array[Int],sum:Int,start:Int,minLen: Int,n:Int) : Int = {
    if(start < n) {
      val currSum = arr(start)
      if(currSum>sum)
        1
      else {
        //currSum,minLen,idx
        val minL = arr.drop(start+1).foldLeft((currSum,minLen,start+1))((a,b) => {
          val newCurrSum = a._1 +b
          if(newCurrSum>sum && (a._3-start+1) < a._2) (newCurrSum,(a._3-start+1),a._3+1)
          else (newCurrSum,a._2,a._3+1)
        })._2
        processArray(arr, sum, start+1, minL, n)
      }
    } else {
      minLen
    }
  }
  
  /*O(n) soln*/
  
  def smallestArrayLength2(arr: Array[Int],sum :Int):Int = {
    processArray2(arr,sum,arr.length,0,0,0,arr.length+1)
  }
  
  def processArray2(arr: Array[Int],sum :Int,n:Int,start:Int,end:Int,currSum:Int,minLen:Int) :Int = {
    if(end < n) {
      val (newCurrSum,newEndIdx) = getCurrSumAndEndIndx(arr,currSum,end,sum,n)
      val (newMinLen,nStart,nCurrSum) = getDetails(arr, newCurrSum, sum, n, start, newEndIdx, minLen)
      processArray2(arr, sum, n, nStart, newEndIdx, nCurrSum, newMinLen)
    } else minLen
  }
  
  @tailrec
  def getCurrSumAndEndIndx(arr:Array[Int],currSum:Int,end:Int,sum:Int,n:Int) : (Int,Int) = {
    if(currSum <= sum && end < n) getCurrSumAndEndIndx(arr, currSum+arr(end), end+1, sum, n)
    else (currSum,end)
  }
  
  @tailrec
  def getDetails(arr: Array[Int],currSum :Int,sum:Int,n:Int,start:Int,end:Int,minLen:Int) : (Int,Int,Int) = {
    if(currSum > sum && start < n) {
      val nwMinLen = if(end-start < minLen) end-start else minLen
      getDetails(arr, currSum-arr(start), sum, n, start+1, end, nwMinLen)
    } else {
      (minLen,start,currSum)
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
}