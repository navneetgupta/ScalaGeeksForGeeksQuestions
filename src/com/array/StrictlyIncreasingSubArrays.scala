package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object StrictlyIncreasingSubArrays {
  /*
   * http://www.geeksforgeeks.org/count-strictly-increasing-subarrays/
   * Given an array of integers, count number of subarrays (of size more than one) that are strictly increasing.
   * */
  
  /*
   * A Simple Solution is to generate all possible subarrays, and for every subarray check if subarray is strictly increasing or not. 
   * Worst case time complexity of this solution would be O(n3).
   * 
   * A Better Solution is to use the fact that if subarray arr[i:j] is not strictly increasing, then subarrays arr[i:j+1],
   * arr[i:j+2], .. arr[i:n-1] cannot be strictly increasing.
   * */
  
  def countSISubArrays(arr: Array[Int]) : Int = {
    //count,i
    arr.foldLeft((0,0))((a,b) => {
      val newCount = getSuitabeLengthArray(arr,a._2+1,arr.length,a._1)
      (newCount,a._2+1)
    })._1
  }
  
  def getSuitabeLengthArray(arr: Array[Int],start: Int, end: Int,count: Int) : Int = {
    if(start < end && arr(start) > arr(start-1)) {
      getSuitabeLengthArray(arr, start+1, end, count+1)
    } else count
  }
  
  /* 
   * Efficient:
   * can count subarrays in O(n) time. The idea is based on fact that a sorted subarray of length ‘len’ adds len*(len-1)/2 to result.
   * */
  
  def countSISubArrays2(arr: Array[Int]) : Int = {
    //count,len,i
    val (count,len,i) = arr.dropRight(1).foldLeft((0,1,0))((a,b) => {
      if(arr(a._3+1) > b) (a._1,a._2+1,a._3+1)
      else {
        val newCnt = a._1 + (((a._2-1)*a._2)/2)
        (newCnt,1,a._3+1)
      }
    })
    if(len > 1) {
      count + (((len-1)*len)/2)
    } else count
  }
}