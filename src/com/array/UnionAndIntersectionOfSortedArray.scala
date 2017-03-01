package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 01-March-2017
 */

object UnionAndIntersectionOfSortedArray {
  /*
   * http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/ 
   * 
   * For example, if the input arrays are: 
      arr1[] = {1, 3, 4, 5, 7}
      arr2[] = {2, 3, 5, 6}
      Then your program should print Union as {1, 2, 3, 4, 5, 6, 7} and Intersection as {3, 5}. 
   * 
   * */
  
  /*
   * For union of two arrays, follow the following merge procedure.
    1) Use two index variables i and j, initial values i = 0, j = 0
    2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
    3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
    4) If both are same then print any of them and increment both i and j.
    5) Print remaining elements of the larger array.
   */
  def union(arr1: Array[Int], arr2: Array[Int]):List[Int] = {
    val m = arr1.length
    val n = arr2.length
    val (newArr,i,j) = processTillIOrJLessThanN(arr1, arr2, 0, 0, Nil, n, m)
    val newList = processRemainingArray(arr1, newArr, i, m)
    processRemainingArray(arr2, newList, j, n)
  }
  
  @tailrec
  def processTillIOrJLessThanN(arr1: Array[Int],arr2:Array[Int],i:Int,j:Int,arr:List[Int],n:Int,m:Int): (List[Int],Int,Int) = {
    if(i<m && j< n) {
      if(arr1(i)<arr2(j)){
        processTillIOrJLessThanN(arr1, arr2, i+1, j, arr1(i)::arr, n, m)
      } else if(arr2(j)<arr1(i)) {
        processTillIOrJLessThanN(arr1, arr2, i, j+1, arr2(j)::arr, n, m)
      } else {
        processTillIOrJLessThanN(arr1, arr2, i+1, j+1, arr1(i)::arr, n, m)
      }
    } else {
      (arr,i,j)
    }
  }
  
  @tailrec
  def processRemainingArray(arr: Array[Int],resList: List[Int],i: Int,n:Int):List[Int] = {
    if(i<n) {
      processRemainingArray(arr, arr(i)::resList, i+1, n)
    } else {
      resList
    }
  }
  
  /*
   * For Intersection of two arrays, print the element only if the element is present in both arrays.
      1) Use two index variables i and j, initial values i = 0, j = 0
      2) If arr1[i] is smaller than arr2[j] then increment i.
      3) If arr1[i] is greater than arr2[j] then increment j.
      4) If both are same then print any of them and increment both i and j.
   */
  def intersection(arr1:Array[Int],arr2: Array[Int]):List[Int] = {
   processUnionTillIOrJLessThanN(arr1, arr2, 0, 0, arr2.length, arr1.length, Nil)
  }
  
  @tailrec
  def processUnionTillIOrJLessThanN(arr1: Array[Int],arr2: Array[Int],i: Int,j:Int,n:Int,m:Int,xs: List[Int]) : List[Int] = {
    if(i<m && j< n) {
      if(arr1(i)<arr2(j)){
        processUnionTillIOrJLessThanN(arr1, arr2, i+1, j, n, m, xs)
      } else if(arr2(j)<arr1(i)) {
        processUnionTillIOrJLessThanN(arr1, arr2, i, j+1, n, m, xs)
      } else {
        processUnionTillIOrJLessThanN(arr1, arr2, i+1, j+1,  n, m, arr1(i)::xs)
      }
    } else {
      xs
    }
  }
  
  /*
   * Method 3 Another approach that is useful when difference between sizes of two given arrays is significant.
   * The idea is to iterate through the shorter array and do a binary search for every element of short array in big array 
   * (note that arrays are sorted). Time complexity of this solution is O(min(mLogn, nLogm)). 
   * This solution works better than the above approach when ratio of larger length to smaller is more than logarithmic order.
   * */
  
  
  
  
  
  
  
}