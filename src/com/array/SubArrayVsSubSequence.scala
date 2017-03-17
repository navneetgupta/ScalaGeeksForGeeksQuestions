package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object SubArrayVsSubSequence {
  /*
   * http://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/ 
   * */
  
  /* Sub Arrays
   * A subbarray is a contiguous part of array. An array that is inside another array. 
   * In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/subsrings.
   * */
  def subArray(arr: Array[Int]) : Unit = {
    val n = arr.length
    for {
      i <- (0 until n)
      j <- (i until n)
    } yield {
      for {
        k <- (i to j)
      } yield {
        print(arr(k) + ", ")
      }
      println("")
    }
  }
  
  /* Sub Sequence
   * A subsequence is a sequence that can be derived from another sequence by zero or more elements, without changing the 
   * order of the remaining elements.
   * More generally, we can say that for a sequence of size n, we can have (2n-1) non-empty sub-sequences in total.
   *  */
  def subSequence(arr: Array[Int]): Unit = {
    val optSize:Int = math.pow(2,arr.length).toInt
    for {
      i <- (1 until optSize)
    } yield {
      for {
        j <- (0 until arr.length)
        if((i & (1<<j))!=0)
      } yield {
        print(arr(j) + " ,")
      }
      println(" ")
    }
  }
}