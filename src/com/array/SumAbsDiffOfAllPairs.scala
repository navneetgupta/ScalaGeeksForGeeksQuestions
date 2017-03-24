package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object SumAbsDiffOfAllPairs {
  /*
   * http://www.geeksforgeeks.org/sum-absolute-differences-pairs-given-array/ 
   * Given a sorted array of distinct elements, the task is to find the summation of absolute differences of all pairs in the given array. 
   * */
  
  /*A simple solution for this problem is to one by one look for each pair take their difference and sum up them together. 
   * The time complexity for this approach is O(n2).
   */
  
  /*
   * An efficient solution for this problem needs a simple observation. Since array is sorted and elements are distinct, 
   * when we take sum of absolute difference of pairs each element in the i’th position is added ‘i’ times and subtracted ‘n-1-i’ times.
   * The generalized expression for each element will be sum = sum + (i*a[i]) – (n-1-i)*a[i].
   */
  def sumPairs(arr: Array[Int]) : Int = {
    val n = arr.length
    arr.foldRight((0,n-1))((b,a) => {
      (a._1+ a._2 * b - (n-1-a._2)*b,a._2-1)
    })._1
  }
}