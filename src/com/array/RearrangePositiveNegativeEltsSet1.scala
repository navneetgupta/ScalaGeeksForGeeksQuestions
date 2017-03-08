package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object RearrangePositiveNegativeEltsSet1 {
  /*
   * http://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/ 
   * Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is 
   * followed by negative and vice-versa maintaining the order of appearance.
   * The above problem can be easily solved if O(n) extra space is allowed. It becomes interesting due to the limitations that
   * O(1) extra space and order of appearances.*/
  
  /*
   * The idea is to process array from left to right. While processing, find the first out of place element in the remaining 
   * unprocessed array. An element is out of place if it is negative and at odd index, or it is positive and at even index. 
   * Once we find an out of place element, we find the first element after it with opposite sign. We right rotate the subarray 
   * between these two elements (including these two).
   * */
  
  def rearrange(arr: Array[Int]) : Array[Int] = {
    val n = arr.length
    processArr(arr,-1,0,n)
  }
  
  def processArr(arr: Array[Int],outOfIdx: Int,idx:Int,size:Int): Array[Int] = {
    if(idx < size) {
      val (nOutOfIdx,nArr) = if(outOfIdx >= 0) {
        if(((arr(idx) >= 0) && (arr(outOfIdx)<0)) || ((arr(idx) < 0) && (arr(outOfIdx)>=0))) {
          val newArr = rightRotate(arr,size,outOfIdx,idx)
          if(idx-outOfIdx >2) {
            (outOfIdx+2,newArr)
          } else (-1,newArr)
        } else (outOfIdx,arr) 
      } else (outOfIdx,arr)
      
      val (n1OutOfIdx) = if(nOutOfIdx == -1) {
        if(((nArr(idx) >= 0) && ((idx & 0x01) == 0)) || ((nArr(idx) < 0) && ((idx & 0x01) == 1))) {
          idx
        } else nOutOfIdx
      } else nOutOfIdx
      
      processArr(nArr, n1OutOfIdx, idx+1, size)
    } else arr
  }
  
  def rightRotate(arr: Array[Int],size: Int,outOfIdx: Int,idx:Int):Array[Int] = {
    val temp = arr(idx)
    for {
      i <- (idx until outOfIdx by -1)
    }yield {
      arr(i) = arr(i-1)
    }
    arr(outOfIdx)=temp
    arr
  }
}