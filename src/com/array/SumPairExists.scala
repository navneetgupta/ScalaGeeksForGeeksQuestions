package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Feb-2017
 */

object SumPairExists {
  /*
 * Question Link on geeksForGeeks:
 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */
  
  /*
    * Given an array A[] and a number x, check for pair in A[] with sum as x
    * Here we will take List instead of Array. Anyway we can easily convert array to list and viceversa
    * var arr:Array[Int] = Array(1,2,3,4,5) then list can be created as arr.toList
    */ 
  
  def isSumPairExists(xs:List[Int],sum:Int):Boolean = {
    @tailrec
    def checkSum(ys:Array[Int],start:Int,end:Int):Boolean = {
      if(start>end) false
      else {
        val tempSum = ys(start) + ys(end)
        println("tempSum == " + tempSum + " start = " + start + " end = " +end)
        sum match {
          case z:Int if(z == tempSum) => true
          case x:Int if(x < tempSum) => checkSum(ys,start,end-1)
          case y:Int if(y > tempSum) => checkSum(ys,start+1,end)
        }
      }
    }
    checkSum(xs.sorted.toArray,0,xs.length-1)
  }  
}