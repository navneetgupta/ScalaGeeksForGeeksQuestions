package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 17-Mar-2017
 */

object RearrangeMaxMinArraySet1 {
  /*
   * http://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/ 
   * 
   * Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, 
   * second minimum value, third second max, fourth second min and so on.
   */
  
  /*
   * The idea is use an auxiliary array. We maintain two pointers one to leftmost or smallest element and other to rightmost or 
   * largest element. We more both pointers toward each other and alternatively copy elements at these pointers to an auxiliary array. 
   * Finally we copy auxiliary array back to original array.
   * */
  
  def rearrange(arr: Array[Int]) : Array[Int] = {
    val n =  arr.length
    val temp = new Array[Int](n)
    //small,large,flag,index
    arr.foldLeft((0,n-1,true,0))((a,b) => {
      if(a._3) {
        temp(a._4) = arr(a._2)
        (a._1,a._2-1,!a._3,a._4+1)
      } else {
        temp(a._4) = arr(a._1)
        (a._1+1,a._2,!a._3,a._4+1)
      }
    })
    temp
  } 
  
  
}