package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object SumMaxEltOfAllSubSets {
  /*
   * http://www.geeksforgeeks.org/sum-maximum-elements-subsets/ 
   * Given an array of integer numbers, we need to find sum of maximum number of all possible subsets. 
   * */
  
  /*
   * A simple solution is to iterate through all subsets of array and finding maximum of all of them and then adding them in our 
   * answer, but this approach will lead us to exponential time complexity.
   */
  
  /*
   * An efficient solution is based on one thing, how many subsets of array have a particular element as their maximum. As in above 
   * example, four subsets have 5 as their maximum, two subsets have 3 as their maximum and one subset has 2 as its maximum. The idea 
   * is to compute these frequencies corresponding to each element of array. Once we have frequencies, we can just multiply them with 
   * array values and sum them all, which will lead to our final result.
   * To find frequencies, first we sort the array in non-increasing order and when we are standing at a[i] we know, all element from 
   * a[i + 1] to a[N-1] are smaller than a[i], so any subset made by these element will choose a[i] as its maximum so count of such 
   * subsets corresponding to a[i] will be, 2^(N – i – 1)
   * */
  
  def sumMaxEltOfAllSubSets(arr: Array[Int]): Int = {
    val sArr = arr.sortWith(_ > _)
    println(sArr.toList)
    sArr.drop(1).foldLeft(sArr(0))((a,b) => 2*a+b)
  }
}