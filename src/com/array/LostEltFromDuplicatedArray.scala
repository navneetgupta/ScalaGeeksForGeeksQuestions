package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object LostEltFromDuplicatedArray {
  /*
   * http://www.geeksforgeeks.org/find-lost-element-from-a-duplicated-array/ 
   * 
   * Given two arrays which are duplicates of each other except one element, that is one element from one of the array is missing, 
   * we need to find that missing element.*/
  
  /*
   * One simple solution is to iterate over arrays and check element by element and flag the missing element when an unmatch is found, 
   * but this solution requires linear time over size of array.
   * */
  
  /*
   * Another efficient solution is based on binary search approach. Algorithm steps are as follows:

 

    Start binary search in bigger array and get mid as (lo + hi) / 2
    If value from both array is same then missing element must be in right part so set lo as mid
    Else set hi as mid because missing element must be in left part of bigger array if mid elements are not equal.
    Special case are handled separately as for single element and zero element array, single element itself will be the missing element.
    If first element itself is not equal then that element will be the missing element./li> 
    
    * */
  
  def findLostElt(arr1: Array[Int],arr2: Array[Int]) :Int =  {
    if(arr1.length > arr2.length) {
      findLostEltUtil(arr1, arr2)
    } else findLostEltUtil(arr2, arr1)
  }
  
  def findLostEltUtil(arr1: Array[Int],arr2: Array[Int]):Int = {
    val n = arr1.length 
    if(n==1) {
      arr1(0)
    } else if(arr1(0) != arr2(0)){
      arr1(0)
    } else {
      val high = processArray(arr1,arr2,0,n-1)
      arr1(high)
    }
  }
  
  def processArray(arr1: Array[Int],arr2: Array[Int],low:Int,high:Int) : Int = {
    if(low<high) {
      val mid = (low+high)/2
      val (l,h) = if(arr1(mid) == arr2(mid)) {
        (mid,high)
      }else (low,mid)
      if(l == h-1) h
      else processArray(arr1, arr2, l, h)
    } else high
  }
  
  /*
   * What if input arrays are not in same order?In this case, missing element is simply XOR of all elements of both arrays.
   * 
   * */
  def findLostElt2(arr1: Array[Int],arr2: Array[Int]) : Option[Int] = {
    val m = arr1.length
    val n = arr2.length
    if( m != n-1 && n != m-1 ) {
      None
    } else {
      val res = arr1.foldLeft(0)((a,b) => a ^b)
      Some(arr2.foldLeft(res)(_ ^ _))
    }
    
  }
}