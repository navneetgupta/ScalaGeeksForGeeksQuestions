package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 02-Mar-2017
 */

object MaxLengthBitonicSubArray {
  /*
   * http://www.geeksforgeeks.org/maximum-length-bitonic-subarray/ 
   * 
   * Given an array A[0 … n-1] containing n positive integers, a subarray A[i … j] is bitonic if there is a k with i <= k <= j 
   * such that A[i] <= A[i + 1] ... <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j]. 
   */
  
  /*
   * 1) Construct an auxiliary array inc[] from left to right such that inc[i] contains length of the nondecreaing subarray ending at arr[i].
   * 		For for A[] = {12, 4, 78, 90, 45, 23}, inc[] is {1, 1, 2, 3, 1, 1}
   * 2) Construct another array dec[] from right to left such that dec[i] contains length of nonincreasing subarray starting at arr[i].
   * 		For A[] = {12, 4, 78, 90, 45, 23}, dec[] is {2, 1, 1, 3, 2, 1}.
   * 3) Once we have the inc[] and dec[] arrays, all we need to do is find the maximum value of (inc[i] + dec[i] – 1).
   * 		For {12, 4, 78, 90, 45, 23}, the max value of (inc[i] + dec[i] – 1) is 5 for i = 3.
   * */
  def maxLengthBitonicSubArray(arr: Array[Int], n: Int): Int = {
    val inc = new Array[Int](n)
    inc(0) = 1
    val dec = new Array[Int](n)
    dec(n-1) = 1
    
    for {
      i <- (1 to n-1)
    } yield {
      inc(i) = if(arr(i)>arr(i-1)) inc(i-1)+1 else 1
    }
    for {
      j <- (n-2 to 0 by -1)
    } yield {
      dec(j) = if(arr(j)>arr(j+1)) dec(j+1)+1 else 1
    }
    inc.zip(dec).foldLeft(inc(0)+dec(0)-1)((a,b) => if(b._1+b._2-1 > a ) (b._1+b._2-1) else a)
  } 
}