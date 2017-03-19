package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 19-Mar-2017
 */

object AllSubArrayWithSum0 {
  /*
   * http://www.geeksforgeeks.org/print-all-subarrays-with-0-sum/ 
   */
  
  /*
   * A simple solution is to consider all subarrays one by one and check if sum of every subarray is equal to 0 or not. 
   * The complexity of this solution would be O(n^2).A better approach is to use Hashing. Do following for each element in the array
   * Maintain sum of elements encountered so far in a variable (say sum).
   * If current sum is 0, we found a subarray starting from index 0 and ending at index current index
   * Check if current sum exists in the hash table or not.
   * If current sum exists in the hash table, that means we have subarray(s) present with 0 sum that ends at current index.
   * Insert current sum into the hash table
   * */
  
  def findSubArrays(arr: Array[Int]): List[(Int,Int)] = {
    //sum,xs,map,i
    arr.foldLeft((0,Nil:List[(Int,Int)],Map[Int,List[Int]](),0))((a,b) => {
      val nSum = a._1 + b
      val xs = if(nSum == 0) (0,a._4)::a._2 else a._2
      val nXs = if(a._3.contains(nSum)) {
        val arr = a._3.getOrElse(nSum, List())
        arr.foldLeft(xs)((a1,b1) => {
          (b1+1,a._4)::a1
        })
      } else xs
      val nMap = a._3 + (nSum -> (a._4 :: (a._3.getOrElse(nSum,List()))))
      (nSum,nXs,nMap,a._4+1)
    })._2
  }
  
}