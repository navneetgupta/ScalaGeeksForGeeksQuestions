package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object PairsWithGivenSum {
  /*
   * http://www.geeksforgeeks.org/count-pairs-with-given-sum/ 
   * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
   * */
  
  /*
   * A simple solution is be traverse each element and check if there’s another number in the array which can be added to it to give sum.
   * 
   * Time Complexity : O(n2)
   * Auxiliary Space : O(1)
   * */
  
  def findPairs(arr: Array[Int],sum:Int): Int = {
    arr.foldLeft((0,0))((a,b) => {
      (arr.drop(a._2+1).foldLeft(a._1)((a1,b1) => {
        if(b+b1 == sum) {
          a1+1
        } else a1
      }),a._2+1)
    })._1
  }
  
  /*
   * A better solution is possible in O(n) time.
   * Below is the Algorithm.
    Create a map to store frequency of each number in the array. (Single traversal is required)
    In the next traversal, for every element check if it can be combined with any other element (other than itself!) to give the desired sum. Increment the counter accordingly.
    After completion of second traversal, we’d have twice the required value stored in counter because every pair is counted two times. Hence divide count by 2 and return.
   * */
  
  def findPairs2(arr: Array[Int],sum:Int) : Int = {
    val n =  arr.length
    val map = Map[Int,Int]().withDefaultValue(0)
    val newMap = arr.foldLeft(map)((a,b) => a + (b -> (a(b)+1)))
    arr.foldLeft(0)((a,b) => {
      val twiceCount = a + newMap(sum-b)
      if((sum-b) == b) {
        twiceCount-1
      } else twiceCount
    })/2
  }
}