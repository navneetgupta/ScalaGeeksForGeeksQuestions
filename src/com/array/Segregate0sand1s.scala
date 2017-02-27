package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object Segregate0sand1s {
  /*
   * http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/ 
   * 
   * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.
   * 
   * Method 1 (Count 0s or 1s) 
   * 1) Count the number of 0s. Let count be C.
   * 2) Once we have count, we can put C 0s at the beginning and 1s at the remaining n – C positions in array.
   * 
   * Method 2 (Use two indexes to traverse)
      Maintain two indexes. Initialize first index left as 0 and second index right as n-1.
      
      Do following while left < right
      a) Keep incrementing index left while there are 0s at it
      b) Keep decrementing index right while there are 1s at it
      c) If left < right then exchange arr[left] and arr[right]
   */
  
  //Method 2:
  def segregate0sand1s(arr: Array[Int]) : Array[Int] = {
    segregateRec(arr,0,arr.length-1)
  }
  
  @tailrec
  def segregateRec(arr: Array[Int], left: Int,right: Int) : Array[Int] = {
    if(left<right) {
      val lt = getLeftPost(arr, left, right)
      val rt = getRightPost(arr, lt, right)
      if(lt<rt) {
        arr(lt) = 0
        arr(rt) = 1
        segregateRec(arr, lt+1, rt-1)
      } else {
        segregateRec(arr,lt,rt)
      }
    } else arr
  }
  
  @tailrec
  def getLeftPost(arr: Array[Int],left:Int,right:Int) : Int = {
    if(arr(left) == 0  && left<right)
      getLeftPost(arr, left+1, right)
    else left
  }
  
  @tailrec
  def getRightPost(arr: Array[Int],left:Int,right:Int) : Int = {
    if(arr(right) == 1  && left<right)
      getRightPost(arr, left, right-1)
    else right
  }
}