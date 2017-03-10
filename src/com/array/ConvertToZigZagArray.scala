package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object ConvertToZigZagArray {
  /*
   * http://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/ 
   * 
   * Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. 
   * The converted array should be in form a < b > c < d > e < f.
   */
  
  /*
   * A Simple Solution is to first sort the array. After sorting, exclude the first element, swap the remaining elements in pairs. 
   * (i.e. keep arr[0] as it is, swap arr[1] and arr[2], swap arr[3] and arr[4], and so on). Time complexity is O(nlogn) since we 
   * need to sort the array first.
   */
  
  /*
   * We can convert in O(n) time using an Efficient Approach. The idea is to use modified one pass of bubble sort. 
   * Maintain a flag for representing which order(i.e. < or >) currently we need. If the current two elements are not in that order then 
   * swap those elements otherwise not.
   */
  
  def zigZag(arr: Array[Int]): Array[Int] = {
    zigZagUtil(arr, true, 0, arr.length)
  }
  
  def zigZagUtil(arr: Array[Int],flag:Boolean,i:Int,n:Int) : Array[Int]= {
    if(i < n-1) {
      val newArr = if(flag && arr(i)> arr(i+1)) {
                    swap(arr,i,i+1)
                  } else if(!flag && arr(i) < arr(i+1)) {
                    swap(arr,i,i+1)
                  } else arr
      zigZagUtil(newArr, !flag, i+1, n)
    } else arr
      
  }
  
  def swap(arr: Array[Int],i:Int,j:Int): Array[Int] = {
    val temp  = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
    arr
  }
}