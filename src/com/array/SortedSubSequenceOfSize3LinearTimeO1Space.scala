package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object SortedSubSequenceOfSize3LinearTimeO1Space {
  /*
   * http://www.geeksforgeeks.org/sorted-subsequence-size-3-linear-time-using-constant-space/ 
   * Given an array, the task is to find three elements of this array such that they are in sorted form i.e. for any three 
   * elements a[i], a[j] and a[k], they follow this relationship : a[i] < a[j] < a[k].
   * */
  
  /*
   * As we are looking for sequence of length 3, at each index we can maintain smallest value we’ve got so far and second 
   * smallest value after smallest value’s index, now if we reach to an index whose value is larger than second smallest value, 
   * then we found our solution because we already maintained a sorted pair and we just found an element which is larger than both, 
   * so we found a 3 length sorted subsequence of array.
   */
  
  def find3Numbers(arr: Array[Int]) : Unit = {
    val n = arr.length
    val (small,large,i) = getSmallAndLarge(arr,0,n,Int.MaxValue,Int.MaxValue)
    if(i == n) println("No Such Tripelt Exists")
    else {
      val nSmall = getSmall(arr,0,i,large,small)
      println("Triplet Found ==" + nSmall + " " + large + "  "+ arr(i))
    }
   }
  
  @tailrec
  def getSmallAndLarge(arr: Array[Int],i : Int,n: Int,small:Int,large: Int): (Int,Int,Int) = {
    if(i < n) {
      if(arr(i) <= small) getSmallAndLarge(arr, i+1,n, arr(i), large)
      else if(arr(i) <= large) getSmallAndLarge(arr, i+1,n, small, arr(i))
      else (small,large,i)
    } else (small,large,i)
  }
  
  @tailrec
  def getSmall(arr: Array[Int],start: Int,end: Int,large: Int,small: Int) : Int = {
    if(start <= end) {
      if(arr(start) < large) arr(start)
      else getSmall(arr, start+1, end, large, small)
    } else small
  }
}