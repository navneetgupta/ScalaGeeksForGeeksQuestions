package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object MxValueabsIminusJMultMinAiAj {
  /*
   * http://www.geeksforgeeks.org/find-maximum-value-of-absi-j-minarri-arrj-in-an-array-arr/ 
   * Given an array of n distinct elements. Find the maximum of product of Minimum of two numbers in the array and absolute
   * difference of their positions 
   */
  
  /*
   * A simple solution for this problem is to take each element one by one and compare this element with the elements on right of it. 
   * Then calculate product of minimum of them and absolute difference between their indexes and maximize the result. Time complexity 
   * for this approach is O(n^2).
   */
  
  /*
   * An efficient solution to solves the problem in linear time complexity. We take two iterators Left=0 and Right=n-1, compare 
   * elements arr[Left] and arr[right].
   * left = 0, right = n-1
   * maxProduct = -INF
   * While (left < right)
   * If arr[Left] < arr[right] 
        currProduct = arr[Left]*(right-Left) 
        Left++ . 
    If arr[right] < arr[Left] 
        currProduct = arr[Right]*(Right-Left) 
        Right-- . 
  
    maxProduct = max(maxProduct, currProduct)
   */
  
  def maxProduct(arr: Array[Int]): Int = {
    processArr(arr,0,arr.length-1,Int.MinValue)
  }
  
  def processArr(arr: Array[Int],left: Int,right: Int,maxProduct: Int) : Int = {
    if(left < right) {
      val (currP,nLeft,nRight) = if(arr(left) < arr(right)) {
                                    (arr(left)*(right-left),left+1,right)
                                 } else (arr(right)*(right-left),left,right-1)
      processArr(arr, nLeft, nRight, maxProduct max currP)
    } else maxProduct
  }
}