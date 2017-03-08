package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object NutsAndBoltsPrblm {
  /*
   * http://www.geeksforgeeks.org/nuts-bolts-problem-lock-key-problem/ 
   * */
  
  /*
   * Brute force Way: Start with the first bolt and compare it with each nut until we find a match. In the worst case we require n 
   * comparisons. Doing this for all bolts gives us O(n^2) complexity.
   * */
  
  /*
   * 
   * Quick Sort Way: We can use quick sort technique to solve this. We represent nuts and bolts in character array for understanding the logic.

      Nuts represented as array of character
      char nuts[] = {‘@’, ‘#’, ‘$’, ‘%’, ‘^’, ‘&’}
      
      Bolts represented as array of character
      char bolts[] = {‘$’, ‘%’, ‘&’, ‘^’, ‘@’, ‘#’}
      
      This algorithm first performs a partition by picking last element of bolts array as pivot, rearrange the array of nuts and 
      returns the partition index ‘i’ such that all nuts smaller than nuts[i] are on the left side and all nuts greater than nuts[i] 
      are on the right side. Next using the nuts[i] we can partition the array of bolts. Partitioning operations can easily be 
      implemented in O(n). This operation also makes nuts and bolts array nicely partitioned. Now we apply this partitioning 
      recursively on the left and right sub-array of nuts and bolts.
      
      As we apply partitioning on nuts and bolts both so the total time complexity will be Θ(2*nlogn) = Θ(nlogn) on average.
   */
  
  def matchPairs(nuts: Array[Char],bolts: Array[Char],low: Int,high:Int):(Array[Char],Array[Char]) = {
    if(low<high) {
      // Choose last character of bolts array for nuts partition.
      val (pivot,newNuts) = partition(nuts,low,high,bolts(high))
      val (pivot2,newBolts) = partition(bolts, low, high, newNuts(pivot))
      val (newNuts1,newBolts1) = matchPairs(newNuts, newBolts, low, pivot-1)
      matchPairs(newNuts1, newBolts1, pivot+1, high)
    } else (nuts,bolts)
  }
  
  def partition(arr: Array[Char],low: Int,high: Int,pivot: Char) : (Int,Array[Char]) = {
    val (i,newArr) = processArr(arr,low,low,pivot,high)
    val temp2 = newArr(i)
    newArr(i) = newArr(high)
    newArr(high) = temp2
    (i,newArr)
  }
  
  @tailrec
  def processArr(arr: Array[Char],i: Int,j: Int,pivot: Char,high:Int):(Int,Array[Char]) = {
    if(j<high) {
      if(arr(j) < pivot) {
        val temp1 = arr(i)
        arr(i) = arr(j)
        arr(j) = temp1
        processArr(arr, i+1, j+1, pivot, high)
      } else if(arr(j) == pivot) {
        val temp1 = arr(j)
        arr(j) = arr(high)
        arr(high) = temp1
        processArr(arr, i, j, pivot, high)
      } else processArr(arr, i, j+1, pivot, high)
    } else (i,arr)
  }
  
}