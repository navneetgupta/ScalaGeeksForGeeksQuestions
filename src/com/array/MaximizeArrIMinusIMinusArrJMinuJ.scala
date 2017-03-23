package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object MaximizeArrIMinusIMinusArrJMinuJ {
  /*
   * http://www.geeksforgeeks.org/maximize-value-of-arri-i-arrj-j-in-an-array/ 
   * Given an array, arr[] find the maximum value of (arr[i] – i) – (arr[j] – j) where i is not equal to j. 
   * Where i and j vary from 0 to n-1 and n is size of input array arr[]. 
   */
  
  /*
   * Method 1 (Naive : O(n2))
   * The idea is to run two loops to consider all possible pairs and keep track of maximum value of expression (arr[i]-i)-(arr[j]-j). */
  
  def maxDiff(arr: Array[Int]): Option[Int] = {
    val n =arr.length
    if(n < 2) {
      None
    } else {
      Some(arr.foldLeft((Int.MinValue,0))((a,b) => {
        val as = arr.foldLeft((a._1,0))((a1,b1) => {
          if(a1._1 < (b - b1 - a._2 + a1._2 )) (b - b1 - a._2 + a1._2 ,a1._2+1)
          else (a1._1,a1._2+1)
        })
        (as._1,a._2+1)
      })._1)
    }
  }
  
  /*
   * 1) Find maximum value of arr[i] – i in whole array.
   * 2) Find minimum value of arr[i] – i in whole array.
   * 3) Return difference of above two values.
   * */
  
  def maxDiff2(arr: Array[Int]): Option[Int] = {
    val n =arr.length
    if(n < 2) {
      None
    } else {
      val (minVal,maxVal,indx) = arr.foldLeft((Int.MaxValue,Int.MinValue,0))((a,b) => {
        val diff = b - a._3
        val newMaxVal = if(diff > a._2)diff else a._2
        val newMinVal = if(diff < a._1) diff else a._1
        (newMinVal,newMaxVal,a._3+1)
      })
      Some(maxVal-minVal)
    }
  }
}