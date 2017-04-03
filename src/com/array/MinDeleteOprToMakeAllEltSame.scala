package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object MinDeleteOprToMakeAllEltSame {
  /*
   * http://www.geeksforgeeks.org/minimum-delete-operations-make-elements-array/ 
   * Given an array of n elements such that elements may repeat. We can delete any number of elements from array. 
   * The task is to find minimum number of elements to be deleted from array to make it equal.
   * */
  
  /*
   * The approach is simple, we count frequency of each element in array, then find the frequency of most frequent element in count array. 
   * Let this frequence be max_freq. To get the minimum number of elements to be deleted from array calculate n – max_freq where n 
   * is number of elements in given array.*/
  
  def minDeleteOpr(arr: Array[Int]): Int = {
    val map = arr.foldLeft(Map[Int,Int]())((a,b) => {
      a + (b -> (a.getOrElse(b, 0)+1))
    })
    arr.length - map.foldLeft(Int.MinValue)((a,b) => a max b._2)
  }
}