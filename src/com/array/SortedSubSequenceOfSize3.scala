package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object SortedSubSequenceOfSize3 {
  /*
   * http://www.geeksforgeeks.org/find-a-sorted-subsequence-of-size-3-in-linear-time/
   * Given an array of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in 0(n) time. 
   * If there are multiple such triplets, then print any one of them
   * */
  
  /*
   * 1) Create an auxiliary array smaller[0..n-1]. smaller[i] should store the index of a number which is smaller than arr[i] and is on 
   * left side of arr[i]. smaller[i] should contain -1 if there is no such element.
		 2) Create another auxiliary array greater[0..n-1]. greater[i] should store the index of a number which is greater than arr[i] and is 
		 on right side of arr[i]. greater[i] should contain -1 if there is no such element.
		 3) Finally traverse both smaller[] and greater[] and find the index i for which both smaller[i] and greater[i] are not -1.
		 */
  
  def find3Number(arr: Array[Int]):List[Int] = {
    val n = arr.length
    val smaller = new Array[Int](n)
    smaller(0) = -1
    val min = arr.drop(1).foldLeft((0,1))((a,b) => {
      if(b <= arr(a._1)) {
        smaller(a._2) = -1
        (a._2,a._2+1)
      } else {
        smaller(a._2) = a._1
        (a._1,a._2+1)
      }
    })._1
    val greater = new Array[Int](n)
    greater(n-1) = -1
    
    val max = arr.dropRight(1).foldRight((n-1,n-2))((b1,a1) => {
      if(b1 >= arr(a1._1)) {
        greater(a1._2) = -1
        (a1._2,a1._2-1)
      } else {
        greater(a1._2) = a1._1
        (a1._1,a1._2-1)
      }
    })._1
    val a1 = smaller.zip(greater).takeWhile(a => !(a._1 != -1 && a._2 != -1)).length
    if(a1 == arr.length) {
      Nil
    } else
    List(arr(smaller(a1)),arr(a1),arr(greater(a1)))
    
  }
}