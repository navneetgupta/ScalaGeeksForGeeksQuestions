package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object ReverseArrayInGroup {
  /*
   * http://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size/ 
   * 
   * Given an array, reverse every sub-array formed by consecutive k elements.
   * */
  
  /*
   * The idea is very simple. We consider every sub-array of size k starting from beginning of the array and reverse it. 
   * We need to handle some special cases. If k is not multiple of n where n is size of the array, for last group we will 
   * have less than k elements left, we need to reverse all remaining elements. If k = 1, array should remain unchanged. 
   * If k >= n, we reverse all elements present in the array.
   */
  
  def reverseInGroup(arr: Array[Int], k: Int): Array[Int] = {
    val n = arr.length
    ((0 until n-1 by k).toList).foldLeft(arr)((a,b) => {
      val right = List(b+k-1,n-1).min
      reverseBtoRight(arr,b,right)
    })
  }
  
  def reverseBtoRight(arr: Array[Int],left: Int, right: Int) : Array[Int] = {
    if(left < right) {
      val temp = arr(left)
      arr(left) = arr(right)
      arr(right) = temp
      reverseBtoRight(arr, left+1, right-1)
    } else arr
  }
}