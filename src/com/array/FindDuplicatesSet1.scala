package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 28-Feb-2017
 */

object FindDuplicatesSet1 {
  /* http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/ 
   * Given an array of n elements which contains elements from 0 to n-1, with any of these numbers appearing any number of times. 
   * Find these repeating numbers in O(n) and using only constant memory space.
   * 
   * extension of  FindTwoRepeatingEltsBtwn1ToN.printRepeat4 method
   * 
   * The above program doesn’t handle 0 case (If 0 is present in array). The program can be easily modified to handle that also. 
   * It is not handled to keep the code simple.
   * 
   * There is a problem in above approach. It prints the repeated number more than once. For example: {1, 6, 3, 1, 3, 6, 6} it will give output as : 3 6 6. 
   * In below set, another approach is discussed that prints repeating elements only once.
   * */
  def findDuplicates(arr:Array[Int]) : Unit = {
    for {
      i <- (0 until arr.length)
    } yield {
      if(arr(math.abs(arr(i)))>=0) {
        arr(math.abs(arr(i))) = -arr(math.abs(arr(i)))
      } else {
        println(math.abs(arr(i)))
      }
    }
  }
  
}