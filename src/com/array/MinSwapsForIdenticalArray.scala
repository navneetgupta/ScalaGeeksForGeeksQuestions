package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

import com.array.MinSwapsToSortArray.minSwaps

object MinSwapsForIdenticalArray {
  /*
   * http://www.geeksforgeeks.org/minimum-swaps-to-make-two-array-identical/ 
   * Given two arrays which have same values but in different order, we need to make second array 
   * same as first array using minimum number of swaps.
   * */
  
  /*
   * This problem can be solved by modifying the array B. We save the index of array A elements in array B i.e. if ith element of 
   * array A is at jth position in array B, then we will make arrB[i] = j For above given example, modified array B will be, 
   * arrB = {3, 1, 0, 2}. This modified array represents distribution of array A element in array B and our goal is to sort this 
   * modified array in minimum number of swaps because after sorting only array B element will be aligned with array A elements.
   */
  
  def minSwapForIdenticalArray(arr1: Array[Int],arr2: Array[Int]):Int = {
    val n= arr1.length
    val map = arr2.foldLeft((0, Map[Int,Int]()))((a,b) => {
      (a._1+1,a._2 + (b -> a._1))
    })._2
    for {
      i <- (0 to n-1)
    } yield arr2(i)=map.getOrElse(arr1(i), 0)
    
    minSwaps(arr2) 
  }
}