package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object FindTwoMissingNoSet1 {
  /*
   * http://www.geeksforgeeks.org/find-two-missing-numbers-set-1-an-interesting-linear-time-solution/ 
   * Given an array of n unique integers where each element in the array is in range [1, n]. The array has all distinct elements 
   * and size of array is (n-2). Hence Two numbers from the range are missing from this array. Find the two missing numbers.
   */
  
  /*
   * Method 1 – O(n) time complexity and O(n) Extra Space 
   * Step 1: Take a boolean array mark that keeps track of all the elements present in the array.
   * Step 2: Iterate from 1 to n, check for every element if it is marked as true in the boolean array, 
   * if not then simply display that element.
   */
  
  def findTwoMissingNo(arr: Array[Int],n:Int): List[Int] = {
    val mark = Array.fill(n+1){false}
    arr.foldLeft(0)((a,b) => {mark(b)=true;a+1;})
    (for {
      i <- (1 to n)
      if(!mark(i))
    } yield i).toList
  }
  
  /*
   * Method 2 – O(n) time complexity and O(1) Extra Space

   * arrSum => Sum of all elements in the array

      sum (Sum of 2 missing numbers) = (Sum of integers from 1 to n) - arrSum
                                     = ((n)*(n+1))/2 – arrSum 
      
      avg (Average of 2 missing numbers) = sum / 2;
      One of the numbers will be less than or equal to avg while the other one will be strictly greater then avg. Two numbers can never be equal since all the given numbers are distinct.
      We can find the first missing number as sum of natural numbers from 1 to avg, i.e., avg*(avg+1)/2 minus the sum of array elements smaller than avg
      We can find the second missing number as sum of natural numbers from avg+1 to n minus the sum of array elements greater than than avg
   */
  
  def findTwoMissingNo2(arr: Array[Int],n:Int): List[Int] = {
    val arrSum = arr.foldLeft(0)(_+_)
    val sum = n*(n+1)/2 - arrSum
    val avgSum = sum/2
    val (smallerHalfSum,greterHalfSum) = arr.foldLeft((0,0))((a,b) => {
      if(b <= avgSum)(a._1+b,a._2)
      else (a._1,a._2+b)
    })
    val totalSmallerHalf = avgSum*(avgSum+1)/2
    List((totalSmallerHalf-smallerHalfSum),((n*(n+1)/2)-totalSmallerHalf-greterHalfSum))
  }
}