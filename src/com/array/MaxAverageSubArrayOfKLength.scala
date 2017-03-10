package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object MaxAverageSubArrayOfKLength {
  /*
   * http://www.geeksforgeeks.org/find-maximum-average-subarray-of-k-length/ 
   * Given an array with positive and negative numbers, find the maximum average subarray of given length.
   * */
  
  /*
   * A Simple Solution is to run two loops. The outer loop picks starting point, the inner loop goes till length ‘k’ from the 
   * starting point and computes average of elements. Time complexity of this solution is O(n*k).
   */
  
  /*
   * A Better Solution is to create an auxiliary array of size n. Store cumulative sum of elements in this array. Let the array be csum[]. 
   * csum[i] stores sum of elements from arr[0] to arr[i]. Once we have csum[] array with us, we can compute sum between two indexes in O(1) time.
   * Time Complexity of above solution is O(n), but it requires O(n) auxiliary space.
	 */
  
  def findAvgMax(arr: Array[Int],k:Int) : Int = {
    val n = arr.length
    if(k > n) -1
    else {
      val csum = new Array[Int](n)
      csum(0) =arr(0)
      arr.drop(1).foldLeft(1)((a,b) => {
        csum(a) = csum(a-1) +b
        a+1
      })
      //k,maxSum,maxEnd
      csum.drop(k).foldLeft((k,csum(k-1),k-1))((a,b) => {
        val currSum = b - csum(a._1-k)
        if(currSum > a._2) {
          (a._1+1,currSum,a._1)
        } else (a._1+1,a._2,a._3)
      })._3 - k +1
    }
  }
  
  /*
   * We can avoid need of extra space by using below Efficient Method.
      1) Compute sum of first ‘k’ elements, i.e., elements arr[0..k-1]. Let this sum be ‘sum’. Initialize ‘max_sum’ as ‘sum’
      2) Do following for every element arr[i] where i varies from ‘k’ to ‘n-1’
      …….a) Remove arr[i-k] from sum and add arr[i], i.e., do sum += arr[i] – arr[i-k]
      …….b) If new sum becomes more than max_sum so far, update max_sum.
      3) Return ‘max_sum’
   */
  /*
   * for (int i=k; i<n; i++)
    {
        int sum = sum + arr[i] - arr[i-k];
        if (sum > max_sum)
        {
            max_sum = sum;
            max_end = i;
        }
    }
 */
  def findAvgMax2(arr: Array[Int],k:Int) : Int = {
    val n =  arr.length
    if(k>n) -1 
    else {
      val as = (1 to k)
      val maxSum = as.toList.foldLeft(arr(0))((a,b) => {
        a+arr(b)
      })
      //(i,maxSum,maxEnd,sum)
      arr.drop(k).foldLeft((k,maxSum,k-1,maxSum))((a,b) => {
        val sumN = a._4 + b - arr(a._1 - k)
        if(sumN > a._2) {
          (a._1+1,sumN,a._1,sumN)
        } else {
          (a._1+1,a._2,a._3,sumN)
        }
      })._3-k+1
    }
  }
  
}