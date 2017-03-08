package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object PrintMissingIntegersIn0to99Range {
  /*
   * http://www.geeksforgeeks.org/print-missing-elements-that-lie-in-range-0-99/ 
   * Given an array of integers print the missing elements that lie in range 0-99. If there are more than one missing, 
   * collate them, otherwise just print the number.
   * */
  
  /*
   * The idea is to use a boolean array of size 100 to keep track of array elements that lie in range 0 to 99. 
   * We first traverse input array and mark such present elements in the boolean array. Once all present elements are marked, 
   * the boolean array is used to print missing elements.*/
  
  def findMissingElts(arr: Array[Int]): Unit = {
    val boolArr = Array.fill(100) {false}
    arr.foldLeft(0)((a,b) => {
      if(b<100){
        boolArr(b)=true;
        a+1
      } else a+1
    })
    processArrOuter(boolArr,0,100)
  }
  
  @tailrec
  def processArrOuter(arr: Array[Boolean],i:Int,limit:Int) : Unit = {
    if(i<limit) {
      if(!arr(i)) {
        val j = processArrInner(arr,i+1,limit)
        if(i+1 == j) 
          println(i)
        else {
          println(i+"-"+(j-1))
        }
        processArrOuter(arr, j, limit)
      } else processArrOuter(arr, i+1, limit)
    }
  }
  
  @tailrec
  def processArrInner(arr: Array[Boolean],j:Int,limit:Int) : Int = {
    if(j<limit && !arr(j)) {
      processArrInner(arr, j+1, limit)
    } else j
  }
}