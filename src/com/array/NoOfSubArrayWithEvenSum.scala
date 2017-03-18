package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object NoOfSubArrayWithEvenSum {
  
  /*
   * http://www.geeksforgeeks.org/find-number-subarrays-even-sum/ 
   * Given an array, find the number of subarrays whose sum is even. 
   * */
  
  /*
   * O(n2) time and O(1) space method [Brute Force]
   * We can simply generate all the possible sub-arrays and find whether the sum of all the elements in them is an even or not. 
   * If it is even then we will count that sub-array otherwise neglect it.
   * */
  
  def findNoOfSubArray(arr: Array[Int]): Int = {
    //result,indx
    arr.foldLeft((0,0))((a,b) => {
      //result,sum
      val res = arr.drop(a._2).foldLeft((a._1,0))((a1,b1) => {
        val newSum = a1._2 + b1
        if(newSum % 2 == 0) (a1._1+1,newSum)
        else (a1._1,newSum)
      })._1
      println(res)
      (res,a._2+1)
    })._1
  }
  
  /*
   * O(n) Time and O(1) Space Method [Efficient]
   * If we do compute the cumulative sum array in temp[] of our input array, then we can see that the sub-array starting from i 
   * and ending at j, has an even sum if temp[] if (temp[j] – temp[i]) % 2 = 0. So, instead of building a cumulative sum array 
   * we build a cumulative sum modulo 2 array, and find how many times 0 and 1 appears in temp[] array using handshake formula. 
   * [n * (n-1) /2]
   * */
  
  /*
   * // A temporary array of size 2. temp[0] is
    // going to store count of even subarrays
    // and temp[1] count of odd.
    // temp[0] is initialized as 1 because there
    // a single even element is also counted as
    // a subarray
    int temp[2] = {1, 0};
 
    // Initialize count.  sum is sum of elements
    // under modulo 2 and ending with arr[i].
    int result = 0, sum = 0;
 
    // i'th iteration computes sum of arr[0..i]
    // under modulo 2 and increments even/odd count
    // according to sum's value
    for (int i=0; i<=n-1; i++)
    {
        // 2 is added to handle negative numbers
        sum = ( (sum + arr[i]) % 2 + 2) % 2;
 
        // Increment even/odd count
        temp[sum]++;
    }
 
    // Use handshake lemma to count even subarrays
    // (Note that an even cam be formed by two even
    // or two odd)
    result = result + (temp[0]*(temp[0]-1)/2);
    result = result + (temp[1]*(temp[1]-1)/2);
 
    return (result);*/
  
  def countEvenSum(arr: Array[Int]): Int = {
    val n = arr.length
    val temp = Array(1,0)
    //sum
    arr.foldLeft(0)((a,b) => {
      val nSum = ((a + b)%2 +2)%2
      println("nSum ==" + nSum)
      temp(nSum) = temp(nSum) + 1
      nSum
    })
    val r1 = temp(0)*(temp(0)-1)/2
    r1 + temp(1) * (temp(1)-1)/2
    
  }
}