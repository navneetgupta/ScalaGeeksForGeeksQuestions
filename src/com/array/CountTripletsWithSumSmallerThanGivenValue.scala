package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object CountTripletsWithSumSmallerThanGivenValue {
  /*
   * http://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
   * 
   * Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value. Expected Time Complexity is O(n2). 
   */
  
  /*
   * Method 1 (Naive)
   * A simple method is to generate all possible triplets and compare the sum of every triplet with the given value. 
   * The following code implements this simple method using three nested loops.
   * */
  
  def findNoOfTriplet(arr: Array[Int],sum : Int) : (IndexedSeq[List[Int]],Boolean,Int) = {
    val n = arr.length
    val as = for {
      i <- (0 until n-2 )
      j <- (i+1 until n-1)
      k <- (j+1 until n)
      if(arr(i)+arr(j)+arr(k) < sum)
    } yield {
      List(arr(i),arr(j),arr(k))
    }
    if(as.length > 0) (as,true,as.length)
    else (IndexedSeq(Nil),false,0)
  }
  
  /*
   * 1) Sort the input array in increasing order.
      2) Initialize result as 0.
      3) Run a loop from i = 0 to n-2.  An iteration of this loop finds all
         triplets with arr[i] as first element.
           a) Initialize other two elements as corner elements of subarray
              arr[i+1..n-1], i.e., j = i+1 and k = n-1
           b) Move j and k toward each other until they meet, i.e., while (j < k)
                  (i) if (arr[i] + arr[j] + arr[k] >= sum), then do k--
      
                  // Else for current i and j, there can (k-j) possible third elements
                  // that satisfy the constraint.
                  (ii) Else Do ans += (k - j) followed by j++
   */
  
  def findNoOfTriplet2(arr: Array[Int],sum: Int): Int = {
    val n = arr.length
    val sortedArray = arr.sorted
    processArray(sortedArray, 0, sum, n,0)
  }
  
  def processArray(arr:Array[Int],idx: Int,sum:Int,n:Int,count:Int): Int = {
    if(idx < n-2) {
      val nCount = processSubArray(arr, idx, idx+1,n-1, sum,count)
      processArray(arr, idx+1, sum, n,nCount)
    } else {
      count
    }
  }
  
  @tailrec
  def processSubArray(arr: Array[Int],i: Int, j: Int,k :Int,sum: Int,count:Int ) : Int = {
    if(j < k) {
      if(arr(i)+arr(j)+arr(k) >= sum) {
        processSubArray(arr, i, j, k-1, sum, count)
      } else {
        processSubArray(arr, i,j+1, k, sum,count+k-j)
      }
    } else {
      count
    }
  }
}