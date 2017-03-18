package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object AbsoluteDistinctCount {
  /*
   * http://www.geeksforgeeks.org/absolute-distinct-count-array-sorted-absolute-values/ 
   * 
   * Given a sorted array of integers, return the number of distinct absolute values among the elements of the array. 
   * */
  
  /*
   * One simple solution is to use set. For each element of the input array, we insert its absolute value in the set. 
   * As set doesn’t support duplicate elements, the element’s absolute value will be inserted only once. Therefore, 
   * the required count is size of the set.
   * Time Complexity : O(n) 
   * Auxiliary Space : O(n)
   */
  
  def absoluteDistinctElts(arr: Array[Int]) : Set[Int] = {
    arr.foldLeft(Set[Int]())((a,b) => {
      a + math.abs(b)
    })
  }
  
  /*
   * The idea is to take advantage of the fact that the array is already Sorted. We initialize the count of distinct elements
   * to number of elements in the array. We start with two index variables from two corners of the array and check for pair in 
   * the input array with sum as 0. If pair with 0 sum is found or duplicates are encountered, we decrement the count of distinct 
   * elements.Finally we return the updated count.
   */
  
  def absoluteDistinctElts2(arr: Array[Int]): Int = {
    processArray(arr, 0, arr.length-1, 0, arr.length)
  }
  
  def processArray(arr: Array[Int],i : Int,j: Int,sum :Int,count: Int) : Int = {
    if(i < j) {
      @tailrec
      def getI(arr: Array[Int],i:Int,count:Int,j:Int):(Int,Int) = if(i!=j && arr(i) == arr(i+1))getI(arr,i+1,count-1,j) else (count,i)
      val (nCount,nI) = getI(arr, i, count, j)
      @tailrec
      def getJ(arr: Array[Int],i:Int,count:Int,j:Int):(Int,Int) = if(i!=j && arr(j) == arr(j-1))getJ(arr,i,count-1,j-1) else (count,j)
      val (newCount,nJ) = getJ(arr, nI, nCount, j)
      if(nI == nJ) {
        newCount
      } else {
        val nSum = arr(nI) + arr(nJ)
        if(nSum ==0){
          processArray(arr, nI+1, nJ-1, nSum, newCount-1)
        } else if( nSum < 0) processArray(arr, nI+1, nJ, nSum, newCount)
        else processArray(arr, nI, nJ-1, nSum, newCount)
      }
    } else count
  }
  
}