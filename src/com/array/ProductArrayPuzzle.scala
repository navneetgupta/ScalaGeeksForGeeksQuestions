package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 28-Feb-2017
 */

object ProductArrayPuzzle {
  /*
   * http://www.geeksforgeeks.org/a-product-array-puzzle/ 
   * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal 
   * to the product of all the elements of arr[] except arr[i]. 
   * Solve it without division operator and in O(n).
   * 
   **/
  
  /*
   * Algorithm:
      1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
      2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
      3) To get prod[], multiply left[] and right[].
   */
  
  //TODO: Check this one
  def productArray(arr:Array[Int]): Array[Int] = {
    val size = arr.length
    
    val leftProductArray = arr.foldLeft((Nil:List[Int],1))((a,b) => {
      val p = b * a._2
      (p::a._1,p)
    })._1.reverse
    
    val rightProductArray = new Array[Int](size)
    rightProductArray(size-1) = 1
    for {
      i <- (size-2 to 0 by -1)
    } yield {
      rightProductArray(i) = arr(i+1) * rightProductArray(i+1)
    }
    
    val as = for {
      i <- (0 until size)
    } yield {
      leftProductArray(i)*rightProductArray(i)
    }
    as.toArray
  }
  def productArray2(arr:Array[Int]): Array[Int] = {
    val size = arr.length
    val leftProductArray = new Array[Int](size)
    leftProductArray(0)=1
    for {
      i <- (1 until size)
    } yield {
      leftProductArray(i) = arr(i-1) * leftProductArray(i-1)
    }
    
    val rightProductArray = new Array[Int](size)
    rightProductArray(size-1) = 1
    for {
      i <- (size-2 to 0 by -1)
    } yield {
      rightProductArray(i) = arr(i+1) * rightProductArray(i+1)
    }
    
    val as = for {
      i <- (0 until size)
    } yield {
      leftProductArray(i)*rightProductArray(i)
    }
    as.toArray
  }
}