package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object IsLeftOrRigthPositionedArray {
  /*
   * http://www.geeksforgeeks.org/check-if-given-array-can-be-arranged-in-left-or-right-positioned-array/ 
   * Given an array arr[] of size n>4, the task is to check whether the given array can be arranged in the form of Left or Right 
   * positioned array? Left or Right Positioned Array means each element in the array is equal to the number of elements to its 
   * left or number of elements to its right.
   */
  
  /*
   * A simple solution is to generate all possible arrangements (see this article) and check for the Left or Right Positioned Array 
   * condition, if each element in the array satisfies the condition then “YES” else “NO”. Time complexity for this approach is 
   * O(n*n! + n), n*n! to generate all arrangements and n for checking the condition using temporary array.
   */
  
  /*
   * An efficient solution for this problem needs little bit observation and pen-paper work. To satisfy the Left or Right Positioned 
   * Array condition all the numbers in the array should either be equal to index, i or (n-1-i) and arr[i] < n. So we create an 
   * visited[] array of size n and initialize its element with 0. Then we traverse array and follow given steps :
   * If visited[arr[i]] = 0 then make it 1, which checks for the condition that number of elements on the left side of array 
   * arr[0]…arr[i-1] is equal to arr[i]. Else make visited[n-arr[i]-1] = 1, which checks for the condition that number of elements on 
   * the right side of array arr[i+1]…arr[n-1] is equal to arr[i]. Now traverse visited[] array and if all the elements of visited[] 
   * array become 1 that means arrangement is possible “YES” else “NO”.
   */
  
  def leftRight(arr: Array[Int]): Boolean = {
    val n= arr.length
    val visited = Array.fill(n) {false}
    for {
      i <- (0 until n)
      if(arr(i) < n)
    } yield {
      if(!visited(arr(i))) visited(arr(i)) =true
      else visited(n-arr(i)-1) = true
    }
    println(visited.toList)
    println()
    (visited.takeWhile { x => x }).length == n
  }
}