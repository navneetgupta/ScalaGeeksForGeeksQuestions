package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object RearrangePositiveNegativeNos {
  /*
   * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/ 
   * An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and negative 
   * numbers are placed alternatively. Number of positive and negative numbers need not be equal. If there are more positive numbers 
   * they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.
   * */
   def rearragnge(arr: Array[Int]): Array[Int] = {
     val n = arr.length
     val (i,idx) = arr.foldLeft((-1,0))((a,b) => {
       if(b<0) {
         val newI= a._1+1
         val temp = arr(newI)
         arr(newI) = b
         arr(a._2) = temp
         (newI,a._2+1)
       } else (a._1,a._2+1)
     })
     val pos = i+1
     val neg = 0
     processArray(arr,pos,neg,n)
   }
   
   def processArray(arr: Array[Int],pos:Int,neg:Int,n:Int): Array[Int] = {
     if(pos < n && neg < pos && arr(neg) < 0) {
       val temp = arr(neg)
       arr(neg) = arr(pos)
       arr(pos) = temp
       processArray(arr, pos+1, neg+2, n)
     } else arr
     
   }
}