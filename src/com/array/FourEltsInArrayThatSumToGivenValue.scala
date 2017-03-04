package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object FourEltsInArrayThatSumToGivenValue {
  /*
   * http://www.geeksforgeeks.org/find-four-numbers-with-sum-equal-to-given-sum/ 
   * */
  
  /*
   * A Naive Solution is to generate all possible quadruples and compare the sum of every quadruple with X. 
   * The following code implements this simple method using four nested loops
   * */
  def findFourElt(arr: Array[Int],x:Int):List[Int] = {
    val n = arr.length
    val as = for{
      i <- (0 until n-3)
      j <- (i+1 until n-2)
      k <- (j+1 until n-1)
      l <- (k+1 until n)
      if(arr(i)+arr(j)+arr(k)+arr(l)==x)
    } yield(List(arr(i),arr(j),arr(k),arr(l)))
    if(as.isEmpty) Nil else as.head
  }
  
  /*
   * The time complexity can be improved to O(n^3) with the use of sorting as a preprocessing step, and then using method 1 of this 
   * post to reduce a loop.
   * Following are the detailed steps.
      1) Sort the input array.
			2) Fix the first element as A[i] where i is from 0 to n–3. After fixing the first element of quadruple, 
			fix the second element as A[j] where j varies from i+1 to n-2. Find remaining two elements in O(n) time, 
			using the method 1 of this post
	  */
  
  def findFourElts2(arr: Array[Int], x: Int): Unit = {
    val n = arr.length
    val sortedArray = arr.sorted
    val as = for {
      i <- (0 to n-3)
      j <- (i+1 to n-2)
    } yield {
      findTwoOtherIdx(sortedArray, j+1, n-1, List(sortedArray(i),sortedArray(j)), x)
    }
  }
  
  def findTwoOtherIdx(arr:Array[Int],l:Int,r:Int,xs : List[Int],x:Int) : List[Int] = {
    if(l<r) {
      val fourEltSum = xs.foldLeft(0)(_+_)+arr(l)+arr(r)
      if(fourEltSum == x) {
        println(arr(l)::arr(r)::xs)
        findTwoOtherIdx(arr, l+1, r-1, arr(l)::arr(r)::xs, x)
      } else if (fourEltSum < x) findTwoOtherIdx(arr, l+1, r, xs, x)
      else findTwoOtherIdx(arr, l, r-1, xs, x)
    } else {
      xs
    }
  }
}