package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Mar-2017
 */

object LargestProductOfSubArrayOfSizeK {
  /*
   * http://www.geeksforgeeks.org/largest-product-subarray-size-k/ 
   * 
   * Given an array consisting of n positive integers, and an integer k. Find the largest product subarray of size k, i.e., 
   * find maximum produce of k contiguous elements in the array where k <= n.
   * */
  
  /*
   * Method 1 (Simple : O(n*k))
   * A Naive approach would be to consider all the subarrays of size k one by one. Such a approach would require two loops 
   * hence the complexity would be O(n*k).
   */
  
  /*
   * Method 2 (Efficient : O(n))

    We can solve it in O(n) by using the fact that product of a subarray of size k can be computed in O(1) time 
    if we have product of previous subarray available with us.
    curr_product = (prev_product / arr[i-1]) * arr[i + k -1]
    
    prev_product : Product of subarray of size k beginning 
                   with arr[i-1]
    
    curr_product : Product of subarray of size k beginning 
                   with arr[i]
    In this way we can compute the maximum k size subarray product in only one traversal.
	*/
  
  def findMaxProduct(arr: Array[Int],k:Int): Int = {
    val n = arr.length
    val maxPRod = arr.take(k).foldLeft(1)(_*_)
    //MaxP,prevP
    ((1 to n-k).toList).foldLeft((maxPRod,maxPRod))((a,b) => {
      val curP = (a._2/arr(b-1))*arr(b+k-1)
      (List(a._1,curP).max,curP)
    })._1
  }
}