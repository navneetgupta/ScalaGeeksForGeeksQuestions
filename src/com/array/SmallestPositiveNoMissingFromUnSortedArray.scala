package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object SmallestPositiveNoMissingFromUnSortedArray {
  /*
   * http://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/ 
   * You are given an unsorted array with both positive and negative elements. 
   * You have to find the smallest positive number missing from the array in O(n) time using constant extra space.
   * */
  
  /*
   * A naive method to solve this problem is to search all positive integers, starting from 1 in the given array. 
   * We may have to search at most n+1 numbers in the given array. So this solution takes O(n^2) in worst case
   * */
  
  /*
   * We can use sorting to solve it in lesser time complexity. We can sort the array in O(nLogn) time. Once the array is sorted, 
   * then all we need to do is a linear scan of the array. So this approach takes O(nLogn + n) time which is O(nLogn).
   * */
  
  /*
   * We use array elements as index. To mark presence of an element x, we change the value at the index x to negative. 
   * But this approach doesn’t work if there are non-positive (-ve and 0) numbers. So we segregate positive 
   * from negative numbers as first step and then apply the approach.
   * */
  
  def segregratePositivenegatives(arr: Array[Int]): (Array[Int],Int) = {
    val as = arr.foldLeft((0,0))((a,b) => {
      if(b <=0) {
        val temp = b
        arr(a._2) = arr(a._1)
        arr(a._1) = temp
        (a._1+1,a._2+1)
      } else {
        (a._1,a._2+1)
      }
    })
    (arr,as._1)
  }
  
  def findMissing(arr: Array[Int]):Int = {
    val (newArr,idx) = segregratePositivenegatives(arr)
    findMissingPositive(newArr.drop(idx))
  }
  
  def findMissingPositive(arr: Array[Int]): Int = {
    val n = arr.length
    for {
      i <- (0 until n)
      if(math.abs(arr(i))-1 < n && arr(math.abs(arr(i))-1)>0)
    } yield {
      arr(math.abs(arr(i))-1) = - arr(math.abs(arr(i))-1)
    }
    val as = for {
      i <- (0 until n) 
      if(arr(i)>0)
    } yield(i+1)
    
    if(as.isEmpty) n+1 else as.head
  }
  
}