package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object PairWithGivenProductSet1 {
 
  /*
   * http://www.geeksforgeeks.org/pair-with-given-product-set-1-find-if-any-pair-exists/ 
   * 
   * Given an array and a number x, find if there is a pair with product equal to x. 
   * */
  
  /*
   * Naive approach ( O(n2) ) is to run two loops to consider all possible pairs. For every pair, check if product is equal to x or not. 
   * */
  
  def isPairExist(arr: Array[Int],x: Int): (Boolean,List[(Int,Int)]) = {
    val n = arr.length
    val xs = for {
      i <- (0 until n-1)
      j <- (i to n-1)
      if(arr(i)*arr(j) == x)
    } yield (i,j)
    
    if(xs.isEmpty) (false,Nil) else (true,xs.toList)
  }
  
  /*
   * Efficient Solution ( O(n) ): We can improve time complexity to O(n) using hashing. Below are steps.

    Create an empty hash table
    Traverse array elments and do following for every element arr[i].
        If arr[i] is 0 and x is also 0, return true, else ignore arr[i].
        If x % arr[i] is 0 and x/arr[i] exists in table, return true.
        Insert arr[i] into the hash table.
    Return false
   * */
  
  def isPairExist2(arr: Array[Int],x: Int): (Boolean,List[(Int,Int)]) = {
    val n = arr.length
    if(n < 2) (false,Nil)
    else {
      if(arr.contains(0) && x==0) (true,getListSinceZer(arr))
      else {
        val xs = arr.foldLeft(Set[Int](),List[(Int,Int)]())((a,b) => {
          if(b==0) a
          else {
            if(x%b ==0) {
              if(a._1.contains(x/b)) (a._1,(b,x/b)::a._2)
              else (a._1+b,a._2)
            } else a
          }
        })._2
        if(xs.isEmpty) (false,Nil) else (true,xs)
      }
    }
  }
  
  def getListSinceZer(arr: Array[Int]): List[(Int,Int)] = {
    val zeroIndx = arr.indexOf(0)
    val xs = for {
      i <- (0 to arr.length-1)
    } yield (0,arr(i))
    xs.toList
  }
}