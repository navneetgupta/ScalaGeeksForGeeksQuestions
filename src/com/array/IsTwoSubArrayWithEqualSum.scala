package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object IsTwoSubArrayWithEqualSum {
  /*
   * http://www.geeksforgeeks.org/find-if-array-can-be-divided-into-two-subarrays-of-equal-sum/ 
   * 
   * Given an array of integers, find if it’s possible to remove exactly one integer from the array that divides the array 
   * into two subarrays with the same sum.
   * */
  
  /*
   * A naive solution would be to consider all elements of the array and calculate their left and right sum and return true if left 
   * and right sum are found to be equal. The time complexity of this solution would be O(n2).
   * 
   * The efficient solution involves calculating sum of all elements of the array in advance. Then for each element of the array 
   * we can calculate its right sum in O(1) time by using total sum of the array elements minus sum of elements found so far. 
   * The time complexity of this solution would be O(n) and auxiliary space used by it will be O(1).
   */
  
  def divideArray(arr: Array[Int]) : List[Int] = {
    val totalSum = arr.foldLeft(0)(_+_)
    processArr(arr,totalSum,0,0,Nil)
  }
  
  def processArr(arr: Array[Int],totalSum: Int,sumSoFar: Int,start: Int,xs: List[Int]): List[Int] = {
    if(start < arr.length) {
      if(2*sumSoFar + arr(start) == totalSum) {
        processArr(arr, totalSum, sumSoFar, start+1, start::xs)
      } else processArr(arr, totalSum, sumSoFar+arr(start), start+1, xs)
    } else xs
  }
}