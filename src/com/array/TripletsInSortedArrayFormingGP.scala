package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object TripletsInSortedArrayFormingGP {
  /*
   * http://www.geeksforgeeks.org/find-all-triplets-in-a-sorted-array-that-forms-geometric-progression/
   * Given a sorted array of distinct positive integers, print all triplets that forms Geometric Progression with integral common ratio.
   * 
   * A geometric progression is a sequence of numbers where each term after the first is found by multiplying the previous one by a fixed,
   * non-zero number called the common ratio. For example, the sequence 2, 6, 18, 54,… is a geometric progression with common ratio 3.
   */
  
  /*
   * The idea is to start from the second element and fix every element as middle element and search for the other two elements 
   * in a triplet (one smaller and one greater). For an element arr[j] to be middle of geometric progression, there must exist 
   * elements arr[i] and arr[k] such that – arr[j] / arr[i] = r and arr[k] / arr[j] = r
   * where r is an positive integer and 0 <= i < j and j < k <= n - 1
   */
  
  def findGeometricTriplets(arr: Array[Int]) : List[(Int,Int,Int)] = {
    processJ(arr,1,arr.length,Nil)
  }
  
  def processJ(arr: Array[Int],j:Int,n:Int,xs: List[(Int,Int,Int)]) : List[(Int,Int,Int)] = {
    if(j < n-1) {
      val as = findIAndK(arr, j-1, j+1, j, xs)
      processJ(arr, j+1, n, as)
    } else xs
  }
  
  @tailrec
  def findIAndK(arr: Array[Int],i: Int,k:Int,j:Int,xs: List[(Int,Int,Int)]): List[(Int,Int,Int)] = {
    if(i >= 0 && k <= arr.length-1) {
      val (nList,nk,ni) = processIJK(arr,i,j,k,xs)
      val (newI,newK) = if(ni>=0 && nk <= arr.length-1){
                          if(arr(j) % arr(ni) == 0 && arr(nk) % arr(j) ==0) {
                            if(arr(j) / arr(ni) < arr(nk) / arr(j)) {
                              (ni-1,nk)
                            } else (ni,nk+1)
                          } else if(arr(j) % arr(ni) == 0) (ni,nk+1)
                          else (ni-1,nk)
                        } else (ni,nk)
      findIAndK(arr, newI, newK, j, nList)
    } else xs
  }
  
  @tailrec
  def processIJK(arr: Array[Int],i : Int,j :Int,k:Int,xs: List[(Int,Int,Int)]):(List[(Int,Int,Int)],Int,Int) = {
    if(i>=0 && k <= arr.length-1 && arr(j)%arr(i)==0 && arr(k)%arr(j) == 0 && arr(j)/arr(i) == arr(k)/arr(j)) {
      processIJK(arr, i-1, j, k+1, (arr(i),arr(j),arr(k))::xs)
    } else (xs,k,i)
  }
  
}