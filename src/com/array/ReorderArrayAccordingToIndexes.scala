package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object ReorderArrayAccordingToIndexes extends App {
  /*
   * http://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/ 
   * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. 
   * It is not allowed to given array arr’s length
   * */
  
  /*
   * A Simple Solution is to use an auxiliary array temp[] of same size as given arrays. 
   * Traverse the given array and put all elements at their correct place in temp[] using index[]. 
   * Finally copy temp[] to arr[] and set all values of index[i] as i.
   */
  
  def reorder(arr: Array[Int],index: Array[Int]) : Array[Int] = {
    val n =  arr.length
    val temp = new Array[Int](n)
    arr.zip(index).foldLeft(0)((a,b) => {
      temp(b._2) = b._1
      a+1
    })
    for {
      i <- (0 until n)
    } yield {
      arr(i) = temp(i)
      index(i) = i
    }
    arr
  }
  
  /*
   * Without Auxiliary Array. Below is algorithm.

      1) Do following for every element arr[i]
         a) While index[i] is not equal to i
             (i)  Store array and index values of the target (or 
                  correct) position where arr[i] should be placed.
                  The correct position for arr[i] is index[i]
             (ii) Place arr[i] at its correct position. Also
                  update index value of correct position.
             (iii) Copy old values of correct position (Stored in
                  step (i)) to arr[i] and index[i] as the while 
                  loop continues for i.
   */
  
  def reorder2(arr: Array[Int],index: Array[Int]):Array[Int] = {
    processArray(arr,index,0,arr.length)
  }
  
  def processArray(arr: Array[Int],index: Array[Int],i: Int, n : Int) : Array[Int] = {
    if(i < n) {
      @tailrec
      def processInside(arr1: Array[Int],index1: Array[Int]): (Array[Int],Array[Int]) = {
        if(index1(i) != i) {
          val oldTrgtI = index1(index1(i))
          val oldTrgtE = arr1(index1(i))
          arr1(index1(i)) = arr1(i)
          index1(index1(i)) = index1(i)
          index1(i) = oldTrgtI
          arr1(i) = oldTrgtE
          processInside(arr1, index1)
        } else (arr1,index1)
      }
      val as = processInside(arr, index)
      processArray(as._1, as._2, i+1, n)
    } else arr
  }
  
  reorder(Array(50, 40, 70, 60, 90), Array(3,  0,  4,  1,  2))
}