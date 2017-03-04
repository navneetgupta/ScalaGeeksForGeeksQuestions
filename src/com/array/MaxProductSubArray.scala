package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 03-Mar-2017
 */

object MaxProductSubArray {
  /*
   * http://www.geeksforgeeks.org/maximum-product-subarray/ 
   * It is similar to Largest Sum Contiguous Subarray problem. The only thing to note here is, maximum product can also be 
   * obtained by minimum (negative) product ending with the previous element multiplied by this element.*/
  
  def maxProduct(arr: Array[Int]): Int = {
    //(max_ending_here,min_ending_here,max_so_far)
    arr.foldLeft((1,1,1))((a,b) => {
      val (newMaxEndingHere,newMinEndHere) = 
        if(b>0) 
          (a._1*b,List(a._2*b,1).min) 
        else if(b ==0) 
          (1,1) 
        else {
          (List(a._2*b,1).max,a._1*b)
        }
      
      if(a._3 < newMaxEndingHere) {
        (newMaxEndingHere,newMinEndHere,newMaxEndingHere)
      } else (newMaxEndingHere,newMinEndHere,a._3)
    })._3
  }
}