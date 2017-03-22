package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object JollyJumper {
  /*
   * http://www.geeksforgeeks.org/jolly-jumper-sequence/
   * 
   * A sequence of n numbers (n < 3000) is called Jolly Jumper if the absolute values of the differences between the successive 
   * elements take on all possible values from 1 through n-1. The definition implies that any sequence of a single integer is a 
   * jolly jumper.
   * */
  
  /*
   * The idea is to maintain a boolean array to store set of absolute difference of successive elements.
    a) If absolute difference between two elements is more than n-1 or 0, return false.
    b) If an absolute difference repeated, then all absolute differences from 1 to n-1 can’t be present (Pigeon Hole Principle), 
    return false.
   */
  
  def isJollyJump(arr: Array[Int]):Boolean = {
    val n = arr.length
    val diffSet = Array.fill(n){false}
    val as: IndexedSeq[Boolean] =for {
      i <- (0 until n-1)
    } yield {
      val diff = math.abs(arr(i)-arr(i+1))
      if(diff == 0 || diff > n-1 || diffSet(diff)) {
        false
      } else {
        diffSet(diff) = true
        true
      }
    }
    as.foldLeft(true)(_&&_)
  }
  
  def isJollyJump2(arr: Array[Int]): Boolean = {
    val n = arr.length
    isJollyJump2Util(arr, Array.fill(n){false}, 0, n,true)
  }
  def isJollyJump3(arr: Array[Int]): Boolean = {
    val n = arr.length
    isJollyJumpUtil(arr, Array.fill(n){false}, 0, n)
  }
  
  @tailrec
  def isJollyJump2Util(arr: Array[Int],diffSet: Array[Boolean],start: Int,end: Int,resp: Boolean): Boolean = {
    if(start < end-1 && resp) {
      val d = math.abs(arr(start) - arr(start+1)) 
      if (d == 0 || d > end-1 || diffSet(d)== true) {
        isJollyJump2Util(arr, diffSet, start+1, end, false)
      } else {
        diffSet(d) = true
        isJollyJump2Util(arr, diffSet, start+1, end, resp)
      }
    } else if(start == (end-1)) true
    else resp
  }
  
  @tailrec
  def isJollyJumpUtil(arr: Array[Int],diffSet: Array[Boolean],start: Int,end:Int): Boolean = {
    if(start < end-1) {
      val d = math.abs(arr(start) - arr(start+1)) 
      if (d == 0 || d > end-1 || diffSet(d)== true) {
        false
      } else {
        diffSet(d) = true
        isJollyJumpUtil(arr, diffSet, start+1, end)
      }
    } else true 
  }
}