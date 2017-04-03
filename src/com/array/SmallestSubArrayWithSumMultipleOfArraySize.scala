package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 25-Mar-2017
 */

object SmallestSubArrayWithSumMultipleOfArraySize {
  /*
   * http://www.geeksforgeeks.org/smallest-subarray-whose-sum-multiple-size/ 
   * Given an array of size N, we need to find smallest sized subarray whose sum is divisible by array size N.
   * */ 
  
  /*
   * We can solve this problem considering below facts,

      Let S[i] denotes sum of first i elements i.e.  
         S[i] = a[1] + a[2] .. + a[i]
      Now subarray arr(i, i + x) has sum multiple of N then,
        (arr(i] + arr[i+1] + .... + arr[i + x])) % N = 0
        (S[i+x] – S[i] ) % N  = 0
        S[i] % N = S[i + x] % N 
      We need to find the minimum value of x for which the above condition holds. This can be implemented in single iteration with O(N) 
      time-complexity using another array modIdx of size N. Array modIdx is initialized with all elements as -1. modIdx[k] is to be 
      updated with i in each iteration, where k = sum % N.Now in each iteration we need to update modIdx[k] according to the value 
      of sum % N.
   */
  
  def subArraySumWithMultipleOfN(arr: Array[Int]): Unit = {
    val n = arr.length
    val modIdx = Array.fill(n){-1}
    val (minLen,curLen,sum,l,r,idx) = arr.foldLeft((n+1,n+1,0,0,0,0))((a,b) => {
      val nSum = (a._3 + b)%n
      val nCL = if(modIdx(nSum) == -1 && nSum == 0) a._6+1 else a._2
      val n2CL = if(modIdx(nSum) != -1) a._6 - modIdx(nSum) else nCL
      val (nMl,nl,nr) = if(a._1 > n2CL) (n2CL,modIdx(nSum)+1,a._6) else (a._1,a._4,a._5)
      modIdx(nSum) = a._6
      (nMl,n2CL,nSum,nl,nr,a._6+1)
    })
    for {
      i <- (l to r)
    } yield {
      print(arr(i) + " , " )
    }
    
  }
}