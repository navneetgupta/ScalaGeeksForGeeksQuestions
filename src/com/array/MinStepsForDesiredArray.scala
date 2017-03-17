package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object MinStepsForDesiredArray {
  /*
   * http://www.geeksforgeeks.org/count-minimum-steps-get-given-desired-array/ 
   * */
  
  /*
   * Consider an array with n elements and value of all the elements is zero. We can perform following operations on the array.
   * Incremental operations:Choose 1 element from the array and increment its value by 1. Doubling operation: Double the values of 
   * all the elements of array. We are given desired array target[] containing n elements. Compute and return the smallest possible 
   * number of the operations needed to change the array from all zeros to desired array.
   * */
  
  /*
   * One important thing to note is that the task is to count the number of steps to get the given target array (not to convert zero
   * array to target array). The idea is to follow reverse steps, i.e. to convert target to array of zeros. Below are steps.
   * Take the target array first. Initialize result as 0. If all are even, divide all elements by 2 and increment result by 1. 
   * Find all odd elements, make them even by reducing them by 1. and for every reduction,increment result by 1.
   * Finally we get all zeros in target array.
   * */
  
  def minOperations(arr:Array[Int]) : Int = {
    minOperationsUtil(arr,0)
  }
  
  def minOperationsUtil(arr: Array[Int],result: Int): Int = {
    val n = arr.length
    val (zeroCount,i) = getZeroCount(arr,0,0,n)
    if(zeroCount == n) {
      result
    } else {
      val nResult = if(i == n ) {
                      for {
                        j <- (0 until n)
                      } yield {
                        arr(j) = arr(j)/2
                      }
                      result +1
                    } else result
                    
      
      val res = arr.drop(i).foldLeft((nResult,i))((a,b) => {
        if((b & 1) != 0) {
          arr(a._2) = b-1
          (a._1+1,a._2+1)
        } else {
          (a._1,a._2+1)
        }
      })._1
      minOperationsUtil(arr, res)
    }
  }
  
  def getZeroCount(arr: Array[Int], zero_count: Int,i :Int, n:Int) : (Int,Int) = {
    if(i < n ) {
      if((arr(i) & 1) != 0) {
        (zero_count,i)
      } else if(arr(i)==0) {
        getZeroCount(arr, zero_count+1, i+1, n)
      } else {
        getZeroCount(arr, zero_count, i+1, n)
      }
    } else (zero_count,i);
  }
}