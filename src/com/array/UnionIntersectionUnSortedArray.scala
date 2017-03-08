package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object UnionIntersectionUnSortedArray {
  /*
   * http://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/ 
   * Given two unsorted arrays that represent two sets (elements in every array are distinct), find union and intersection of two arrays.
   * 
   * */
  
  /*
   * Method 1 (Naive)
      Union: 
      1) Initialize union U as empty.
      2) Copy all elements of first array to U.
      3) Do following for every element x of second array:
      …..a) If x is not present in first array, then copy x to U.
      4) Return U.
      
      Intersection: 
      1) Initialize intersection I as empty.
      2) Do following for every element x of first array
      …..a) If x is present in second array, then copy x to I.
      4) Return I.
      
      Time complexity of this method is O(mn) for both operations. Here m and n are number of elements in arr1[] and arr2[] respectively.
      
      Method 2 (Use Sorting)
      1) Sort arr1[] and arr2[]. This step takes O(mLogm + nLogn) time.
      2) Use O(m + n) algorithms to find union and intersection of two sorted arrays.
      
      Overall time complexity of this method is O(mLogm + nLogn).
      // Check UnionIntersectionSortedArray 
    */
  
  /*
   * Method 3 (Use Sorting and Searching)
      Union:
      1) Initialize union U as empty.
      2) Find smaller of m and n and sort the smaller array.
      3) Copy the smaller array to U.
      4) For every element x of larger array, do following
      …….b) Binary Search x in smaller array. If x is not present, then copy it to U.
      5) Return U.
      
      Intersection:
      1) Initialize intersection I as empty.
      2) Find smaller of m and n and sort the smaller array.
      3) For every element x of larger array, do following
      …….b) Binary Search x in smaller array. If x is present, then copy it to I.
      4) Return I.
      
      Time complexity of this method is min(mLogm + nLogm, mLogn + nLogn) which can also be written as O((m+n)Logm, (m+n)Logn). 
    */
  
  def printUnion(arr1: Array[Int],arr2:Array[Int]):Unit = {
    val m = arr1.length
    val n = arr2.length
    if(m > n) {
      processUnionArray(arr2.sorted, arr1)
    } else {
      processUnionArray(arr1.sorted, arr2)
    }
  }
  
  def printIntersection(arr1: Array[Int],arr2: Array[Int]) = {
    val m = arr1.length
    val n = arr2.length
    if(m > n) {
      processIntersectionArray(arr2.sorted, arr1)
    } else {
      processIntersectionArray(arr1.sorted, arr2)
    }
  }
  
  def processUnionArray(sortedArr: Array[Int],arr1: Array[Int]):Unit  = {
    val n= sortedArr.length
    for {
        i <- (0 until sortedArr.length)
      } yield (print(sortedArr(i) + " , "))
      for{
        i <- (0 until arr1.length)
        if(!binarySearch(sortedArr,0,n-1,arr1(i)))
      } yield(print(arr1(i) + " , "))
  }
  
  def processIntersectionArray(sortedArr: Array[Int],arr1: Array[Int]) :Unit = {
    val n= sortedArr.length
    for{
      i <- (0 until arr1.length)
      if(binarySearch(sortedArr,0,n-1,arr1(i)))
    } yield(print(arr1(i) + " , "))
  }
  
  
  def binarySearch(arr: Array[Int],start: Int,end: Int,key: Int) : Boolean = {
    if(end >= start) {
      val mid = start + (end-start)/2
      if(arr(mid) == key) true
      else if(arr(mid) > key) binarySearch(arr, start, mid-1, key)
      else binarySearch(arr, mid+1, end, key)
    } else false
  }
  
  
  /*
   * Method 4 (Use Hashing)
      Union:
      1) Initialize union U as empty.
      1) Initialize an empty hash table.
      2) Iterate through first array and put every element of first array in the hash table, and in U.
      4) For every element x of second array, do following
      …….a) Search x in the hash table. If x is not present, then copy it to U.
      5) Return U.
      
      Intersection:
      1) Initialize intersection I as empty.
      2) In initialize an empty hash table.
      3) Iterate through first array and put every element of first array in the hash table.
      4) For every element x of second array, do following
      …….a) Search x in the hash table. If x is present, then copy it to I.
      5) Return I.
      
      Time complexity of this method is Θ(m+n) under the assumption that hash table search and insert operations take Θ(1) time.
   * */
}