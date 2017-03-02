package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 02-Mar-2017
 */

object FindTripletSum {
  /*
   * http://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
   * Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
   * If there is such a triplet present in array, then print the triplet and return true. Else return false
   * */
  
  /*
   * Method 1 (Naive)
   * A simple method is to generate all possible triplets and compare the sum of every triplet with the given value. 
   * The following code implements this simple method using three nested loops.
   * */
  
  def findTripletSum(arr: Array[Int],sum : Int) : (List[Int],Boolean) = {
    val n = arr.length
    val as = for {
      i <- (0 until n-2 )
      j <- (i+1 until n-1)
      k <- (j+1 until n)
      if(arr(i)+arr(j)+arr(k) == sum)
    } yield {
      List(arr(i),arr(j),arr(k))
    }
    if(as.length > 0) (as.head,true)
    else (Nil,false)
  }
  
  /*
   * 1) Sort the input array.
   * 2) Fix the first element as A[i] where i is from 0 to array size – 2. After fixing the first element of triplet, 
   * find the other two elements using method 1 of this post.
   */
  def findTripletSum2(arr: Array[Int],sum: Int): List[Int] = {
    val n = arr.length
    val sortedArray = arr.sorted
    processArray(sortedArray, 0, sum, n)
  }
  
  def processArray(arr:Array[Int],idx: Int,sum:Int,n:Int): List[Int] = {
    if(idx < n-2) {
      val (xs,isPresent) = processSubArray(arr, idx+1, n-1, idx, sum)
      if(isPresent) xs 
      else processArray(arr, idx+1, sum, n)
    } else {
      Nil
    }
  }
  
  @tailrec
  def processSubArray(arr: Array[Int],l: Int, r: Int,i :Int,sum: Int) : (List[Int],Boolean) = {
    if(l<r) {
      if(arr(i)+arr(l)+arr(r) == sum) {
        (List(arr(i),arr(l),arr(r)),true)
      } else if(arr(i)+arr(l)+arr(r) < sum){
        processSubArray(arr, l+1, r, i, sum)
      } else {
        processSubArray(arr, l, r-1, i, sum)
      }
    } else {
      (Nil,false)
    }
  }
  // can also be used sunig below functions
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