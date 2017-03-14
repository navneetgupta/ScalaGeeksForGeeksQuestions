package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object SubArrayWithLeasetAverage {
  /*
   * http://www.geeksforgeeks.org/find-subarray-least-average/ 
   * */
  
  /*
   * A Simple Solution is to consider every element as beginning of subarray of size k and compute sum of subarray 
   * starting with this element. Time complexity of this solution is O(nk).
   * */
  
  /*
   * An Efficient Solution is to solve the above problem in O(n) time and O(1) extra space. The idea is to use sliding window of size k. Keep track of sum of current k elements. To compute sum of current window, remove first element of previous window and add current element (last element of current window).

      1) Initialize res_index = 0 // Beginning of result index
      2) Find sum of first k elements. Let this sum be 'curr_sum'
      3) Initialize min_sum = sum
      4) Iterate from (k+1)'th to n'th element, do following
         for every element arr[i]
            a) curr_sum = curr_sum + arr[i] - arr[i-k]
            b) If curr_sum < min_sum
                 res_index = (i-k+1)
      5) Print res_index and res_index+k-1 as beginning and ending
   indexes of resultant subarray.
   * */
  
  def findMinAvgSubArray(arr: Array[Int],k:Int) : List[Int] = {
    val n = arr.length
    if(n<k) {
      Nil
    } else {
      val currSum = arr.foldLeft(0)((a,b) => a+b)
      //k,minSum,currSum,resIdx
      val (idx,minSum,nCurrSum,resIdx) = arr.drop(k).foldLeft((k,currSum,currSum,0))((a,b) => {
        val newCurrSum = a._3 + b - arr(a._1-k)
        if(newCurrSum < a._2)(a._1+1,newCurrSum,newCurrSum,a._1-k+1)
        else (a._1+1,a._2,newCurrSum,a._4)
      })
      List(resIdx,resIdx+k-1)
    }
  }
}