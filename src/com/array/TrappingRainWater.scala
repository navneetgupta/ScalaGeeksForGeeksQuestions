package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object TrappingRainWater {
  /*
   * http://www.geeksforgeeks.org/trapping-rain-water/ 
   * 
   * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
   * */
  
  /*
   * A Simple Solution is to traverse every array element and find the highest bars on left and right sides. Take the smaller of two heights. 
   * The difference between smaller height and height of current element is the amount of water that can be stored in this array element. 
   * Time complexity of this solution is O(n2).
   * 
   * An Efficient Solution is to pre-compute highest bar on left and right of every bar in O(n) time. Then use these pre-computed values to 
   * find the amount of water in every array element. Below is C++ implementation of this solution.
   * */
  
  def trapRainWater(arr: Array[Int]): Int = {
    val n = arr.length
    val left= new Array[Int](n)
    val right= new Array[Int](n)
    left(0) = arr(0)
    arr.drop(1).foldLeft(1)((a,b) => {
      left(a) = List(left(a-1),b).max
      a+1
    })
    right(n-1) = arr(n-1)
    arr.dropRight(1).foldRight(n-2)((a1,b1) => {
      right(b1) = List(right(b1+1),a1).max
      b1-1
    })
    left.zip(right).foldLeft((0,0))((a,b) => {
      val newWater = a._1 + List(b._1,b._2).min - arr(a._2)
      (newWater,a._2+1)
    })._1
  }
}