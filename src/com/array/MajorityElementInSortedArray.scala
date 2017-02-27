package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object MajorityElementInSortedArray {
  /*
   * http://www.geeksforgeeks.org/check-for-majority-element-in-a-sorted-array/ 
   * 
   * METHOD 1 (Using Linear Search)
   * Linearly search for the first occurrence of the element, once you find it (let at index i), check element at index i + n/2. 
   * If element is present at i+n/2 then return 1 else return 0.
   * 
   * METHOD 2 (Using Binary Search)
   * Use binary search methodology to find the first occurrence of the given number. The criteria for binary search is important here.
   * */
  
  //Method:1
  def majorityElement[A](arr: Array[A],x:A) : Boolean = {
    val n = arr.length
    val last_index = if (n%2 == 0) (n/2+1) else (n/2) 
    println("last_index " +last_index)
    val xs = for {
      i <- (0 until last_index)
      if(arr(i) ==x && arr(i+n/2-1) == x)
    } yield(true)
    if(xs.isEmpty) false 
    else true
  }
  
  //Method 2::
  def majorityElement2[A](arr: Array[Int], x: Int): Boolean = {
    val n = arr.length
    val idx = binarySearch(arr, 0, n-1, x)
    if(idx == -1) false
    else {
      if(((idx+n/2) <= (n-1)) && arr(idx + n/2) ==x) true
      else false
    }
  }
  
  def binarySearch(arr: Array[Int],low: Int,high: Int,x: Int) : Int = {
    if(high >= low) {
      val mid = (high+low)/2
      if((mid == 0 || x > arr(mid-1)) && (arr(mid) == x)) mid
      else if(x > arr(mid)) binarySearch(arr, mid+1, high, x)
      else binarySearch(arr, low, mid-1, x)
    } else -1
  }
  
}