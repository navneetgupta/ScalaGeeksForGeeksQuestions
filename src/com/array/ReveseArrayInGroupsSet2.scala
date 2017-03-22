package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object ReveseArrayInGroupsSet2 {
  /*
   * http://www.geeksforgeeks.org/reverse-an-array-in-groups-of-given-size-2/ 
   * */
  
  // Variation 1 (Reverse Alternate Groups):Reverse every alternate sub-array formed by consecutive k elements.
  def reverseAlternateGroups(arr: Array[Int],k: Int): Array[Int] = {
    val n = arr.length
    ((0 until n-1 by 2*k).toList).foldLeft(arr)((a,b) => {
      val right = List(b+k-1,n-1).min
      reverseBtoRight(arr,b,right)
    })
  }
  
  // Variation 2 (Reverse at given distance): Reverse every sub-array formed by consecutive k elements at given distance apart.
   def reverseAtGivenDistInGroups(arr: Array[Int],k: Int,m:Int): Array[Int] = {
    val n = arr.length
    ((0 until n-1 by k+m).toList).foldLeft(arr)((a,b) => {
      val right = List(b+k-1,n-1).min
      reverseBtoRight(arr,b,right)
    })
  }
   
  // Variation 3 (Reverse by doubling the group size): Reverse every sub-array formed by consecutive k elements where k doubles itself with every sub-array.
  def reverseByDoublingGroupSize(arr: Array[Int],k:Int) : Array[Int] = {
    processArr(arr,0,k,arr.length)
  }
  
  def processArr(arr: Array[Int],i: Int,k:Int,n:Int) : Array[Int] = {
    if(i < n) {
      val right = List(i+k-1,n-1).min
      val nArr = reverseBtoRight(arr, i, right)
      processArr(nArr, i+k/2, k*2, n)
    } else arr
  }
  
  def reverseBtoRight(arr: Array[Int],left: Int, right: Int) : Array[Int] = {
    if(left < right) {
      val temp = arr(left)
      arr(left) = arr(right)
      arr(right) = temp
      reverseBtoRight(arr, left+1, right-1)
    } else arr
  }
}