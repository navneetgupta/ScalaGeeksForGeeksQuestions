package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 02-Mar-2017
 */

object SubArrayWithGivenSum {
  /*
   * http://www.geeksforgeeks.org/find-subarray-with-given-sum/
   * 
   * Given an unsorted array of nonnegative integers, find a continous subarray which adds to a given number. 
   * */
  
  /*
   * Method 1 (Simple)
   * A simple solution is to consider all subarrays one by one and check the sum of every subarray. Following program implements
   * the simple solution. We run two loops: the outer loop picks a starting point i and the inner loop tries all subarrays starting from i.
   */
  
  def subArraySum(arr: Array[Int],sum: Int) : Unit = {
    processOuterLoop(arr,0,sum,arr.length)
  } 
  
  @tailrec
  def processOuterLoop(arr: Array[Int],idx: Int,sum:Int,n:Int): Unit = {
    if(idx < n) {
      val (isPresent,j):(Boolean,Int) = processSubArray(arr, idx+1, sum, arr(idx),n)
      if(isPresent) println("Founded sub Array between "+ idx + " and " + j)
      else processOuterLoop(arr,idx+1,sum,n)
    } else {
      println("No Sub Array Exists")
    }
    
  }
  
  @tailrec
  def processSubArray(arr: Array[Int],idx: Int,sum:Int,current_sum: Int,n:Int) : (Boolean,Int) = {
    if(idx <= n) {
      if(current_sum  == sum) {
        (true,idx-1)
      } else if(current_sum > sum || idx == n){
        (false,-1)
      } else {
        processSubArray(arr, idx+1, sum, current_sum+arr(idx),n)
      }
    } else {
      (false,-1)
    }
  }
  
  /*
   * Initialize a variable curr_sum as first element. curr_sum indicates the sum of current subarray. 
   * Start from the second element and add all elements one by one to the curr_sum. If curr_sum becomes equal to sum, 
   * then print the solution. If curr_sum exceeds the sum, then remove trailing elemnents while curr_sum is greater than sum
   * */
  
  def subArraySum2(arr:Array[Int],sum: Int) : Unit = {
    processArray(arr, 1, arr(0), 0, sum, arr.length)
  }
  
  def processArray(arr:Array[Int],idx:Int,curr_sum:Int,start:Int,sum:Int,n:Int) : Unit = {
    if(idx <= n) {
      val (newCurr_sum,newStart) = manageCurrentSum(arr,curr_sum,0,sum,idx)
      if(newCurr_sum == sum) {
        println("Founded sub Array between "+ newStart + " and " + (idx-1))
      } else if(idx < n) {
        processArray(arr, idx+1, newCurr_sum+arr(idx), newStart, sum, n)
      } else {
        processArray(arr, idx+1, newCurr_sum, newStart, sum, n)
      }
    } else {
      println("No Sub Array Exists")
    }
  }
  
  @tailrec
  def manageCurrentSum(arr: Array[Int],curr_sum: Int, start: Int,sum:Int,idx:Int) : (Int,Int) = {
    if(curr_sum > sum && start < idx-1) {
      manageCurrentSum(arr, curr_sum-arr(start), start+1, sum, idx)
    } else {
      (curr_sum,start)
    }
  }
}