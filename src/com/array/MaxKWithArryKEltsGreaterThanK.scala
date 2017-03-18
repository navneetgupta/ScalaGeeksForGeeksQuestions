package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MaxKWithArryKEltsGreaterThanK {
  /*
   * http://www.geeksforgeeks.org/maximum-value-k-such-that-array-has-at-least-k-elements-that-are-k/ 
   * 
   * Given an array of positive integers, find maximum possible value K such that the array has at-least K elements that are 
   * greater than or equal to K. The array is unsorted and may contain duplicate values.
   * */
  
  /*
   * Method 1 [Simple : O(n2) time]
   * Let size of input array be n. Let us consider following important observations.
   * The maximum possible value of result can be n. We get the maximum possible value when all elements are greater than or equal to n.
   * For example, if input array is {10, 20, 30}, n is 3. The value of result can’t be greater than 3.
   * The minimum possible value would be 1. An example case when get this output is, when all elements are 1.
   * */
  
  def findMaxNumK(arr: Array[Int]) : Int = {
    processArray(arr,arr.length)
  }
  
  def processArray(arr: Array[Int],start: Int) : Int = {
    if(start >= 1) {
      //count,idx
      val count = arr.foldLeft(0)((a,b) => {
        if(start <= b) a+1
        else a
      })
      if(count>= start) start else processArray(arr, start-1)
    } else 1
  }
  
  /*
   * Method 2 [Efficient : O(n) time and O(n) extra space]
   * 1) The idea is to construct axillary array of size n + 1, and use that array to find count of greater elements in input array. 
   * Let the auxiliary array be freq[]. We initialize all elements of this array as 0.
   * 2) We process all input elements.
        a) If an element arr[i] is less than n, then we increment its frequency, i.e., we do freq[arr[i]]++.
        b) Else we increment freq[n].
   * 3) After step 2 we have two things.
        a) Frequencies of elements for elements smaller than n stored in freq[0..n-1].
        b) Count of elements greater than n stored in freq[n].
   * Finally, we process the freq[] array backwards to find the output by keeping sum of the values processed so far.
   */
  
  def findMaxNum2(arr: Array[Int]): Int = {
    val n = arr.length
    val freq = Array.fill(n+1) {0}
//    for {
//      i <- (0 to n-1)
//    } yield {
//      if(arr(i) < n) freq(arr(i)) = freq(arr(i))+1
//      else freq(n) = freq(n) +1
//    }
    arr.foldLeft(0)((a,b) => {
      if(b < n) {
        freq(b) = freq(b) + 1; 
        a+1
      }
      else {
        freq(n) = freq(n)+1
        a+1
      }
    })
    processAuxArray(freq,n,0)
  }
  
  def processAuxArray(arr: Array[Int],start: Int,sum: Int): Int = {
    if(start > 0) {
      val nSum = sum + arr(start)
      if(nSum >= start) start 
      else processAuxArray(arr, start-1, nSum)
    } else -1
  }
}