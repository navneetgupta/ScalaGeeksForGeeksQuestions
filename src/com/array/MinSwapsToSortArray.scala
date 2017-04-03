package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object MinSwapsToSortArray {
  /*
   * http://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/ 
   * Given an array of n distinct elements, find the minimum number of swaps required to sort the array.
   * */
  /*
   * This can be easily done by visualizing the problem as a graph. We will have n nodes and an edge directed from node i to node j 
   * if the element at i’th index must be present at j’th index in the sorted array.
   * he graph will now contain many non-intersecting cycles. Now a cycle with 2 nodes will only require 1 swap to reach the correct 
   * ordering, similarly a cycle with 3 nodes will only require 2 swap to do so.
   * */
  
  def minSwaps(arr: Array[Int]): Int = {
    val n  = arr.length
    val ans = new Array[(Int,Int)](n)
    for {
      i <- (0 to n-1)
    } yield ans(i) = (arr(i),i)
    val sArr = ans.sortBy(x => x._1)
    val visited = Array.fill(n) {false}
    println(sArr.toList)
    processArr(sArr,visited,0,n,0)
  }
  
  def processArr(arr: Array[(Int,Int)],vis: Array[Boolean],i:Int,n: Int,ans: Int) : Int = {
    if(i < n) {
      if(vis(i) || (arr(i)._2 == i)) processArr(arr, vis, i+1, n, ans)
      else {
        val (cycleSize,nVis) = processVisitedArr(arr, vis, i, 0)
        processArr(arr, nVis, i+1, n, ans+cycleSize-1)
      }
    } else ans
  }
  
  def processVisitedArr(arr: Array[(Int,Int)],vis: Array[Boolean],j: Int,cycleSize: Int) : (Int,Array[Boolean]) = {
    if(!vis(j)) {
      vis(j) = true
      val nJ = arr(j)._2
      processVisitedArr(arr, vis, nJ, cycleSize+1)
    } else (cycleSize,vis)
  }
}