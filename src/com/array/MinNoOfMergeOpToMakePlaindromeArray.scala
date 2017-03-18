package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MinNoOfMergeOpToMakePlaindromeArray {
  /*
   * http://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/ 
   * 
   * Given an array of positive integers. We need to make the given array a ‘Palindrome’. Only allowed operation on array is merge. 
   * Merging two adjacent elements means replacing them with their sum. The task is to find minimum number of merge operations required 
   * to make given array a ‘Palindrome’.
   */
  
  /*
   * 
   * Let f(i, j) be minimum merging operations to make subarray arr[i..j] a palindrome. If i == j answer is 0. 
   * We start i from 0 and j from n-1.
   * If arr[i] == arr[j], then there is no need to do any merging operations at index i or index j. Our answer in this case will 
   * be f(i+1, j-1).Else, we need to do merging operations. Following cases arise.
   * 		If arr[i] > arr[j], then we should do merging operation at index j. We merge index j-1 and j, and update 
   * 			arr[j-1] = arr[j-1] + arr[j]. Our answer in this case will be 1 + f(i, j-1).
   * 		For the case when arr[i] < arr[j], update arr[i+1] = arr[i+1] + arr[i]. Our answer in this case will be 1 + f(i+1, j).
   * Our answer will be f(0, n-1), where n is size of array arr[].
   * */
  
  def findMinOps(arr: Array[Int]) : Int = {
    val n = arr.length
    processArray(arr,0,n-1,0)
  }
  
  def processArray(arr: Array[Int],i:Int,j:Int,ans:Int) : Int = {
    if(i<=j) {
      if(arr(i) == arr(j)) {
        processArray(arr, i+1, j-1, ans)
      } else if(arr(i) > arr(j)) {
        arr(j-1) = arr(j-1) + arr(j)
        processArray(arr, i, j-1, ans+1)
      } else {
        arr(i+1) = arr(i+1) + arr(i)
        processArray(arr, i+1, j, ans+1)
      }
    } else ans
  }
}