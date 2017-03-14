package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Mar-2017
 */

object MergeTwoSortedArrayO1Space {
  /*
   * http://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/ 
   * We are given two sorted array. We need to merge these two arrays such that the initial numbers (after complete sorting) are 
   * in the first array and the remaining numbers are in the second array. Extra space allowed in O(1).
   * */
  
  /*
   * The idea is to begin from last element of ar2[] and search it in ar1[]. If there is a greater element in ar1[], 
   * then we move last element of ar1[] to ar2[]. To keep ar1[] and ar2[] sorted, we need to place last element of ar2[] 
   * at correct place in ar1[]. We can use Insertion Sort type of insertion for this.
   */
  
//  def merge(arr1: Array[Int],arr2: Array[Int]): (Array[Int],Array[Int]) = {
//    val m = arr1.length
//    val n = arr2.length
//    arr2.foldRight(0)((a,b) => {
//      val last = arr1(m-1)
//      arr1.dropRight(1).foldRight(m-2)((a1,b1) => {
//        if(a1>a) {arr1(b1+1) = a1;b1+1} else b1+1
//      })
//    })
//  }
}