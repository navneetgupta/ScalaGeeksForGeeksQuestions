package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 01-March-2017
 */

object EquilibriumIndexOfArray {
  /*
   * http://www.geeksforgeeks.org/equilibrium-index-of-an-array/ 
   * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
   * Write a function int equilibrium(int[] arr, int n); that given a sequence arr[] of size n, 
   * returns an equilibrium index (if any) or -1 if no equilibrium indexes exist
   * */
  
  /*
   * Inefficient Use two loops. Outer loop iterates through all the element and inner loop finds out whether the current 
   * index picked by the outer loop is equilibrium index or not. Time complexity of this solution is O(n^2)
   * */
  
  /*Efficient solution*/
  //Calculate sum Total calculate sum for lower end if at any index 2*sumLower = totalSum-arr(indx)
  def equilrium(arr: Array[Int]) : List[Int] = {
    val totalSum = arr.foldLeft(0)(_+_)
    arr.view.zipWithIndex.foldLeft((0,Nil:List[Int]))((a,b) => {
      if(b._2>0 && (2*a._1 == (totalSum-b._1))) {
        (a._1+b._1,b._2::a._2)
      } else {
        (a._1+b._1,a._2)
      }
    })._2
  }
}