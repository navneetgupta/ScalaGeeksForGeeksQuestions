package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object ArrayLeaders extends App {
  /*
   * http://www.geeksforgeeks.org/leaders-in-an-array/ 
   * An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader. 
   * 
   * MEthod1: Use two loops. The outer loop runs from 0 to size – 1 and one by one picks all elements from left to right. 
   * The inner loop compares the picked element to all the elements to its right side. If the picked element is greater than all the
   * elements to its right side, then the picked element is the leader.
   *  
   * Method 2: Scan all the elements from right to left in array and keep track of maximum till now. When maximum changes it’s value, print it.
   */
  
  //Method 1: 
  def leadersOfArray(arr: Array[Int]): Unit = {
    val size= arr.length
    for {
      i <- (0 until size)
    } yield {
      val as = for {
        j <- (i+1 until size)
        if(arr(i) <= arr(j))
      } yield {
        i
      }
      if(as.isEmpty) print(arr(i)+ " , ")
    }
  }
  
  leadersOfArray(Array(16,17,4,3,5,2))
  leadersOfArray(Array(12,14,2,3,12, 3,4,5,11,6,7,10,4,5,6,9,1,2,3,8,1,2,3,4,7,1))
  
  // Method: 2
  def leadersOfArray2(arr: Array[Int]): Unit = {
    println("");
    print(arr(arr.length-1) + " , ")
    arr.reverse.foldLeft(arr(arr.length-1))((a,b) => if(a<b){print(b+ " , ");b} else a)
  }
  leadersOfArray2(Array(16,17,4,3,5,2))
  leadersOfArray2(Array(12,14,2,3,12, 3,4,5,11,6,7,10,4,5,6,9,1,2,3,8,1,2,3,4,7,1))
}