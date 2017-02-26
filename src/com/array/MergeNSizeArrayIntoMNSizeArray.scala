package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 26-Feb-2017
 */

object MergeNSizeArrayIntoMNSizeArray {
  /*
   * http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/ 
   * Let first array be mPlusN[] and other array be N[]
      1) Move m elements of mPlusN[] to end.
      2) Start from nth element of mPlusN[] and 0th element of N[] and merge them 
          into mPlusN[].
   */
//  
//  def merge(arrN:Array[String],arrMN: Array[String]) : Array[String] = {
//    
//  }
  
  def pushToEnd2(arrMN:Array[String]) : Array[String] = {
    val size = arrMN.length-1
    var j = size
      for {
        i <- (size to 0 by -1)
        if(arrMN(i) != "NA")
      } yield {
          arrMN(j) = arrMN(i)
          j=j-1
      }
      arrMN
  }
  
  def pushToEnd(arrMN: Array[String]): Array[String] = {
    //Just to avoid using mutable variables i am using reverse
    val reverse = arrMN.reverse
    reverse.foldLeft(arrMN.length-1)((a,b) => {
      if(b != "NA") { 
        arrMN(a)=b
        a-1
      } else a
    })
    arrMN
  }
  
    
  def merge(arrN:Array[String],arrMN: Array[String]) : Array[String] = {
    val n = arrN.length
    val m = arrMN.length - n
    arrMN.foldLeft((0,0,n))((a,b) => {
      if(a._3 < (m+n) && arrMN(a._3).toInt <= arrN(a._1).toInt || (a._1 == n)) {
        arrMN(a._2)=arrMN(a._3)
        (a._1,a._2+1,a._3+1)
      } else {
        arrMN(a._2) = arrN(a._1)
        (a._1+1,a._2+1,a._3)
      }
    })
    arrMN
  }
  
  def mergeNSizeIntoMNSize(arrN:Array[String],arrMN: Array[String]) : Array[String] = {
    merge(arrN,pushToEnd(arrMN))
  }
}