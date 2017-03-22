package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 22-Mar-2017
 */

object AddEltsOfGivenArrayWithConstraints {
  /*
   * http://www.geeksforgeeks.org/add-elements-given-arrays-given-constraints/
   * */
  /*
   * Given two integer arrays, add their elements into third array by satisfying following constraints –
   * 1. Addition should be done starting from 0th index of both arrays.
   * 2. Split the sum if it is a not a single digit number and store the digits in adjacent locations in output array.
   * 3. Output array should accommodate any remaining digits of larger input array.
   * */
  
  def addArrays(arr1: Array[Int],arr2: Array[Int]) : List[Char] = {
    val xs = processArr(arr1,arr2,0,Nil)
    val xs1 = if(xs._2<arr1.length) {
      arr1.drop(xs._2).foldLeft(xs._1)((a,b) => {
        b.toString().toList.reverse ++ a
      })
    } else xs._1
    
    val xs2 = if(xs._2 < arr2.length) {
      arr2.drop(xs._2).foldLeft(xs1)((a,b) => {
        b.toString().toList.reverse ++ a
      })
    } else xs1
    xs2.reverse
  }
  
  def processArr(arr1: Array[Int],arr2: Array[Int],i:Int,xs:List[Char]): (List[Char],Int) = {
    if(i < arr1.length && i < arr2.length) {
      val sum = arr1(i)+arr2(i)
     val ls = sum.toString().toList.reverse ++ xs
      processArr(arr1, arr2, i+1, ls)
    } else (xs,i)
  }
}