package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object Flip0sToMakeMaxConsecutives1s {
  /*
   * http://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/ 
   * 
   * Given a binary array and an integer m, find the position of zeroes flipping which creates maximum number of consecutive 1s in array.
   */

  /*
   * A Simple Solution is to consider every subarray by running two loops. For every subarray, count number of zeroes in it. 
   * Return the maximum size subarray with m or less zeroes. Time Complexity of this solution is O(n2).
   */
  
  /*
   * A Better Solution is to use auxiliary space to solve the problem in O(n) time.
   * For all positions of 0’s calculate left[] and right[] which defines the number of consecutive 1’s to the left of i and 
   * right of i respectively.
   * left[] and right[] can be filled in O(n) time by traversing array once and keeping track of last seen 1 and last seen 0. 
   * While filling left[] and right[], we also store indexes of all zeroes in a third array say zeroes[]. For above example, 
   * this third array stores {2, 5, 6}.Now traverse zeroes[] and for all consecutive m entries in this array, compute the sum 
   * of 1s that can be produced. This step can be done in O(n) using left[] and right[].
   * */
  
  /*
   * An Efficient Solution can solve the problem in O(n) time and O(1) space. The idea is to use Sliding Window for the given array.
   * 
   * The main steps are:
    – While zeroCount is no more than m: expand the window to the right (wR++) and update the count zeroCount.
    – While zeroCount exceeds m, shrink the window from left (wL++), update zeroCount;
    – Update the widest window along the way. The positions of output zeros are inside the best window.
    */
  def findZeros(arr: Array[Int],m:Int): Unit = {
    val (bestL,bestWindow) = processArray(arr, 0, 0, 0, 0, 0, arr.length, m)
    for{
      i <- (0 until bestWindow)
      if(arr(bestL+i) == 0)
    } yield {
      println(bestL+i+ " , ")
    }
  }
  
  def processArray(arr: Array[Int],wl: Int,wr: Int,bestL:Int,bestWindow: Int,zeroCount:Int,n:Int,m:Int) : (Int,Int) = {
    if(wr<n) {
      val (newWr,newZeroC) = if(zeroCount <= m) {
        val zC = if(arr(wr) ==0) (zeroCount+1) else zeroCount
        (wr+1,zC)
      } else (wr,zeroCount)
      val (newWl,newZC) = if(newZeroC > m) {
        val zC2 = if(arr(wl)==0) (newZeroC-1) else newZeroC
        (wl+1,zC2)
      } else (wl,newZeroC)
      if((newWr-newWl) > bestWindow) {
        (newWr-newWl,newWl)
        processArray(arr, newWl, newWr, newWl, newWr-newWl, newZC, n, m)
      } else processArray(arr, newWl, newWr, bestL, bestWindow, newZC, n, m)
    } else (bestL,bestWindow)
  }
}