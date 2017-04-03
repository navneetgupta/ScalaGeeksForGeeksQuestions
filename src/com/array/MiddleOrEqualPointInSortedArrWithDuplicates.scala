package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object MiddleOrEqualPointInSortedArrWithDuplicates {
  /*
   * http://www.geeksforgeeks.org/find-equal-or-middle-point-in-a-sorted-array-with-duplicates/ 
   * Given a sorted array of n size, the task is to find whether an element exists in the array from where number of smaller elements 
   * is equal to number of greater elements.
   * If Equal Point appears multiple times in input array, return index of its first occurrence. If doesn’t exist, return -1.
   * */
  
  /*
   * A Naive approach is take every element and count how many elements are smaller than that and then greater element. 
   * Then compare if both are equal or not.
   * */
  
  /*
   * An Efficient approach is to create an auxiliary array and store all distinct elements in it. If count of distinct elements is even, 
   * then Equal Point does not exist. If count is odd, then equal point is middle point of the auxiliary array.
   * */
  
  def findEqulaPoint(arr: Array[Int]):Int = {
    val n = arr.length
    val (di,dist) = processArr(arr,new Array[Int](n),0,n,0)
    if((di & 1)!=0) dist(di>>1) else -1
  }
  
  def processArr(arr: Array[Int],dist: Array[Int],i:Int,n:Int,di:Int): (Int,Array[Int]) = {
    if(i < n) {
      dist(di) = i
      @tailrec
      def getNewI(arr: Array[Int],i:Int,n:Int): Int = {
        if(i < n && arr(i) == arr(i-1)) getNewI(arr, i+1, n) else i
      }
      val nI = getNewI(arr, i+1, n)
      processArr(arr, dist, nI, n, di+1)
    } else (di,dist)
  } 
}