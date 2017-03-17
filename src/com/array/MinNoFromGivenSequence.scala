package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object MinNoFromGivenSequence {
  
  /*
   * http://www.geeksforgeeks.org/form-minimum-number-from-given-sequence/ 
   * Given a pattern containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print 
   * the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.
   * */
  
  /*
   * Since digits can’t repeat, there can be at most 9 digits in output.
   * Also number of digits in output is one more than number of characters in input. Note that the first character of input 
   * corresponds to two digits in output.
   * Idea is to iterate over input array and keep track of last printed digit and maximum digit printed so far 
   * */
  
  def printMinNumber(arr: Array[Char]):Unit  = {
    processArray(arr, 0, arr.length, 0, 0)
  }
  
  def processArray(arr: Array[Char],start: Int,end:Int,currMax:Int,lastEntry:Int) : Unit = {
    if(start < end) {
      arr(start) match {
        case 'I' => {
          val noOfNextD = processDInArray(arr, start+1, end, 0)
          val (cCurrMax,cLastEntry) = if(start == 0) {
            print(lastEntry+1 + " ")
            print((noOfNextD+2) + " ")
            (noOfNextD+2,noOfNextD+2)
          } else {
            print((currMax+noOfNextD+1) + " ")
            (currMax + noOfNextD + 1,currMax + noOfNextD + 1)
          }
          val res = printLastEntry(0, noOfNextD, cLastEntry,start)
          processArray(arr, res._2+1, end, cCurrMax, res._1)
        }
        case 'D' => {
          val (cCurrMax,cLastEntry) = if(start == 0) {
            val noOfNextD = processDInArray(arr, start+1, end, 0)
            print((noOfNextD+2) + " " + (noOfNextD+1) + " ")
            (noOfNextD+2,noOfNextD+1)
          } else {
            print((lastEntry-1) + " ")
            (currMax,lastEntry-1)
          }
          processArray(arr, start+1, end, cCurrMax, cLastEntry)
        }
      }
    }
  }
  
  def processDInArray(arr:Array[Char],j:Int,n:Int,noOfNextD:Int):Int  = {
    if(j<n && arr(j) == 'D') {
      processDInArray(arr, j+1, n, noOfNextD+1)
    } else noOfNextD
  }
  
  def printLastEntry(start: Int , end :Int,lastEntry : Int,i:Int) : (Int,Int) = {
    if(start < end) {
      print((lastEntry-1) + " ")
      printLastEntry(start+1, end, lastEntry-1,i+1)
    } else (lastEntry,i)
  }
  
  /*
   * MEtod 2 : */
  def printLeast(arr: Array[Char]) : Unit = {
    val (v,minAvail,posOfI) = if(arr(0) == 'I') {
      (Vector(1,2),3,1)
    } else {
      (Vector(2,1),3,0)
    }
    val newVN = arr.drop(1).foldLeft((v,minAvail,posOfI,1))((a,b) => {
      if(b == 'I') {
        val newV = a._1 :+ a._2
        (newV,a._2+1,a._4+1,a._4+1)
      } else {
        val newV = a._1 :+ a._1(a._4)
        val uV = updateV(newV,a._3,a._4)
        (uV,a._2+1,a._3,a._4+1)
      }
    })._1
   newVN.foldLeft(0)((a,b) => {print(b + " ");a+1;})
  }
  
  def updateV(v: Vector[Int], start: Int, end :Int) : Vector[Int] = {
    if(start <= end) {
      val newV = v.updated(start,v(start)+1)
      updateV(newV,start +1,end)
    } else {
      v
    }
  }

}