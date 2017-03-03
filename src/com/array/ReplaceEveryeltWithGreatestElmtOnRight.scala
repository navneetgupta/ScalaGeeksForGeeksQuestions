package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object ReplaceEveryeltWithGreatestElmtOnRight {
  /*
   * http://www.geeksforgeeks.org/replace-every-element-with-the-greatest-on-right-side/ 
   * Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
   * Since there is no element next to the last element, replace it with -1.
   * */
  
  def nextGreatest(arr:Array[Int]): Array[Int] = {
    val n = arr.length
    //(max,idx)
    val max = arr(n-1)
    arr(n-1) = -1
    arr.dropRight(1).foldRight((max,n-2))((a,b) => {
      val temp = a
      arr(b._2) = b._1
      if(b._1 < temp) {
        (temp,b._2-1)
      } else {
        (b._1,b._2-1)
      }
    })
    arr
  }
}