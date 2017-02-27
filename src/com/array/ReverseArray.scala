package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object ReverseArray {
  /*
   * http://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/ 
   * 
   * 1) Initialize start and end indexes. 
      start = 0, end = n-1
      2) In a loop, swap arr[start] with arr[end] and change start and end as follows.
      start = start +1; end = end – 1
   */
  @tailrec
  def reverseArray[A](array:Array[A],start:Int,end:Int): Array[A] = {
    if(start > end) 
      array
    else {
      val temp = array(start)
      array(start) = array(end)
      array(end) = temp
      reverseArray(array, start+1, end-1)
    }
  }
  // for Specific type we can do the list.toArray but for generic type its difficult need to research to convert List[A] to Array[A]
  def reverseArray2[A](array:Array[A]):Vector[A] = array.toList.foldLeft(List[A]())((a,b) => b::a).to[Vector]
}