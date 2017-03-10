package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 09-Mar-2017
 */

object CountFrequenciesOfAllElts {
  
  /*
   * http://www.geeksforgeeks.org/count-frequencies-elements-array-o1-extra-space-time/ 
   * Given an unsorted array of n integers which can contain integers from 1 to n. 
   * Some elements can be repeated multiple times and some other elements can be absent from the array. 
   * Count frequency of all elements that are present and print the missing elements.*/
  
  /*
   * A Simple Solution is to create a count array of size n as the elements are in range from 1 to n. This solution works in O(n) time, 
   * but requires O(n) extra space.*/
  
  /*
   * Method 1 (By making elements negative)
   *  The idea is to traverse the given array, use elements as index and store their counts at the index. For example, when we see element 7,
   *  we go to index 6 and store the count. There are few problems to handle, one is the counts can get mixed with the elements, 
   *  this is handled by storing the counts as negative. Other problem is loosing the element which is replaced by count, this is 
   *  handled by first storing the element to be replaced at current index.
   *  */
  
  def findCounts(arr: Array[Int]) : Unit = {
    val ar = processArray(arr,0,arr.length)
    ar.foldLeft(0)((a,b) => {
      println(a+1 + " -> " + math.abs(b))
      a+1
    })
  }
  
  @tailrec
  def processArray(arr: Array[Int],i:Int,n:Int) : Array[Int] = {
    if(i < n) {
      if(arr(i) <= 0) {
        processArray(arr,i+1,n)
      } else { 
        val eltIdx = arr(i) - 1
        if(arr(eltIdx) > 0) {
          arr(i) = arr(eltIdx)
          arr(eltIdx) = -1
          processArray(arr,i,n)
        } else {
          arr(eltIdx) = arr(eltIdx) - 1
          arr(i) = 0
          processArray(arr, i+1, n)
        }
      }
    } else arr
  }
  
  /*
   * Method 2 (By adding n to keep track of counts)

    1)  Subtract 1 from every element so that the elements
        become in range from 0 to n-1
        for (int j =0; j < n; j++)
            arr[j] = arr[j]-1;
    
    2)  Use every element arr[i] as index and add 'n' to
        element present at arr[i]%n to keep track of count of
        occurrences of arr[i]
        for (int i=0; i < n; i++)
            arr[arr[i]%n] = arr[arr[i]%n] + n;
    
    3)  To print counts, simply print the number of times n
        was added at index corresponding to every element
        for (int i =0; i < n; i++)
            print "(i + 1) -> arr[i] " 
  */
  
  def findCounts2(arr: Array[Int]): Unit = {
    arr.foldLeft(0)((a,b) => {
      arr(a) = b-1
      a+1
    })
    val n = arr.length
    arr.foldLeft(0)((a,b) => {
      arr(b%n) = arr(b%n) + n
      a+1
    })
    
    arr.foldLeft(0)((a,b) => {
      println(a+1 + " -> " + (b/n))
      a+1
    })
  }
           
}