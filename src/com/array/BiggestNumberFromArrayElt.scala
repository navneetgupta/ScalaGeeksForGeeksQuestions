package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object BiggestNumberFromArrayElt {
  /*
   * http://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/ 
   * */
  
  /* The idea is to use any comparison based sorting algorithm. In the used sorting algorithm, instead of using the default comparison, 
   * write a comparison function myCompare() and use it to sort numbers. Given two numbers X and Y, how should myCompare() decide which 
   * number to put first – we compare two numbers XY (Y appended at the end of X) and YX (X appended at the end of Y). If XY is larger, 
   * then X should come before Y in output, else Y should come before. For example, let X and Y be 542 and 60. To compare X and Y, 
   * we compare 54260 and 60542. Since 60542 is greater than 54260, we put Y first.*/
  
  def compare(x:Int,y:Int): Boolean = {
    val xy = x.toString()+y.toString()
    val yx = y.toString()+x.toString()
    if(xy.compareTo(yx)>0) true else false
  }
  
  def printLargest(arr: Array[Int]):Unit={
    println(arr.sortWith(compare).mkString)
  }
}