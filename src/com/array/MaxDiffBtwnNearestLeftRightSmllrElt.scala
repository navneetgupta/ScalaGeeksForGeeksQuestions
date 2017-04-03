package com.array

import scala.collection.immutable.Stack
import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object MaxDiffBtwnNearestLeftRightSmllrElt {
  /*
   * http://www.geeksforgeeks.org/find-maximum-difference-between-nearest-left-and-right-smaller-elements/ 
   * Given array of integers, the task is to find the maximum absolute difference between nearest left and right smaller element 
   * of every element in array.
   *  If there is no smaller element on right side or left side of any element then we take zero as smaller element. For example for 
   *  leftmost element, nearest smaller element on left side is considered as 0. Similarly for rightmost elements, smaller element on 
   *  right side is considered as 0.
   * */
  
  /*
   * A simple solution is to find nearest left and right smaller elements for every element and then update the maximum difference 
   * between left and right smaller element , this take O(n^2) time
   */
  
  /*
   * An efficient solution takes O(n) time. We use a stack. The idea is based on the approach discussed in next greater element article. 
   * The interesting part here is we compute both left smaller and right smaller using same function.
   * */
  
  def findMaxDiff(arr: Array[Int]): Int = {
    val n = arr.length
    val ls = leftSmaller(arr,n,new Array[Int](n))
    val rs = leftSmaller(arr.reverse, n, new Array[Int](n))
    ls.foldLeft((-1,0))((a,b) => {
      (a._1 max math.abs(b-rs(n-1-a._2)) ,a._2+1)
    })._1
  }
  
  def leftSmaller(arr: Array[Int],n: Int,ls: Array[Int]): Array[Int] = {
    val stk = List[Int]()
    arr.foldLeft((stk,0))((a,b) => {
      val nstk = processStk(a._1,b)
      if(nstk.length >0) ls(a._2) = nstk.head else ls(a._2) = 0
      (b::nstk,a._2+1)
    })
    ls
  }
  
  @tailrec
  def processStk(stk : List[Int],elt: Int): List[Int] = {
    if(stk.length>0 && stk.head >= elt) processStk(stk.tail, elt)
    else stk
  }
}