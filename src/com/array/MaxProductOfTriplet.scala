package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MaxProductOfTriplet {
  /*
   * www.geeksforgeeks.org/find-maximum-product-of-a-triplet-in-array/ 
   * */
  
  /*
   * Approach 1 (Naive, O(n3) time, O(1) Space)
   * A simple solution is to check for every triplet using three nested loops. Below is its C++ implementation –
   * */
  
  /*
   * Approach 2: O(n) Time, O(n) Space

    Construct four auxiliary arrays leftMax[], rightMax[], leftMin[] and rightMin[] of same size as input array.
    Fill leftMax[], rightMax[], leftMin[] and rightMin[] in below manner.
        leftMax[i] will contain maximum element on left of arr[i] excluding arr[i]. For index 0, left will contain -1.
        leftMin[i] will contain minimum element on left of arr[i] excluding arr[i]. For index 0, left will contain -1.
        rightMax[i] will contain maximum element on right of arr[i] excluding arr[i]. For index n-1, right will contain -1.
        rightMin[i] will contain minimum element on right of arr[i] excluding arr[i]. For index n-1, right will contain -1.
    For all array indexes i except first and last index, compute maximum of arr[i]*x*y where x can be leftMax[i] or leftMin[i] and y can be rightMax[i] or rightMin[i].
    Return the maximum from step 3.
   * */
  
  def maxTripletPRoduct(arr: Array[Int]): Int = {
    val n = arr.length
    if(n < 3) -1
    else {
      val leftMin = Array.fill(n){-1}
      val rightMin = Array.fill(n){-1}
      val leftMax = Array.fill(n){-1}
      val rightMax = Array.fill(n){-1}
      //maxSum,minSum,idx
      arr.drop(1).foldLeft((arr(0),arr(0),1))((a,b) => {
        leftMax(a._3) = a._1
        val maxS = if(b>a._1)b else a._1
        leftMin(a._3) = a._2
        val minS = if(b<a._2)b else a._2
        (maxS,minS,a._3+1)
      })
      //maxSum,minSum,idx
      arr.dropRight(1).foldRight((arr(n-1),arr(n-1),n-2))((b,a) => {
        rightMax(a._3) = a._1
        val maxS = if(b>a._1)b else a._1
        rightMin(a._3) = a._2
        val minS = if(b<a._2)b else a._2
        (maxS,minS,a._3-1)
      })
      ((1 to n-2) toList).foldLeft(Int.MinValue)((a,b) => {
        val max1 = List(arr(b)*leftMax(b)*rightMax(b),arr(b)*leftMin(b)*rightMin(b)).max
        val max2 = List(arr(b)*leftMax(b)*rightMin(b),arr(b)*leftMin(b)*rightMax(b)).max
        List(a,max1,max2).max
      })
    }
  }
  
  /* Approach 3:  O(nlogn) Time, O(1) Space
   * Sort the array using some efficient in-place sorting algorithm in ascending order.
   * Return the maximum of product of last three elements of the array and product of first two elements and last element.
   * */
  def maxTripletPRoduct2(arr: Array[Int]): Int = {
    val n  = arr.length
    if(n < 3) -1
    else {
      val sArr = arr.sorted
      List(sArr(0)*sArr(n-1)*sArr(1),sArr(n-3)*sArr(n-2)*sArr(n-1)).max
    }
  }
  
  /* Approach 4 : O(n) Time, O(1) Space

    Scan the array and compute Maximum, second maximum and third maximum element present in the array.
    Scan the array and compute Minimum and second minimum element present in the array.
    Return the maximum of product of Maximum, second maximum and third maximum and product of Minimum, second minimum and Maximum element.

		Note – Step 1 and Step 2 can be done in single traversal of the array.
		
	*/
  
  def maxTripletPRoduct3(arr: Array[Int]): Int = {
    val n  = arr.length
    if(n < 3) -1
    else {
      //maxA,maxB,maxC,minA,minB
      val min = Int.MinValue
      val max = Int.MaxValue
      val res = arr.foldLeft(min,min,min,max,max)((a,b) => {
        val (nMxA,nMxB,nMxc) = if(b > a._1) (b,a._1,a._2)
                               else if(b > a._2) (a._1,b,a._2)
                               else if(b > a._3) (a._1,a._2,b)
                               else (a._1,a._2,a._3)
        val (nMnA,nMnB) = if(b < a._4) (b,a._4)
                          else if(b < a._5) (a._4,b)
                          else (a._4,a._5)
        (nMxA,nMxB,nMxc,nMnA,nMnB)
      })
      List(res._4*res._5*res._1,res._1*res._2*res._3).max
    }
  }
  
  
}