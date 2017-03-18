package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object FreqOfEachEltInLimitedRangeArray {
  /*
   * http://www.geeksforgeeks.org/find-frequency-of-each-element-in-a-limited-range-array-in-less-than-on-time/ 
   * 
   * Given an sorted array of positive integers, count number of occurrences for each element in the array. 
   * Assume all elements in the array are less than some constant M.
   * */
  
  /*
   * Method 1 (Linear Search)
   * The idea is traverse the input array and for each distinct element of array, store its frequency in a map and finally print the map. 
   * This approach takes O(n) time.
   * 
   * Method 2 (Use Binary Search)
   * This problem can be solved in less than O(n) using a modified binary search. The idea is to recursively divide the array into
   * two equal subarrays if its end elements are different. If both its end elements are same, that means that all elements in 
   * the subarray is also same as the array is already sorted. We then simply increment the count of the element by size of the subarray.
   * The time complexity of above approach is O(m log n), where m is number of distinct elements in the array of size n. 
   * Since m <= M (a constant), the time complexity of this solution is O(log n).
   */
  
  def findFreq(arr: Array[Int]):Unit = {
    val n = arr.length
    // create a empty vector to store frequencies and initialize it by 0. Size of vector is 
    // maximum value (which is last value in sorted array) plus 1.
    val  freq = Array.fill(arr(n - 1) + 1){0};
    val nFreq = findFreqUtil(arr,0,n-1,freq)
    
    for{
      i <- (0 to arr(n-1))
      if(freq(i) !=0)
    } yield {
      println(" Element " + i + " occurs " + freq(i) + " times.")
    }
  }
  
  def findFreqUtil(arr: Array[Int],low:Int,high:Int,freq: Array[Int]): Array[Int] = {
    if(arr(low) == arr(high)) { 
      freq(arr(low)) = freq(arr(low))+ high - low +1;freq
    } else {
      val mid = (low+high)/2
      val newFreq = findFreqUtil(arr, low, mid, freq)
      findFreqUtil(arr, mid+1, high, newFreq)
    }
  }
}