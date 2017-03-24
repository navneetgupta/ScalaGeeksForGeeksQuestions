package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object MaximiseArrSumAfterKNegationsSet1 {
  /*
   * http://www.geeksforgeeks.org/maximize-array-sun-after-k-negation-operations/ 
   * Given an array of size n and a number k. We must modify array K number of times. Here modify array means in each operation we 
   * can replace any array element arr[i] by -arr[i]. We need to perform this operation in such a way that after K operations, 
   * sum of array must be maximum?
   */
  
  /*
   * his problem has very simple solution, we just have to replace the minimum element arr[i] in array by -arr[i] for current operation. 
   * In this way we can make sum of array maximum after K operations. Once interesting case is, once minimum element becomes 0, we don’t
   * need to make any more changes.
   */
  
  def maxSum(arr: Array[Int], k: Int) : Int = {
    ((1 to k) toList).takeWhile { x => 
      val (min,idx) = processArr(arr)
      if(min == 0) false
      else {
        arr(idx) = -arr(idx)
        true
      }
    }
    arr.foldLeft(0)(_+_)
  }
  
  def processArr(arr: Array[Int]) : (Int,Int) = {
    val as = arr.foldLeft((Int.MaxValue,-1,0))((a,b) => {
      if(b< a._1)(b,a._3,a._3+1) else (a._1,a._2,a._3+1)
    })
    (as._1,as._2)
  }
}