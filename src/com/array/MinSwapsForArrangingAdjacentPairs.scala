package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

object MinSwapsForArrangingAdjacentPairs {
  /*
   * http://www.geeksforgeeks.org/minimum-number-of-swaps-required-for-arranging-pairs-adjacent-to-each-other/ 
   * */
  
  /*
   * The idea is to start from first and second elements and recur for remaining elements. Below are detailed steps/

      1) If first and second elements are pair, then simply recur 
         for remaining n-1 pairs and return the value returned by 
         recursive call.
      
      2) If first and second are NOT pair, then there are two ways to 
         arrange. So try both of them return the minimum of two.
         a) Swap second with pair of first and recur for n-1 elements. 
            Let the value returned by recursive call be 'a'.
         b) Revert the changes made by previous step.
         c) Swap first with pair of second and recur for n-1 elements. 
            Let the value returned by recursive call be 'b'.
         d) Revert the changes made by previous step before returning
            control to parent call.
         e) Return 1 + min(a, b)
    */
  
//  def findMinSwaps(arr: Array[Int],pairs: Array[(Int,Int)]) : Int = {
//    
//  }
  
  def findMinSwaps(arr: Array[Int],pairs: Array[Int]):(Int,Array[Int],Array[Int]) = {
    val n = arr.length/2
    val index = new Array[Int](2*n+1)
    for{
      i <- (1 to 2*n)
    } yield {
      index(arr(i)) = i
    }
    minSwapUtil2(arr,pairs,index,1,2*n)
  }
  
  def minSwapUtil(arr: Array[Int],pairs: Array[Int],index:Array[Int],i:Int,n:Int): Int =  {
    if(i>n) 0
    else if(pairs(arr(i)) == arr(i+1)) {
      minSwapUtil(arr, pairs, index, i+2, n)
    } else {
      val two = arr(index(pairs(arr(i))))
      val newArr = swap(arr,i+1,index(pairs(arr(i))))
      val newIdx = updateIndex(index, arr(i+1), two, index(pairs(arr(i))), i+1)
      val a = minSwapUtil(newArr, pairs, newIdx, i+2, n)
      
      val two2 = arr(index(pairs(arr(i+1))))
      val newArr2 = swap(arr,i,index(pairs(arr(i+1))))
      val newIdx2 = updateIndex(index, arr(i), two2, index(pairs(arr(i+1))), i)
      val b = minSwapUtil(newArr2, pairs, newIdx2, i+2, n)
      println(List(a,b))
      1 + List(a,b).min
    }
  }
  
  def minSwapUtil2(arr: Array[Int],pairs: Array[Int],index:Array[Int],i:Int,n:Int): (Int,Array[Int],Array[Int]) =  {
    if(i>n) (0,arr,index)
    else if(pairs(arr(i)) == arr(i+1)) {
      minSwapUtil2(arr, pairs, index, i+2, n)
    } else {
      val two = arr(index(pairs(arr(i))))
      val newArr = swap(arr,i+1,index(pairs(arr(i))))
      val newIdx = updateIndex(index, arr(i+1), two, index(pairs(arr(i))), i+1)
      val a = minSwapUtil2(newArr, pairs, newIdx, i+2, n)
      
      val newArr2 = swap(a._2,i+1,index(pairs(arr(i))))
      val newIdx2 = updateIndex(a._3, arr(i+1), two,i+1, index(pairs(arr(i))))
      
      //------------------------------------------------ updated values
      
      val two2 = newArr2(newIdx2(pairs(newArr2(i+1))))
      //idxOne = newIdx2(pairs(newArr2(i+1))), one = newArr2(i) , index2 =i
      val newArr3 = swap(newArr2,i,newIdx2(pairs(newArr2(i+1))))
      val newIdx3 = updateIndex(newIdx2, newArr2(i), two2, newIdx2(pairs(newArr2(i+1))), i)
      
      val b = minSwapUtil2(newArr3, pairs, newIdx3, i+2, n)
      val newArr4 = swap(b._2,i,newIdx2(pairs(newArr2(i+1))))
      val newIdx4 = updateIndex(b._3, newArr2(i), two2, i, newIdx2(pairs(newArr2(i+1))))
      
      (1 + List(a._1,b._1).min,newArr4,newIdx4)
    }
  }
  
  def swap(arr: Array[Int],i:Int,j:Int) : Array[Int] = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
    arr
  }
  
  def updateIndex(index: Array[Int],a: Int,b:Int,a1:Int,b1:Int) : Array[Int] = {
    index(a) = a1
    index(b) = b1
    index
  }
}