package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Mar-2017
 */

object CommonEltInThreeSortedArrray {
  /*
   * http://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/ 
   * */
  
  /*
   * A simple solution is to first find intersection of two arrays and store the intersection in a temporary array, 
   * then find the intersection of third array and temporary array. Time complexity of this solution is O(n1 + n2 + n3) where 
   * n1, n2 and n3 are sizes of ar1[], ar2[] and ar3[] respectively.*/
  
  /*
   * 
   * Let the current element traversed in ar1[] be x, in ar2[] be y and in ar3[] be z. We can have following cases inside the loop.
   * 1) If x, y and z are same, we can simply print any of them as common element and move ahead in all three arrays.
   * 2) Else If x < y, we can move ahead in ar1[] as x cannot be a common element 3) Else If y < z, we can move ahead in ar2[] as y 
   * cannot be a common element 4) Else (We reach here when x > y and y > z), we can simply move 
   * ahead in ar3[] as z cannot be a common element.*/
  
  def findCommon(arr1: Array[Int],arr2: Array[Int],arr3: Array[Int]) : Unit = {
    processArray(arr1, arr2, arr3, 0, 0, 0, arr1.length, arr2.length, arr3.length)
  }
  
  
  def processArray(arr1: Array[Int],arr2: Array[Int],arr3: Array[Int],i:Int,j:Int,k:Int,l1:Int,l2:Int,l3:Int) : Unit = {
    
    if(i < l1 && j < l2 && k < l3 ) {
      if(arr1(i) == arr2(j) && arr2(j)==arr3(k)){ print(arr1(i) + "  ");processArray(arr1, arr2, arr3, i+1, j+1, k+1, l1, l2, l3);}
      else if(arr1(i)<arr2(j)) processArray(arr1, arr2, arr3, i+1, j, k, l1, l2, l3)
      else if(arr2(j)<arr3(k)) processArray(arr1, arr2, arr3, i, j+1, k, l1, l2, l3)
      else processArray(arr1, arr2, arr3, i, j, k+1, l1, l2, l3)
    }
  }
}