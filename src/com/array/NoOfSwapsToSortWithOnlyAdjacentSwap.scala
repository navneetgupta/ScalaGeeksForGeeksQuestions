package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object NoOfSwapsToSortWithOnlyAdjacentSwap {
  /*
   * http://www.geeksforgeeks.org/number-swaps-sort-adjacent-swapping-allowed/ 
   * Given an array arr[] of non negative integers. We can perform a swap operation on any two adjacent elements in the array. 
   * Find the minimum number of swaps needed to sort the array in ascending order.
   * 
   * */
  
  /*
   * There is an interesting solution to this problem. It can be solved using the fact that number of swaps needed is equal to number of inversions. So we basically need to count inversions in array.

      The fact can be established using below observations:
      1) A sorted array has no inversions.
      2) An adjacent swap can reduce one inversion. Doing x adjacent swaps can reduce x inversions in an array.
      
   */
  
  def countSwaps(arr: Array[Int]): Int = {
    val n = arr.length
    mergeSort(arr,new Array[Int](n),0,n-1,0)
  }
  
  def mergeSort(arr: Array[Int],temp: Array[Int],start: Int, end: Int,count: Int) : Int = {
    if(start < end) {
      val mid = (start + end)/2
      val invCnt = mergeSort(arr, temp, start, mid, count)
      val nInvCnt = mergeSort(arr, temp, mid+1, end, count)
      val invCnt2 = merge(arr,temp,start,mid+1,end)
      invCnt+nInvCnt+invCnt2
    } else count
  }
  
  def merge(arr: Array[Int],temp: Array[Int],start: Int,mid:Int, end: Int): Int = {
    val (invCnt,i,j,k,nTemp) = getTempAndInvCnt(arr, temp, start, mid, end, mid, end, 0)
    val (nI,nk,nTemp2) = processI(nTemp, arr, i, k, mid)
    val (nJ,nK2,nTemp3) = processJ(nTemp2, arr, j, nk, end)    
    invCnt
  }

  @tailrec
  def getTempAndInvCnt(arr: Array[Int],temp: Array[Int],i: Int,j: Int,k:Int,mid: Int,right:Int,invCnt: Int) : (Int,Int,Int,Int,Array[Int]) = {
    if((i <= mid-1) && (j <= right)) {
      if(arr(i) <= arr(j)) {
        temp(k) = arr(i)
        getTempAndInvCnt(arr, temp, i+1, j, k+1, mid, right,invCnt)
      } else {
        temp(k) = arr(j)
        getTempAndInvCnt(arr, temp, i, j+1, k+1, mid, right,invCnt+mid-i)
      }
    } else (invCnt,i,j,k,temp)
  }
  
  @tailrec
  def processJ(temp: Array[Int],arr: Array[Int],j: Int,k: Int,right: Int): (Int,Int,Array[Int]) = {
    println(j + "    "+k +"    "+right)
    if(j <= right) {
      temp(k) = arr(j)
      processJ(temp, arr, j+1, k+1, right)
    } else (j,k,temp)
  }
  
  @tailrec
  def processI(temp: Array[Int],arr: Array[Int],i: Int,k: Int,mid: Int): (Int,Int,Array[Int]) = {
    if(i <= mid-1) {
      temp(k) = arr(i)
      processI(temp, arr, i+1, k+1, mid)
    } else (i,k,temp)
  }
  
}