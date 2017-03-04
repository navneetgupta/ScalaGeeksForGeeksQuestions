package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object MaxRepeatingNumber {
  /*
   * http://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/ 
   * 
   * */
  
  /*
   * The naive approach is to run two loops, the outer loop picks an element one by one, the inner loop counts number of 
   * occurrences of the picked element. Finally return the element with maximum count. Time complexity of this approach is O(n^2)*/
  
  /*
   * A better approach is to create a count array of size k and initialize all elements of count[] as 0. Iterate through all elements 
   * of input array, and for every element arr[i], increment count[arr[i]]. Finally, iterate through count[] and return the index with 
   * maximum value. This approach takes O(n) time, but requires O(k) space.*/
  
  /*
   * 1) Iterate though input array arr[], for every element arr[i], increment arr[arr[i]%k] by k (arr[] becomes {2, 11, 11, 29, 11, 12, 1, 15 })

		 2) Find the maximum value in the modified array (maximum value is 29). Index of the maximum value is the maximum repeating element 
		 (index of 29 is 3).

		 3) If we want to get the original array back, we can iterate through the array one more time and do arr[i] = arr[i] % k where i 
		 varies from 0 to n-1.

		How does the above algorithm work? Since we use arr[i]%k as index and add value k at the index arr[i]%k, the index which is equal 
		to maximum repeating element will have the maximum value in the end. Note that k is added maximum number of times at the index 
		equal to maximum repeating element and all array elements are smaller than k.
	*/
  
  def maxRepeatingNumber(arr: Array[Int],k:Int): Int = {
    val n = arr.length
    arr.foldLeft(0)((a,b) => {
      arr(arr(a)%k) = arr(arr(a)%k) + k;
      a+1
    })
    //(max,maxIndx,idx)
    arr.foldLeft((arr(0),0,0))((a,b) => { if(a._1<b)(b,a._3,a._3+1) else (a._1,a._2,a._3+1)})._2
    //arr.indexOf(arr.foldLeft(arr(0))(_ max _)) 
  }
}