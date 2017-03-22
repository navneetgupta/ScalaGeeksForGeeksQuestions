package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object MaxProductSubArraySet2 {
  /*
   * http://www.geeksforgeeks.org/maximum-product-subarray-set-2-using-two-traversals/ 
   * Given an array that contains both positive and negative integers, find the product of the maximum product subarray. 
   * Expected Time complexity is O(n) and only O(1) extra space can be used. 
   * */
  
  /*
   * The idea is based on the fact that overall maximum product is maximum of following two:
   * Maximum product in left to right traversal.
   * Maximum product in right to left traversal
   * 
   * One important thing is to handle 0’s. We need to compute fresh forward (or backward) sum whenever we see 0.
   * */
  
  def maxProductSubArray(arr: Array[Int]):Int = {
    //max_fwd,max_till_now
    val (max_fwd,max_till_now) = arr.foldLeft(Int.MinValue,1)((a,b) => {
      val newMaxTillNow = a._2*b
      if(newMaxTillNow==0) {
        (a._1,1)
      } else if(a._1 < newMaxTillNow){
        (newMaxTillNow,newMaxTillNow)
      } else (a._1,newMaxTillNow)
    })
    val (max_bkw,max_till_now1) = arr.foldRight(Int.MinValue,1)((b,a) => {
      val newMaxTillNow = a._2*b
      if(newMaxTillNow==0) {
        (a._1,1)
      } else if(a._1 < newMaxTillNow){
        (newMaxTillNow,newMaxTillNow)
      } else (a._1,newMaxTillNow)
    })
    List(max_bkw,max_fwd,0).max
  }
}