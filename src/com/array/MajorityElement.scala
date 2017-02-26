package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 26-Feb-2017
 */

object MajorityElement extends App{
  /*
   * http://www.geeksforgeeks.org/majority-element/
   * 
   * METHOD 1 (Basic)
      The basic solution is to have two loops and keep track of maximum count for all different elements. If maximum count becomes greater than n/2 then break the loops and return the element having maximum count. If maximum count doesn’t become more than n/2 then majority element doesn’t exist.
      
      Time Complexity: O(n*n).
      Auxiliary Space : O(1).
      
       
      
     METHOD 2 (Using Binary Search Tree)
      Thanks to Sachin Midha for suggesting this solution. Node of the Binary Search Tree (used in this approach) will be as follows.
      
      struct tree
      {
        int element;
        int count;
      }BST;
      
      Method 3: (Moore Voting Algorithm):
      This is a two step process.
1. Get an element occurring most of the time in the array. This phase will make sure that if there is a majority element then it will return that only.
2. Check if the element obtained from above step is majority element.

1. Finding a Candidate:
The algorithm for first phase that works in O(n) is known as Moore’s Voting Algorithm. Basic idea of the algorithm is if we cancel out each occurrence of an element e with all the other elements that are different from e then e will exist till end if it is a majority element.
      
   * */
  
  def findCandidate(arr: Array[Int]): Int = {
    arr((arr.toList.tail.view.zipWithIndex foldLeft (0,1) ) {
      (acc,e) => 
        if(arr(acc._1)== e._1) {
          val newCount = acc._2+1
          checkBreakPoints(acc._1,newCount,e._2+1)
        }else {
          val newCount = acc._2-1
          checkBreakPoints(acc._1,newCount,e._2+1)
        }
      }._1)
  } 
  
  def checkBreakPoints(majIndex:Int,count:Int,index:Int): (Int,Int) = {
    if(count!=0) {
      (majIndex,count)
    } else {
      (index,1)
    }
  }
  
  def isMajority(arr:Array[Int],candidate:Int) : Boolean = 
    if(arr.foldLeft(0)((a,b) => if(b==candidate)a+1 else a) > arr.length/2) true else false
  
  
  def printMajority(arr:Array[Int]) : Option[Int] = {
    val candidate = findCandidate(arr)
    if(isMajority(arr, candidate)) Some(candidate) else None
  }
  
  
}