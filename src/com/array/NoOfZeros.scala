package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */

object NoOfZeros {
  /*
   * http://www.geeksforgeeks.org/find-number-zeroes/ 
   * Given an array of 1s and 0s which has all 1s first followed by all 0s. Find the number of 0s. Count the number of zeroes in the given array.
   * */
  
  /*
   * A simple solution is to traverse the input array. As soon as we find a 0, we return n – index of first 0. 
   * Here n is number of elements in input array. Time complexity of this solution would be O(n).*/
  
  /*
   * Since the input array is sorted, we can use Binary Search to find the first occurrence of 0. Once we have index of first element, 
   * we can return count as n – index of first zero.*/
  
  def firstZero(arr:Array[Int],start:Int,end :Int) : Int = {
    if(end >= start) {
      val mid = start + (end-start)/2
      if((mid == 0 || arr(mid-1) == 1) && arr(mid)==0)
        mid
      else if(arr(mid) ==1) firstZero(arr, mid+1, end)
      else firstZero(arr, start, mid-1)
    } else -1
  }
  
  def findNoOfZeros(arr: Array[Int]): Int = {
    val n = arr.length
    val first = firstZero(arr, 0, n-1)
    if(first == -1) 0
    else n-first
  }
}