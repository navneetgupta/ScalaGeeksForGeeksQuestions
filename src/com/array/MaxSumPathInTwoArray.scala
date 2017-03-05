package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */


object MaxSumPathInTwoArray {
  /* 
   * http://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/ 
   * 
   * Given two sorted arrays such the arrays may have some common elements. Find the sum of the maximum sum path to reach from 
   * beginning of any array to end of any of the two arrays. We can switch from one array to another array only at common elements.
   * Expected time complexity is O(m+n) where m is the number of elements in ar1[] and n is the number of elements in ar2[].
   * */
  
  /*
   * 
   * The idea is to do something similar to merge process of merge sort. We need to calculate sums of elements between all common points for both arrays. Whenever we see a common point, we compare the two sums and add the maximum of two to the result. Following are detailed steps.

      1) Initialize result as 0. Also initialize two variables sum1 and sum2 as 0. Here sum1 and sum2 are used to store sum of element in ar1[] and ar2[] respectively. These sums are between two common points.
      
      2) Now run a loop to traverse elements of both arrays. While traversing compare current elements of ar1[] and ar2[].
      
          2.a) If current element of ar1[] is smaller than current element of ar2[], then update sum1, else if current element of ar2[] is smaller, then update sum2.
      
          2.b) If current element of ar1[] and ar2[] are same, then take the maximum of sum1 and sum2 and add it to the result. Also add the common element to the result.
          
    * */
  
  def maxSumPath(arr1: Array[Int],arr2: Array[Int]):Int = {
    val m = arr1.length
    val n = arr2.length
    val (i,j,result,sum1,sum2) = processArray(arr1, arr2, 0, 0, m, n, 0, 0, 0)
    val newSum1 = processRemainingArray(arr1, m, i, sum1)
    val newSum2 = processRemainingArray(arr2, n, j, sum2)
    result + List(newSum1,newSum2).max
  }
  
  
  def processArray(arr1: Array[Int],arr2: Array[Int],i:Int,j:Int,m:Int,n:Int,sum1:Int,sum2:Int,result:Int): (Int,Int,Int,Int,Int) = {
    if(i<m && j < n) {
      if(arr1(i) < arr2(j)) processArray(arr1, arr2, i+1, j, m, n, sum1+arr1(i), sum2, result)
      else if(arr1(i) > arr2(j)) processArray(arr1, arr2, i, j+1, m, n, sum1, sum2+arr2(j), result)
      else {
        val newresult = result + List(sum1,sum2).max
        val (nI,nJ,nResult) = getIJAndResult(arr1, arr2, i, j, m, n, newresult)
        processArray(arr1, arr2, nI, nJ, m, n, 0, 0, nResult)
      }
    } else (i,j,result,sum1,sum2)
  }

	@tailrec
	def getIJAndResult(arr1: Array[Int],arr2: Array[Int],i:Int,j:Int,m:Int,n:Int,result:Int) : (Int,Int,Int) = {
	  if(i<m && j < n && arr1(i) == arr2(j)) {
	    getIJAndResult(arr1, arr2, i+1, j+1, m, n, result+arr1(i))
	  } else (i,j,result)
	}
	
	@tailrec
	def processRemainingArray(arr: Array[Int],size:Int,i:Int,sum:Int) : Int = {
	  if(i < size) {
	    processRemainingArray(arr, size, i+1, sum+arr(i))
	  } else sum
	}
}