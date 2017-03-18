package com.array

import scala.annotation.tailrec


/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object PairsFromDistinctEltSubArray {
  /*
   * http://www.geeksforgeeks.org/count-all-distinct-pairs-formed-by-contiguous-sub-array/ 
   * 
   * Given an array, count number of pairs that can be formed from all possible contiguous sub-arrays containing distinct numbers. 
   * The array contains positive numbers between 0 to n-1  
   * 
   * */
  
  /*
   * The idea is to use Sliding Window for the given array. Let us use a window covering from index left to index right and an 
   * Boolean array visited to mark elements in current window. The window invariant is that all elements inside the window are distinct. 
   * We keep on expanding the window to the right and if a duplicate is found, we shrink the window from left till all elements are 
   * distinct again. We update the count of pairs in current window along the way. An observation showed that in an expanding window, 
   * number of pairs can be incremented by value equal to window size – 1.
   */
  
  def countPairs(arr: Array[Int]) : Int = {
    val n = arr.length
    val visited  = Array.fill(n){false}
    processArry(arr, 0, 0, n, visited, 0)
  }
  
  def processArry(arr: Array[Int],left: Int,right:Int,n:Int,visited: Array[Boolean],count:Int) : Int = {
    if(right < n) {
      @tailrec
      def getRightAndCount(arr: Array[Int],right:Int,left:Int,visited: Array[Boolean],n:Int,count:Int): (Int,Int,Array[Boolean]) = {
        if(right < n && !visited(arr(right))) {
          visited(arr(right)) = true
          val  nCount = count + (right-left)
          getRightAndCount(arr, right+1, left, visited, n, nCount)
        } else (count,right,visited)
      }
      val (nC,nR,nV) = getRightAndCount(arr, right, left, visited, n, count)
      @tailrec
      def getLeft(arr: Array[Int],right:Int,left:Int,visited: Array[Boolean],n:Int): (Int,Array[Boolean]) = {
        if(left < right && (right != n && visited(arr(right)))) {
          visited(arr(left)) = false
          getLeft(arr, right, left+1, visited, n)
        } else (left,visited)
      }
      val (nL,newV) = getLeft(arr, nR, left, nV, n)
      processArry(arr, nL, nR, n, newV, nC)
    } else count
  }
}