package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Mar-2017
 */

object LargestSubArrayWithContiguousElts {
  /*
   * http://www.geeksforgeeks.org/length-largest-subarray-contiguous-elements-set-1/ 
   * 
   * Given an array of distinct integers, find length of the longest subarray which contains numbers that can be arranged 
   * in a continuous sequence.*/
  
  /*
   * The important thing to note in question is, it is given that all elements are distinct. If all elements are distinct, 
   * then a subarray has contiguous elements if and only if the difference between maximum and minimum elements in subarray 
   * is equal to the difference between last and first indexes of subarray. So the idea is to keep track of minimum and maximum 
   * element in every subarray.*/
  
  def findLength(arr: Array[Int]):Int = {
    val n = arr.length
    //(maxLen,idx)
    arr.foldLeft((1,0))((a,b) => {
      //(mn,mx,idx,mxLen)
      val newMxLen = arr.drop(a._2+1).foldLeft((b,b,a._2+1,a._1))((a1,b1) => {
        val newMn = List(a1._1,b1).min
        val newMx = List(a1._2,b1).max
        if((newMx-newMn)== (a1._3-a._2)) {
          (newMn,newMx,a1._3+1,List(a1._4,newMx-newMn+1).max)
        } else (newMn,newMx,a1._3+1,a1._4)
      })._4
      (newMxLen,a._2+1)
    })._1
  }
}