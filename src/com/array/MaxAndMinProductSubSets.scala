package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object MaxAndMinProductSubSets {
  /*
   * http://www.geeksforgeeks.org/maximum-and-minimum-product-subsets-with-one-product-covering-all-elements/ 
   * */
  
  /*
   * As array can have negative value, zero and positive value, this problem can have lot of edge cases, if not attacked properly. 
   * Below given solution maintains maximum product and minimum product at current index and previous index and at any instant 
   * current product takes value from previous max or previous min multiplied with current element, depending on the sign of 
   * current element. For example, if we are finding maximum product then current maximum will be previous max times current 
   * value if current element is positive otherwise previous min times current value if current element is negative.	
   * Same procedure is applied for finding minimum product also.
   */
  
  def getMaxAndMinProduct(arr: Array[Int]): (Int,Int) = {
    val (pMxP,pMnP,mxP,mnP) = arr.drop(1).foldLeft((arr(0),arr(0),arr(0),arr(0)))((a,b) => {
      val cMxP = List(a._1*b,a._2*b,b,a._1).max
      val cMnP = List(a._1*b,a._2*b,b,a._2).min
      (cMxP,cMnP,a._3 max cMxP,a._4 min cMnP)
    })
    (mxP,mnP)
  }
}