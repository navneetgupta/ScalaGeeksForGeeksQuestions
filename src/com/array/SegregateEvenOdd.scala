package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 28-Feb-2017
 */

object SegregateEvenOdd {
  /*
   * http://www.geeksforgeeks.org/segregate-even-and-odd-numbers/ 
   * 
   * Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers.
   * */
  
  def segregateEvenAndOdds(arr: Array[Int]) : Array[Int] = {
    segregateRec(arr,0,arr.length-1)
  }
  
  @tailrec
  def segregateRec(arr: Array[Int], left: Int,right: Int) : Array[Int] = {
    if(left<right) {
      val lt = getLeftPost(arr, left, right)
      val rt = getRightPost(arr, lt, right)
      if(lt<rt) {
        val temp = arr(lt)
        arr(lt) = arr(rt)
        arr(rt) = temp
        segregateRec(arr, lt+1, rt-1)
      } else {
        segregateRec(arr,lt,rt)
      }
    } else arr
  }
  
  @tailrec
  def getLeftPost(arr: Array[Int],left:Int,right:Int) : Int = {
    if(arr(left)%2 == 0  && left<right)
      getLeftPost(arr, left+1, right)
    else left
  }
  
  @tailrec
  def getRightPost(arr: Array[Int],left:Int,right:Int) : Int = {
    if(arr(right)%2 == 1  && left<right)
      getRightPost(arr, left, right-1)
    else right
  }
}