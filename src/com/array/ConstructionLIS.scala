package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object ConstructionLIS {
  /*
   * http://www.geeksforgeeks.org/construction-of-longest-monotonically-increasing-subsequence-n-log-n/ 
   * 
   * Check below url for explaination
   * http://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
   * */
  
//  def LIS(arr: Array[Int]) = {
//    val n = arr.length
//    val tailIndices = Array.fill(n){0}
//    val prevIndices = Array.fill(n){-1}
//    tailIndices(0) = arr(0)
//    //(len,idx,tailIndices)
//    val len = arr.foldLeft((1,0))((a,b) => {
//      if(b < arr(tailIndices(0))) {
//        tailIndices(0) = a._2
//        (a._1,a._2+1)
//      } else if(b > arr(tailIndices(a._1-1))) {
//        prevIndices(a._2) = tailIndices(a._1-1)
//        tailIndices(a._1) = a._2
//        (a._1+1,a._2+1)
//      } else {
//        val pos = getCeilIndex(arr,tailIndices,-1,a._1-1,b)
//        prevIndices(a._2) = tailIndices(pos-1)
//        tailIndices(pos-1) = a._2
//        (a._1,a._2+1)
//      }
//    })._1
//    processArray(arr,prevIndices,tailIndices(len-1))
//  }
  
  def LIS2(arr: Array[Int]) = {
    val n = arr.length
    val tailIndices = Array.fill(n){0}
    tailIndices(0) = arr(0)
    //len,tailInidces
    arr.drop(1).foldLeft((1,tailIndices))((a,b) => {
      if(b < a._2(0)) {
        a._2(0) = b
        a
      } else if(b > a._2(a._1-1)) {
        a._2(a._1) = b
        (a._1+1,a._2)
      } else {
        val (pos,newTailIndices) = getCeilIndex2(a._2, -1,a._1-1, b)
        newTailIndices(pos) = b
        (a._1,newTailIndices)
      }
    })._1
  }
  
//  def processArray(arr: Array[Int],prev: Array[Int],i:Int) : Unit = {
//    if(i>=0) {
//      print(arr(i) + " , ")
//      processArray(arr,prev,prev(i))
//    } else print(" ")
//  }
//  def getCeilIndex(arr: Array[Int],arrT : Array[Int],l:Int,r: Int,key: Int) : Int = {
//    if(r-l >1) {
//      val m = l + (r-l)/2
//      val (r1,l1) = if(arr(arrT(m)) >= key) (m,l) else (r,m) 
//      getCeilIndex(arr, arrT, l1, r1, key)
//    } else r
//  }
  def getCeilIndex2(arr: Array[Int],l:Int,r: Int,key: Int) : (Int,Array[Int]) = {
    if(r-l >1) {
      val m = l + (r-l)/2
      val (r1,l1) = if(arr(m) >= key) (m,l) else (r,m) 
      getCeilIndex2(arr, l1, r1, key)
    } else (r,arr)
  }
}