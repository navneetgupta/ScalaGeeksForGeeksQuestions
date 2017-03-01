package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 01-March-2017
 */

object IsArrayElementsConsecutive {
  /*
   * http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/ 
   * 
   * Given an unsorted array of numbers, write a function that returns true if array consists of consecutive numbers. 
   * */
  
  /* Method 1::
   * Method 1 (Use Sorting)
      1) Sort all the elements.
      2) Do a linear scan of the sorted array. If the difference between current element and next element is anything other than 1, 
      then return false. If all differences are 1, then return true.
   */
  
  /*
   * Method 2 (Use visited array)
    The idea is to check for following two conditions. If following two conditions are true, then return true.
    1) max – min + 1 = n where max is the maximum element in array, min is minimum element in array and n is the number of elements in array.
    2) All elements are distinct.
    
   **/
  
  def areConsecutive(arr: Array[Int],n:Int) : Boolean = {
    if(n<1) false
    else {
      val min = arr.min
      val max = arr.max
      if(max-min+1 == n) {
        val visited = Array.fill(n){false}
        isDistinct(arr,visited,min)
      } else {
        false
      }
    }
  }
  
  def isDistinct(arr: Array[Int],visited: Array[Boolean],min:Int): Boolean = {
    val as = arr.takeWhile { x => if(visited(x-min)) false else { visited(x-min)=true;true} }
    if(as.length == arr.length) true else false
  }
}