package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object MaxSumiAiWithOneMaxRotation {
  /*
   * http://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/ 
   * 
   * Given an array, only rotation operation is allowed on array. We can rotate the array as many times as we want. 
   * Return the maximum possbile of summation of i*arr[i].
   * */
  
  /*
   * A Simple Solution is to find all rotations one by one, check sum of every rotation and return the maximum sum. 
   * Time complexity of this solution is O(n2).
   */
  
  /*
   * We can solve this problem in O(n) time using an Efficient Solution.
      Let Rj be value of i*arr[i] with j rotations. The idea is to calculate next rotation value from previous rotation, i.e., calculate Rj from Rj-1. We can calculate initial value of result as R0, then keep calculating next rotation values.
      
      How to efficiently calculate Rj from Rj-1?
      This can be done in O(1) time. Below are details.
      
      Let us calculate initial value of i*arr[i] with no rotation
      R0 = 0*arr[0] + 1*arr[1] +...+ (n-1)*arr[n-1]
      
      After 1 rotation arr[n-1], becomes first element of array, 
      arr[0] becomes second element, arr[1] becomes third element
      and so on.
      R1 = 0*arr[n-1] + 1*arr[0] +...+ (n-1)*arr[n-2]
      
      R1 - R0 = arr[0] + arr[1] + ... + arr[n-2] - (n-1)*arr[n-1]
      
      Where arrSum is sum of all array elements, i.e., 

			arrSum = ∑ arr[i]
        i<=0<=n-1 
        
        1) Compute sum of all array elements. Let this sum be 'arrSum'.

        2) Compute R0 by doing i*arr[i] for given array. 
           Let this value be currVal.
        
        3) Initialize result: maxVal = currVal // maxVal is result.
        
        // This loop computes Rj from  Rj-1 
        4) Do following for j = 1 to n-1
        ......a) currVal = currVal + arrSum-n*arr[n-j];
        ......b) If (currVal > maxVal)
                    maxVal = currVal   
        
        5) Return maxVal
   * */
  
  def maxSum(arr: Array[Int]): Int = {
    val n = arr.length
    
    val (aiSum,iAiSum,idx) = arr.foldLeft((0,0,0))((a,b) => {
      (a._1+b,a._2+(b*a._3),a._3+1)
    })
    //maxVal,currVal
    arr.drop(1).foldRight((iAiSum,iAiSum))((a,b) => {
      val newIAiSum = b._2+aiSum - n*a
      if(newIAiSum > b._1) (newIAiSum,newIAiSum) else (b._1,newIAiSum)
    })._1
  }
  
  
  
  
  
}