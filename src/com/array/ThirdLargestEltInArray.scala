package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object ThirdLargestEltInArray {
  /*
   * http://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/ 
   * 
   * Given an array of distinct elements, find third largest element in it 
   */
  
  /* Method 1 (Simple) Simplest way to solve this question is to first iterate through the array and find first maximum. 
   * Store this first maximum as well as its index. Now traverse the whole array finding the second max with the changed condition. 
   * Finally traverse the array third time and find the third largest element.
   */
  
  def findThirdLargest(arr: Array[Int]):Option[Int] = {
    val n = arr.length
    if(n<3) {
      println("Invalid Array")
      None
    } else {
      val first = arr.drop(1).foldLeft(arr(0))(_ max _)
      val second = arr.foldLeft(Int.MinValue)((a,b) => if(b > a && b < first)b else a)
      Some(arr.foldLeft(Int.MinValue)((a,b) => if(b > a && b < second)b else a))
    }
  }
  
  /*
   * Method 2 In this method, we need not to iterate array three times. We can find third largest in one traversal only.

			Initialize first = a[0] and second = -INF, third = -INF
      	Iterate the array and compare each element with first.
      If a[i] is greater than first then update all first, second and third:
      third = second
      second = first
      first = arr[i]
      Else compare arr[i] with second, if its greater than second, then update:
      third = second
      second = arr[i]
      Else compare arr[i] with third, if its greater than third, then update:
      third = arr[i]
      Return third
   */
  
  def findThridLargest(arr: Array[Int]): Option[Int] = {
    Some(arr.drop(1).foldLeft((arr(0),Int.MinValue,Int.MinValue))((a,b) => {
      if(b > a._1) (b,a._1,a._2)
      else if(b > a._2) (a._1,b,a._2)
      else if(b > a._3) (a._1,a._2,b)
      else a
    })._3)
  }
}