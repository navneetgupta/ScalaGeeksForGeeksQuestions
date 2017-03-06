package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Mar-2017
 */

object Replace0To1ToGetMaxContinuous1SSeries {
  /*
   * http://www.geeksforgeeks.org/find-index-0-replaced-1-get-longest-continuous-sequence-1s-binary-array/ 
   * */
  
  /* A Simple Solution is to traverse the array, for every 0, count the number of 1s on both sides of it. Keep track of maximum 
   * count for any 0. Finally return index of the 0 with maximum number of 1s around it. The time complexity of this solution is O(n2).
   * */
  
  /*
   * Using an Efficient Solution, the problem can solved in O(n) time. The idea is to keep track of three indexes, current index (curr), 
   * previous zero index (prev_zero) and previous to previous zero index (prev_prev_zero). Traverse the array, if current element is 0, 
   * calculate the difference between curr and prev_prev_zero (This difference minus one is the number of 1s around the prev_zero). 
   * If the difference between curr and prev_prev_zero is more than maximum so far, then update the maximum. Finally return index of 
   * the prev_zero with maximum difference.
   * */
  
  def maxOnesIndex(arr:Array[Int]):Int = {
    val n = arr.length
    //(maxCount,maxIdx,prevZero,prevPrevZero,idx)
    
    val res = arr.foldLeft((0,0,-1,-1,0))((a,b) => {
      if(b == 0){
        val (nMaxCount,nMaxIdx) = if(a._5 - a._4 > a._1) (a._5 - a._4,a._3) else (a._1,a._2)
        (nMaxCount,nMaxIdx,a._5,a._3,a._5+1)
      } else {
        (a._1,a._2,a._3,a._4,a._5+1)
      }
    })
    if(n - res._4 > res._1) res._3 else res._2
    
  }
}