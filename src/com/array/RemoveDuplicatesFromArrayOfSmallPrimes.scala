package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Mar-2017
 */

object RemoveDuplicatesFromArrayOfSmallPrimes {
  /*
   * http://www.geeksforgeeks.org/remove-duplicates-from-an-array-of-small-primes/ 
   * 
   * Given an array of primes such that the range of primes is small. Remove duplicates from the array.
   * 
   * */
  
  /*
   * Method 1 (Naive : O(n2))
   * A simple solution is to run two loops. Pick all elements one by one. For every picked element, check if it already seen or not. 
   * If already seen, then ignore it. Else add it to the array.
   */
  
  def removeDups(arr: Array[Int]): List[Int] = {
    val n = arr.length
    arr.drop(1).foldLeft((List(arr(0)),1))((a,b) => {
      val j = getIAndJ(arr,0,a._2)
      if(a._2 == j) (b::a._1,a._2+1)
      else (a._1,a._2+1)
    })._1
  }
  
  @tailrec
  def getIAndJ(arr: Array[Int],start: Int,end:Int): Int = {
    if(start < end) {
      if(arr(end) == arr(start)) start
      else getIAndJ(arr, start+1, end)
    } else start
  }
  
  /*
   * Method 2 (Sorting : O(n Log n))
   * A better solutions is to first sort the array and then remove adjacent elements from sorted array. */
  
  /*
   * Method 3 (Hashing : O(n))
   * The idea is keep track of visited elements in a hash table.
   * */

  def removeDups2(arr: Array[Int]): List[Int] = {
    arr.foldLeft(Nil:List[Int])((a,b) => if(a.contains(b)) a else b::a)
  }
  
  /*Method 4 (Works only for small range : O(n))
   * This solutions uses the fact that numbers are primes. But it works only when product of all distinct primes in array is 
   * less than maximum value in long long int.*/
}