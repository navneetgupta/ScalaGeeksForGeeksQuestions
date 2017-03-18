package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object RearrangePositiveNegativeEltsSet2 {
  /*
   * http://www.geeksforgeeks.org/rearrange-array-in-alternating-positive-negative-items-with-o1-extra-space-set-2/ 
   * 
   * The idea is to process the array and shift all negative values to the end in O(n) time. After all negative values are shifted 
   * to the end, we can easily rearrange array in alternating positive & negative items. We basically swap next positive element 
   * at even position from next negative element in this step. 
   */
  
  def rearrange(arr: Array[Int]) : Array[Int] = {
    val n = arr.length
    val (i,nArr) = processArray(arr,-1 ,n)
    if(i == 0 || i == n) {
      nArr
    } else {
      @tailrec
      def process(arr: Array[Int],k: Int,i:Int) : Array[Int] = {
        if(k < n && i < n ) {
          val temp = arr(k)
          arr(k) = arr(i)
          arr(i) = temp
          process(arr,k+2,i+1)
        } else arr
      }
      process(arr, 0, i)
    }
  }
  
  def processArray(arr:Array[Int],i:Int,j:Int):(Int,Array[Int]) = {
    if(i<j) {
      @tailrec
      def getNewI(arr: Array[Int],i:Int): Int = if(arr(i+1)>0) getNewI(arr, i+1) else i+1
      @tailrec
      def getNewJ(arr:Array[Int],j:Int):Int = if(arr(j-1)<0) getNewJ(arr, j-1) else j-1
      
      val newI = getNewI(arr,i)
      val newJ = getNewJ(arr,j)
      if(newI < newJ) {
        val temp = arr(newI)
        arr(newI) = arr(newJ)
        arr(newJ)=temp
      }
      processArray(arr, newI, newJ)
        
    } else (i,arr)
  }
}