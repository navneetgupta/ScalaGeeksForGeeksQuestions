package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Mar-2017
 */

object CountInversions {
  /*
   * http://www.geeksforgeeks.org/count-inversions-of-size-three-in-a-give-array/ 
   * 
   * Given an array arr[] of size n. Three elements arr[i], arr[j] and arr[k] form an inversion of size 3 if a[i] > a[j] >a[k] 
   * and i < j < k. Find total number of inversions of size 3.
   * */
  
  /*
   * Simple approach :- Loop for all possible value of i, j and k and check for the condition a[i] > a[j] > a[k] and i < j < k.
   * Time complexity of this approach is : O(n^3)
   * */
  
  def countInversions(arr: Array[Int]):Int = {
    val n = arr.length
    val as = for {
      i <- (0 until n-2)
      j <- (i+1 until n-1)
      if(arr(i) > arr(j))
    } yield {
      for{
        k <- (j+1 until n)
        if(arr(j)> arr(k))
      }yield {
        1
      }
    }
    as.flatMap(x => x).sum
  }
  
  /*Better Approach :
   * We can reduce the complexity if we consider every element arr[i] as middle element of inversion, find all the numbers 
   * greater than a[i] whose index is less than i, find all the numbers which are smaller than a[i] and index is more than i. 
   * We multiply the number of elements greater than a[i] to the number of elements smaller than a[i] and add it to the result. 
   * Time Complexity of this approach : O(n^2)
   * */
  
  def countInversions2(arr:Array[Int]):Int = {
    val n = arr.length
    //i,invCount
    arr.drop(1).dropRight(1).foldLeft((1,0))((a,b) => {
      val small = arr.drop(a._1+1).foldLeft(0)((a1,b1) => {
        if(b>b1)a1+1 else a1
      })
      val lrg = arr.dropRight(n-a._1).foldRight(0)((a1,b1) => {
        if(b<a1)b1+1 else b1
      })
      (a._1+1,a._2+small*lrg)
    })._2
  }
  
  
  
  
}