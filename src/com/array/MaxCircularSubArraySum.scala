package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object MaxCircularSubArraySum {
  /*
   * http://www.geeksforgeeks.org/maximum-contiguous-circular-sum/ 
   * 
   * Given n numbers (both +ve and -ve), arranged in a circle, fnd the maximum sum of consecutive number.
   */
  
  def maxCircularSum(arr: Array[Int]): Int = {
    val n = arr.length
    val max_kadne = kadane(arr)
    //max_wrap,idx
    //to avoid idx passage in each call we can also use arr.view.zipwithIndex b will be a tupel with (arr(i),i)
    val max_wrap = arr.foldLeft((0,0))((a,b) => {
      arr(a._2) = -arr(a._2)
      (a._1+b,a._2+1)
    })._1+kadane(arr)
    if(max_wrap>max_kadne) max_wrap else max_kadne
  }
  
  def kadane(arr: Array[Int]) : Int = {
    val n = arr.length
    arr.foldLeft((0,0))((a,b) => {
      val newMax_ending_here = if(a._2+b < 0) 0 else a._2+b 
      if(a._1 < newMax_ending_here) (newMax_ending_here,newMax_ending_here)
      else (a._1,newMax_ending_here)
    })._1
  }
}