package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object MaxSumWithNoTwoAdjacentElt {
  /*
   * http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/ 
   * 
   * 
   * Loop for all elements in arr[] and maintain two sums incl and excl where incl = Max sum including the previous element 
   * and excl = Max sum excluding the previous element.
   * Max sum excluding the current element will be max(incl, excl) and max sum including the current element will be excl + current element 
   * (Note that only excl is considered because elements cannot be adjacent).
   * At the end of the loop return max of incl and excl.
   * */
  
  def maxSumWithNoAdjacentElt(arr: Array[Int],n:Int) : Int = {
    val as = arr.foldLeft((arr(0),0))((a,b) => {
      val excl_new = if(a._1 > a._2) a._1 else a._2
      (a._2+b,excl_new)
    })
    (if(as._1 > as._2) as._1 else as._2)-arr(0)
  }
  
  def maxSumWithNoAdjacentElt2(arr: Array[Int],n:Int) : Int = {
    val as = arr.view.zipWithIndex.foldLeft((arr(0),0))((a,b) => {
      if(b._2 > 0) {
        val excl_new = if(a._1 > a._2) a._1 else a._2
        (a._2+b._1,excl_new)
      } else {
        a
      }
    })
    (if(as._1 > as._2) as._1 else as._2)
  }
}