package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Mar-2017
 */

object NoOfSubArrayWithStartEndAs1 {
  /*
   * http://www.geeksforgeeks.org/given-binary-string-count-number-substrings-start-end-1/ 
   * */
  
  /*
   * A Simple Solution is to run two loops. Outer loops picks every 1 as starting point and inner loop searches for ending 1 
   * and increments count whenever it finds 1.
   * Time Complexity of the above solution is O(n2).
   * */
  
  def noOfSubArrays(arr: Array[Char]): Int = {
    //count,idx
    arr.foldLeft((0,0))((a,b) => {
      if(b=='1') {
        val (ct,idx) = arr.drop(a._2+1).foldLeft(a._1,a._2+1)((a1,b1) => {
          if(b1 =='1') {
            (a1._1+1,a1._2+1)
          } else (a1._1,a1._2+1)
        })
        (ct,a._2+1)
      } else {
        (a._1,a._2+1)
      }
    })._1
  }
  
  /*
   * We can find count in O(n) using a single traversal of input string. Following are steps.
   * a) Count the number of 1’s. Let the count of 1’s be m.
   * b) Return m(m-1)/2
   * The idea is to count total number of possible pairs of 1’s.
   * */
  
  def noOfSubArrays2(arr: Array[Char]) : Int = {
    val m = arr.foldLeft(0)((a,b) => if(b=='1') a+1 else a)
    m*(m-1)/2
  }
}