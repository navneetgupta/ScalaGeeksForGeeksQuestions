package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Mar-2017
 */

object LongestSpanWithSameSum {
  /*
   * http://www.geeksforgeeks.org/longest-span-sum-two-binary-arrays/ 
   * 
   * Given two binary arrays arr1[] and arr2[] of same size n. Find length of the longest common span (i, j) where j >= i 
   * such that arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].
   * */
  
  /*
   * One by one by consider same subarrays of both arrays. For all subarrays, compute sums and if sums are same and current 
   * length is more than max length, then update max length.
   * Time Complexity: O(n2)	Auxiliary Space: O(1)
   */
  
  def longestSpanWithSameSum(arr1: Array[Int],arr2: Array[Int]):Int = {
    val n = arr1.length
    //i,maxLen
    arr1.foldLeft((0,0))((a,b) => {
      //j,sum1,sum2,maxLen
      val (j,sum1,sum2,maxLen) = arr1.zip(arr2).drop(a._1).foldLeft((a._1,0,0,a._2))((a1,b1) => {
        val newSum1 = a1._2+b1._1
        val newSum2 = a1._3+b1._2
        if(newSum1==newSum2) {
          val len = a1._1-a._1+1
          if(len>a1._4) (a1._1+1,newSum1,newSum2,len)
          else (a1._1+1,newSum1,newSum2,a1._4)
        } else (a1._1+1,newSum1,newSum2,a1._4)
      })
      (a._1+1,maxLen)
    })._2
  }
  
  /*
   * The idea is based on below observations.
   * Since there are total n elements, maximum sum is n for both arrays.
   * Difference between two sums varies from -n to n. So there are total 2n + 1 possible values of difference.
   * If differences between prefix sums of two arrays become same at two points, then subarrays between these two points have same sum.
   * 
   * Below is Complete Algorithm.

      1.	Create an auxiliary array of size 2n+1 to store starting points of all possible values of differences 
      		(Note that possible values of differences vary from -n to n, i.e., there are total 2n+1 possible values)
      2.	Initialize starting points of all differences as -1.
      3.	Initialize maxLen as 0 and prefix sums of both arrays as 0, preSum1 = 0, preSum2 = 0
      4.	Travers both arrays from i = 0 to n-1.
      		a.	Update prefix sums: preSum1 += arr1[i], preSum2 += arr2[i]
      		b.	Compute difference of current prefix sums: curr_diff = preSum1 – preSum2
      		c.	Find index in diff array: diffIndex = n + curr_diff // curr_diff can be negative and can go till -n
      		d.	If curr_diff is 0, then i+1 is maxLen so far
      		e.	Else If curr_diff is seen first time, i.e., starting point of current diff is -1, then update starting point as i
      		f.	Else (curr_diff is NOT seen first time), then consider i as ending point and find length of current same sum span. 
      				If this length is more, then update maxLen
      5.	Return maxLen
   * */
  def longestSpanWithSameSum2(arr1: Array[Int],arr2: Array[Int]): Int = {
    val n = arr1.length
    val diff = Array.fill(2*n+1){-1}
    //i,maxLen,preSum1,preSum2
    arr1.zip(arr2).foldLeft((0,0,0,0))((a,b) => {
      val newPreSum1 = a._3 + b._1
      val newPreSum2 = a._4 + b._2
      val currDiff = newPreSum1-newPreSum2
      val diffIdx = n + currDiff
      val newMaxLen = if(currDiff ==0) a._1+1
      else if(diff(diffIdx) == -1) {
        diff(diffIdx) = a._1
        a._2
      } else {
        val len = a._1 - diff(diffIdx)
        if(len > a._2)len else a._2
      }
      (a._1+1,newMaxLen,newPreSum1,newPreSum2)
    })._2
  }
  
}