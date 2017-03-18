package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MinSumOfTwoNoFromedFromArrayDigits {
  /*
   * http://www.geeksforgeeks.org/minimum-sum-two-numbers-formed-digits-array/ 
   * 
   * Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. 
   * All digits of given array must be used to form the two numbers.
   * */
  
  /*
   * A minimum number will be formed from set of digits when smallest digit appears at most significant position and next smallest digit
   *  appears at next most significant position ans so on..The idea is to sort the array in increasing order and build two numbers by 
   *  alternating picking digits from the array. So first number is formed by digits present in odd positions in the array and 
   *  second number is formed by digits from even positions in the array. Finally, we return the sum of first and second number.
   */
  
  def solve(arr: Array[Int]): Int = {
    val sArr = arr.sorted
    //a,b,index
    val (a,b,indx) = sArr.foldLeft((0,0,0))((a,b) => {
      if((a._3 & 1) != 0) {
        (a._1*10+b,a._2,a._3+1)
      } else {
        (a._1,a._2*10+b,a._3+1)
      }
    })
    a+b
  }
}