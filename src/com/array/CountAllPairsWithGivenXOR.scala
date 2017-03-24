package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object CountAllPairsWithGivenXOR {
  /*
   * http://www.geeksforgeeks.org/count-pairs-given-xor/ 
   * Given an array of distinct positive integers and a number x, find the number of pairs of integers in the array whose XOR is equal to x. 
   * */
  
  /*A Simple solution is to traverse each element and check if there’s another number whose XOR with it is equal to x. 
   * This solution takes O(n2) time*/
  
  /*
   * An efficient solution of this problem take O(n) time. The idea is based on the fact that arr[i] ^ arr[j] is equal to x if and only if arr[i] ^ x is equal to arr[j].

      1) Initialize result as 0.
      2) Create an empty hash set "s".
      3) Do following for each element arr[i] in arr[]
         (a)	If x ^ arr[i] is in "s", then increment result by 1.
         (b)	Insert arr[i] into the hash set "s".
      3) return result.
   * */
  
  def xorPairCount(arr: Array[Int],x :Int) : Int = {
    arr.foldLeft((Nil:List[Int],0))((a,b) => {
      val nResult = if(a._1.contains(x ^ b)) a._2+1 else a._2
      (b:: a._1,nResult)
    })._2
  }
  
  
  /*
   * How to handle duplicates?
   * The above efficient solution doesn’t work if there are duplicates in input array. For example, the above solution produces 
   * different results for {2, 2, 5} and {5, 2, 2}. To handle duplicates, we store counts of occurrences of all elements. We use 
   * unordered_map instead of unordered_set.*/
  
  def xorPairCount2(arr: Array[Int],x:Int): Int = {
    val map = Map[Int,Int]()
    arr.foldLeft((map,0))((a,b) => {
      val curXor = x ^ b
      val nRes = a._1.get(curXor) match  {
        case None => a._2
        case Some(k) => k + a._2
      }
      val nMap = a._1 + (b -> (a._1.getOrElse(b,0)+1))
      (nMap,nRes)
    })._2
  }
}