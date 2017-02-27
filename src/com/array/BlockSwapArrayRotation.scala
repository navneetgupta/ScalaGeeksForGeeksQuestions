package com.array


/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object BlockSwapArrayRotation {
  /*
   * http://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/ 
   * Initialize A = arr[0..d-1] and B = arr[d..n-1]
			1) Do following until size of A is equal to size of B

        a)  If A is shorter, divide B into Bl and Br such that Br is of same 
             length as A. Swap A and Br to change ABlBr into BrBlA. Now A
             is at its final place, so recur on pieces of B.  
      
         b)  If A is longer, divide A into Al and Ar such that Al is of same 
             length as B Swap Al and B to change AlArB into BArAl. Now B
             is at its final place, so recur on pieces of A.
      
      2)  Finally when A and B are of equal size, block swap them.
   * */
  
  //Recursive
  
  def leftRotate[A](arr: Array[A],d: Int,n:Int,start:Int) : Array[A] = {
    if(d == 0 || d == n){
      arr
    } else if(n-d == d){
      swap(arr,0,n-d,d)
    } else if(d < n-d) {
      val newArr = swap2(arr,0,n-d,d,start)
      leftRotate(newArr, d, n-d,0)
    } else {
      val newArr = swap2(arr,0,d,n-d,start)
      // Below line should be leftRotate(arr+n-d, 2*d-n, d); /*This is tricky*/
      leftRotate(arr, 2*d-n, d,n-d)
    }
  }
  
  def swap2[A](arr:Array[A], fi:Int, si:Int ,d: Int,start:Int): Array[A] = {
    for {
      i <- (0+start until d+start)
    } yield {
      val temp = arr(fi+i)
      arr(fi+i) = arr(si+i)
      arr(si+i) = temp
    }
    arr
  }
  
  def swap[A](arr:Array[A], fi:Int, si:Int ,d: Int): Array[A] = {
    for {
      i <- (0 until d)
    } yield {
      val temp = arr(fi+i)
      arr(fi+i) = arr(si+i)
      arr(si+i) = temp
    }
    arr
  }
  
  //iterative
  def leftRotate2[A](arr:Array[A],d: Int,n :Int) : Array[A] = {
    if(d==0 || d==n){
      arr
    } else {
      val (newArr,idx) = leftRotate2Util(arr,d,n-d,d)
      swap(newArr,d-idx,d,idx)
    }
  }
  
  def leftRotate2Util[A](arr:Array[A],i:Int,j:Int,d:Int) : (Array[A],Int) = {
    if(i != j){
      if(i<j) {
        val newArr = swap(arr,d-i,d+j-i,i)
        leftRotate2Util(newArr, i, j-i, d)
      } else {
        val newArr = swap(arr,d-i,d,j)
        leftRotate2Util(newArr, i-j, j, d)
      }
    } else (arr,i)
  }
}