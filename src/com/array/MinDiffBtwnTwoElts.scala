package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object MinDiffBtwnTwoElts {
  /*
   * http://www.geeksforgeeks.org/find-minimum-difference-pair/ 
   */
  
  /*
   * Method 1 (Simple: O(n2) A simple solution is to use two loops.
   * */
  
  def minDiffPair(arr: Array[Int]) : Int = {
    //diff,index
    arr.dropRight(1).foldLeft((Int.MaxValue,0))((a,b) => {
      (arr.drop(a._2+1).foldLeft(a._1)((a1,b1) => {
        if(math.abs(b-b1) < a1) {
          math.abs(b-b1)
        } else a1
      }),a._2+1)
    })._1
  } 
  
  /*
   * Method 2 (Efficient: O(n Log n) 
   * The idea is to use sorting. Below are steps.
   * 1) Sort array in ascending order. This step takes O(n Log n) time.
   * 2) Initialize difference as infinite. This step takes O(1) time.
   * 3) Compare all adjacent pairs in sorted array and keep track of minimum difference. This step takes O(n) time.
   */
  
  def minDiffPair2(arr: Array[Int]):Int = {
    val sortedArr = arr.sorted
    sortedArr.dropRight(1).foldLeft((Int.MaxValue,0))((a,b) => {
      if((sortedArr(a._2+1)-b)<a._1){
        ((sortedArr(a._2+1)-b),a._2+1)
      } else {
        (a._1,a._2+1)
      }
    })._1
  }
}