package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */

object RearrangeGivenArray {
  /*
   * http://www.geeksforgeeks.org/rearrange-given-array-place/ 
   * Given an array arr[] of size n where every element is in range from 0 to n-1. Rearrange the given array so that arr[i] 
   * becomes arr[arr[i]]. This should be done with O(1) extra space.
   * */
  
  /*
   * If the extra space condition is removed, the question becomes very easy. The main part of the question is to do it without extra space.
   * 
   *  Following are the steps.
   *  1) Increase every array element arr[i] by (arr[arr[i]] % n)*n.
   *  2) Divide every element by n.
   
   * Let us understand the above steps by an example array {3, 2, 0, 1}
   * In first step, every value is incremented by (arr[arr[i]] % n)*n
   * After first step array becomes {7, 2, 12, 9}. 
   * The important thing is, after the increment operation of first step, every element holds both old values and new values. 
   * Old value can be obtained by arr[i]%n and new value can be obtained by arr[i]/n.
   * In second step, all elements are updated to new or output values  by doing arr[i] = arr[i]/n.
   * After second step, array becomes {1, 0, 3, 2}*/
  
  def rearrangeArray(arr:Array[Int]):Array[Int] = {
    val n = arr.length
    //indx
    arr.foldLeft(0)((a,b) => {
      arr(a) = b + (arr(b)%n)*n
      a+1
    })
    arr.foldLeft(0)((a,b) => {
      arr(a) = b/n
      a+1
    })
    arr
  }
}