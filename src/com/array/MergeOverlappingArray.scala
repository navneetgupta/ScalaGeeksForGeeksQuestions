package com.array

import scala.collection.mutable.Stack

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */


object MergeOverlappingArray {
  /*
   * http://www.geeksforgeeks.org/merging-intervals/ 
   * 
   * Given a set of time intervals in any order, merge all overlapping intervals into one and output the result which should have only 
   * mutually exclusive intervals. Let the intervals be represented as pairs of integers for simplicity. For example, let the given set 
   * of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap with each other, so they should be merged and 
   * become {1, 4}. Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
   * */
  
  /*
   * A simple approach is to start from the first interval and compare it with all other intervals for overlapping, if it overlaps with any 
   * other interval, then remove the other interval from list and merge the other into the first interval. Repeat the same steps for remaining 
   * intervals after first. This approach cannot be implemented in better than O(n^2) time.*/
  
  /*
   * An efficient approach is to first sort the intervals according to starting time. Once we have the sorted intervals, 
   * we can combine all intervals in a linear traversal. The idea is, in sorted array of intervals, 
   * if interval[i] doesn’t overlap with interval[i-1], then interval[i+1] cannot overlap with interval[i-1] because starting time 
   * of interval[i+1] must be greater than or equal to interval[i]. Following is the detailed step by step algorithm.
      1. Sort the intervals based on increasing order of 
          starting time.
      2. Push the first interval on to a stack.
      3. For each interval do the following
         a. If the current interval does not overlap with the stack 
             top, push it.
         b. If the current interval overlaps with stack top and ending
             time of current interval is more than that of stack top, 
             update stack top with the ending  time of current interval.
      4. At the end stack contains the merged intervals. 
   * */
  
  def mergeOverlappingArray(arr:Array[(Int,Int)]): List[(Int,Int)] = {
    val n = arr.length
    if(n<=0) {
      arr.toList
    } else {
      val sorted = arr.sortWith((a,b) => a._1 < b._1)
      val stk = Stack[(Int,Int)]()
      stk.push(sorted(0))
      sorted.drop(1).foldLeft(1)((a,b) => {
        val (strt,end) = stk.top
        if(end < b._1) {
          stk.push(b)
          a+1
        } else if(end < b._2) {
          stk.pop()
          stk.push((strt,b._2))
          a+1
        } else {
          a+1
        }
      })
      stk.toList
    }
  }
  
}