package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object LargestSubArrayWithEqualNo0sAnd1s extends App {
  /*
   * http://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
   * 
   * Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s. Expected time complexity is O(n). */
  
  /*
   * Method 1: 
   *  use two nested loops. The outer loop picks a starting point i. The inner loop considers all subarrays starting from i. 
   *  If size of a subarray is greater than maximum size so far, then update the maximum size.
   *  In the below code, 0s are considered as -1 and sum of all values from i to j is calculated. 
   *  If sum becomes 0, then size of this subarray is compared with largest size so far.*/
  def findSubArray(arr: Array[Int]) {
    //(maxSize,startIdx,idx)
    val (newMaxSize,newStartIdx,i) = arr.foldLeft((-1,0,0))((a,b) => {
      if(a._3 < arr.length-1) {
        val sum = if(b == 0) -1 else 1
         //(maxSize,sum,startIndex,j)
        val (maxSize,newSum,startIdx,j) = arr.drop(a._3 +1).foldLeft((a._1,sum,a._2,a._3+1))((a1,b1) => {
          val newSum = a1._2 + (if(b1 == 0) -1 else 1)
          if(newSum==0 && a1._1 < a1._4 - a._3 + 1){
            (a1._4 - a._3 + 1, 0, a._3, a1._4 +1)
          } else (a1._1,newSum,a1._3,a1._4+1)
        })
        (maxSize,startIdx,a._3+1)
      } else a
    })
    if(newMaxSize == -1){
      println(" No Such Array Exists")
    } else {
      println("Array Exist from "+ newStartIdx+ " to "+ (newStartIdx+newMaxSize-1))
    }
  }
  
  /*
   * Method 2 (Tricky)
      Following is a solution that uses O(n) extra space and solves the problem in O(n) time complexity.
      Let input array be arr[] of size n and maxsize be the size of output subarray.
      1) Consider all 0 values as -1. The problem now reduces to find out the maximum length subarray with sum = 0.
      2) Create a temporary array sumleft[] of size n. Store the sum of all elements from arr[0] to arr[i] in sumleft[i]. This can be done in O(n) time.
      3) There are two cases, the output subarray may start from 0th index or may start from some other index. We will return the max of the values obtained by two cases.
      4) To find the maximum length subarray starting from 0th index, scan the sumleft[] and find the maximum i where sumleft[i] = 0.
      5) Now, we need to find the subarray where subarray sum is 0 and start index is not 0. This problem is equivalent to finding two indexes i & j in sumleft[] such that sumleft[i] = sumleft[j] and j-i is maximum. To solve this, we can create a hash table with size = max-min+1 where min is the minimum value in the sumleft[] and max is the maximum value in the sumleft[]. The idea is to hash the leftmost occurrences of all different values in sumleft[]. The size of hash is chosen as max-min+1 because there can be these many different possible values in sumleft[]. Initialize all values in hash as -1
      6) To fill and use hash[], traverse sumleft[] from 0 to n-1. If a value is not present in hash[], then store its index in hash. If the value is present, then calculate the difference of current index of sumleft[] and previously stored value in hash[]. If this difference is more than maxsize, then update the maxsize.
      7) To handle corner cases (all 1s and all 0s), we initialize maxsize as -1. If the maxsize remains -1, then print there is no such subarray.
	 */
  def findSubArray2(arr:Array[Int]): Unit = {
    val n = arr.length
    val sumLeft = new Array[Int](n)
    arr.foldLeft(0)((a,b) => {arr(a) = (if(b==0) -1 else 1);a+1})
    println(arr.toList)
    val map = Map[Int,Int]()
    //(sum,maxLen,endIdx,idx)
    val (newSum,newMaxLen,newEndIdx,i,newMap) = arr.foldLeft((0,0,-1,0,map))((a,b) => {
      val newSum = a._1 + b
      val (maxLen,endIndex) = (if(newSum == 0)(a._4+1,a._4)else(a._2,a._3))
      val (newMaxLen,newEndIdx,newMap) = 
        (if(a._5.contains(newSum)) {
          if(maxLen < a._4 - a._5.getOrElse(newSum+n, 0))
            (a._4-a._5.getOrElse(newSum+n, 0),a._4,a._5)
          else (maxLen,endIndex,a._5)
        } else {
           val newMap = a._5 + (newSum+n -> a._4)
           (maxLen,endIndex,newMap) 
        })
      (newSum,newMaxLen,newEndIdx,a._4+1,newMap)
    })
    val end = newEndIdx-newMaxLen+1
    if(newMaxLen<1) {
      println("No SubArray Exist")
    } else {
      println("subArray Exists from "+ (newEndIdx-newMaxLen+1) +" to "+ newEndIdx)
    }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}