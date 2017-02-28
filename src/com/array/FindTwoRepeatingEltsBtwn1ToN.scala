package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 28-Feb-2017
 */

object FindTwoRepeatingEltsBtwn1ToN {
  /*
   * http://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
   * 
   * You are given an array of n+2 elements. All elements of the array are in range 1 to n. And all elements occur once except 
   * two numbers which occur twice. Find the two repeating numbers.
   * */
  
  /*
   * Method 1 (Basic)
   * Use two loops. In the outer loop, pick elements one by one and count the number of occurrences of the picked element in the inner loop.
   * This method doesn’t use the other useful data provided in questions like range of numbers is between 1 to n and 
   * there are only two repeating elements.
   * Time Complexity: O(n*n)
   * Auxiliary Space: O(1)
   * */
  
  def printRepeating(arr:Array[Int],n: Int): Unit = 
    for{
      i <- (0 until arr.length)
      j <- (i+1 until arr.length)
      if(arr(i) == arr(j))
    } yield (println(arr(i)))
    
  /*
   * Traverse the array once. While traversing, keep track of count of all elements in the array using a temp array count[] of size n, 
   * when you see an element whose count is already set, print it as duplicate.
   * This method uses the range given in the question to restrict the size of count[], but doesn’t use the data that there are only 
   * two repeating elements.
   * 
   * Time Complexity: O(n)
   * Auxiliary Space: O(n)*/
    
  def printRepeating2(arr:Array[Int],n:Int) : Unit = {
      val size = arr.length
      val count = new Array[Int](size-2)
      for {
        i <- (0 until size)
      } yield {
        if(count(arr(i)-1)==1) println(arr(i))
        else count(arr(i)-1) = count(arr(i)-1)+1
      }
    }
    
    
  /*Method 3: 
   * Let the numbers which are being repeated are X and Y. We make two equations for X and Y and the simple task left is to solve the two equations.
   * We know the sum of integers from 1 to n is n(n+1)/2 and product is n!. We calculate the sum of input array, 
   * when this sum is subtracted from n(n+1)/2, we get X + Y because X and Y are the two numbers missing from set [1..n]. '
   * Similarly calculate product of input array, when this product is divided from n!, we get X*Y. Given sum and product of X and Y, 
   * we can find easily out X and Y.
   * Time Complexity: O(n)
   * Auxiliary Space: O(1)*/
  
  def printRepeating3(arr: Array[Int],n:Int): Unit = {
    val (sum,product) = arr.foldLeft((0,1))((a,b) => (a._1+b,a._2*b))
    val twoNumSum = sum - n*(n+1)/2
    val twoNumPro = product/factorial(n)
    val d =  math.sqrt(twoNumSum * twoNumSum - 4 * twoNumPro).toInt
    println((d+twoNumSum)/2)
    println((twoNumSum-d)/2)
  }
  def factorial(n:Int) : Int = {
    @tailrec
    def factorialRec(n:Int,fact:Int) : Int = {
      if(n>1) factorialRec(n-1,n*fact)
      else fact
    }
    factorialRec(n, 1)
  }
  
  /*Method 4: 
   * Traverse the array. Do following for every index i of A[].
    {
    check for sign of A[abs(A[i])] ;
    if positive then
       make it negative by   A[abs(A[i])]=-A[abs(A[i])];
    else  // i.e., A[abs(A[i])] is negative
       this   element (ith element of list) is a repetition
    }
  */
  
  def printRepeat4(arr: Array[Int],n:Int) : Unit = {
    for {
      i <- (0 until arr.length)
    } yield {
      if(arr(math.abs(arr(i)))>0) {
        arr(math.abs(arr(i))) = -arr(math.abs(arr(i)))
      } else {
        println(math.abs(arr(i)))
      }
    }
  }
    
    
    
    
    
    
    
}