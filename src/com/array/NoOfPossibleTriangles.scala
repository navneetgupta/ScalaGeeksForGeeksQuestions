package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object NoOfPossibleTriangles {
  /*
   * http://www.geeksforgeeks.org/find-number-of-triangles-possible/ 
   * 
   * Given an unsorted array of positive integers. Find the number of triangles that can be formed with three different array 
   * elements as three sides of triangles. For a triangle to be possible from 3 values, the sum of any two values (or sides) 
   * must be greater than the third value (or third side).
   * */
  
  /*
   * Method 1:
   * The brute force method is to run three loops and keep track of the number of triangles possible so far. 
   * The three loops select three different values from array, the innermost loop checks for the triangle property 
   * ( the sum of any two sides must be greater than the value of third side).*/
  
  /*
   * Method 2: 
   * 
   * Following are steps to count triangle.

      1. Sort the array in non-decreasing order.
      
      2. Initialize two pointers ‘i’ and ‘j’ to first and second elements respectively, and initialize count of triangles as 0.
      
      3. Fix ‘i’ and ‘j’ and find the rightmost index ‘k’ (or largest ‘arr[k]’) such that ‘arr[i] + arr[j] > arr[k]’. 
      The number of triangles that can be formed with ‘arr[i]’ and ‘arr[j]’ as two sides is ‘k – j’. Add ‘k – j’ to count of triangles.
      
      Let us consider ‘arr[i]’ as ‘a’, ‘arr[j]’ as b and all elements between ‘arr[j+1]’ and ‘arr[k]’ as ‘c’. 
      The above mentioned conditions (ii) and (iii) are satisfied because ‘arr[i] < arr[j] < arr[k]'. 
      And we check for condition (i) when we pick 'k' 
      
      4. Increment ‘j’ to fix the second element again.
      
      Note that in step 3, we can use the previous value of ‘k’. The reason is simple, if we know that the value of ‘arr[i] + arr[j-1]’ 
      is greater than ‘arr[k]’, then we can say ‘arr[i] + arr[j]’ will also be greater than ‘arr[k]’, 
      because the array is sorted in increasing order.
      
      5. If ‘j’ has reached end, then increment ‘i’. Initialize ‘j’ as ‘i + 1’, ‘k’ as ‘i+2’ and repeat the steps 3 and 4.
   */
  
  def findNumberOfTraingles(arr: Array[Int]): Int = {
    val n = arr.length
    val sArr = arr.sorted
    val as = for {
      i <- (0 until n-2)
    } yield {
      //(k,count,j)
      sArr.drop(i+1).foldLeft((i+2,0,i+1))((a,b) => {
        val k1 = processArray(sArr,i,a._3,a._1,n)
        (k1,a._2+k1-a._3-1,a._3+1)
      })._2
    }
    if(as.isEmpty) 0 else as.foldLeft(0)(_+_)
  }
  
  def processArray(arr:Array[Int],i: Int,j:Int,k:Int,n:Int): Int = {
    if(k<n && arr(i)+arr(j) > arr(k)) {
      processArray(arr, i, j, k+1, n)
    } else {
      k
    }
  }
}