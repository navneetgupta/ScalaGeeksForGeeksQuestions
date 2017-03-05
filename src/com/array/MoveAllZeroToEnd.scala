package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */

object MoveAllZeroToEnd {
  /*
   * http://www.geeksforgeeks.org/move-zeroes-end-array/ 
   * 
   * Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
   * The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1). 
   * */
  
  /*
   * Traverse the given array ‘arr’ from left to right. While traversing, maintain count of non-zero elements in array. 
   * Let the count be ‘count’. For every non-zero element arr[i], put the element at ‘arr[count]’ and increment ‘count’. 
   * After complete traversal, all non-zero elements have already been shifted to front end and ‘count’ is set as index of first 0. 
   * Now all we need to do is that run a loop which makes all elements zero from ‘count’ till end of the array.*/
  
  def mozeZeroToEnd(arr: Array[Int]):Array[Int] = {
    val n = arr.length
    //count of (nonZeroElt,i)
    val (nonZeroEltCount,i) = arr.foldLeft((0,0))((a,b) => if(b != 0) {arr(a._1) = b; (a._1+1,a._2+1); } else (a._1,a._2+1))
    for {
      i <- (nonZeroEltCount until n)
    } yield {
      arr(i) = 0
    }
    arr
  }
}