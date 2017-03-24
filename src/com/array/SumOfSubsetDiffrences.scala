package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object SumOfSubsetDiffrences {
  /*
   * http://www.geeksforgeeks.org/sum-subset-differences/ 
   * Given a set S consisting of n numbers, find the sum of difference between last and first element of each subset. 
   * We find first and last element of every subset by keeping them in same order as they appear in input set S.
   */
  
  /*
   * A simple solution for this problem is to find the difference between the last and first element for each subset s of set S and 
   * output the sum of ll these differences. Time complexity for this approach is O(2n).
   */
  
  /*
   * An efficient solution to solve the problem in linear time complexity.
      We are given a set S consisting of n numbers, and we need to compute the sum of difference between last and first element of each subset of S, i.e.,
      sumSetDiff(S) = ∑ (last(s) – first(s)), where sum goes over all subsets s of S.
      Equivalently,
      sumSetDiff(S) = ∑ (last(s)) – ∑ (first(s)),
      In other words, we can compute the sum of last element of each subset, and the sum of first element of each subset separately, and then compute their difference.
      
      Let us say that the elements of S are {a1, a2, a3,…, an}. Note the following observation:
      
      Subsets containing element a1 as the first element can be obtained by taking any subset of {a2, a3,…, an} and then including a1 into it. Number of such subsets will be 2n-1.
      Subsets containing element a2 as the first element can be obtained by taking any subset of {a3, a4,…, an} and then including a2 into it. Number of such subsets will be 2n-2.
      Subsets containing element ai as the first element can be obtained by taking any subset of {ai, a(i+1),…, an} and then including ai into it. Number of such subsets will be 2n-i.
      
      
      Therefore, the sum of first element of all subsets will be:
      SumF = a1.2n-1 + a2.2n-2 +…+ an.1
      
      In a similar way we can compute the sum of last element of all subsets of S (Taking at every step ai as last element instead of first element and then obtaining all the subsets).
      SumL = a1.1 + a2.2 +…+ an.2n-1
      
      Finally, the answer of our problem will be SumL – SumF.
      
   */
  
  def findSumOfSubSets(arr: Array[Int]): Double = {
    val n = arr.length
    val sumF = arr.foldLeft((0:Double,0))((a,b) => (a._1 + b * math.pow(2,n-a._2-1),a._2+1))._1
    val sumL = arr.foldLeft((0:Double,0))((a,b) => (a._1 + b * math.pow(2,a._2),a._2+1))._1
    sumL-sumF
  }
}