package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object TwoNumbersWithOddOccurenceInUnsorted {
  /*
   * http://www.geeksforgeeks.org/find-the-two-numbers-with-odd-occurences-in-an-unsorted-array/
   * Given an unsorted array that contains even number of occurrences for all numbers except two numbers. 
   * Find the two numbers which have odd occurrences in O(n) time complexity and O(1) extra space.
   * */
  
  /* A naive method to solve this problem is to run two nested loops. The outer loop picks an element and the inner loop counts 
   * the number of occurrences of the picked element. If the count of occurrences is odd then print the number. 
   * The time complexity of this method is O(n^2).
   * */
  
  /*
   * We can use sorting to get the odd occurring numbers in O(nLogn) time. First sort the numbers using an O(nLogn) sorting 
   * algorithm like Merge Sort, Heap Sort.. etc. Once the array is sorted, all we need to do is a linear scan of the array 
   * and print the odd occurring number. 
   */
  
  def printTwoOdd(arr: Array[Int]):(Int,Int) = {
    val xor2 = arr.drop(1).foldLeft(arr(0))(_^_)
    val setBitNo = xor2 & ~(xor2-1)
    arr.foldLeft((0,0))((a,b) => {
      if((b & setBitNo)!=0) (a._1^b,a._2) else (a._1,a._2^b)
    })
  }
}