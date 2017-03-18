package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 18-Mar-2017
 */

object MinimizeMaxDiffBtwnHeigts {
  /*
   * http://www.geeksforgeeks.org/minimize-the-maximum-difference-between-the-heights/ 
   * 
   * Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. 
   * The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, and output 
   * this difference.
   */
  
  /*
   * The idea is to sort all elements increasing order. Below are steps.

    1. Sort array in increasing order
    2. Initialize maximum and minimum elements.
    3. maxe = arr[n-1], mine = arr[0]
    4. If k is more than difference between maximum and minimum, add/subtract k to all elements as k cannot decrease the difference. 
    Example {6, 4}, k = 10.
    5. In sorted array, update first and last elements.
   	 		arr[0] += k; // arr[0] is minimum and k is +ve
    		arr[n-1] -= k; // arr[n-1] is maximum and k is -ve
    6. Initialize mac and min of modified array (only two elements have been finalized)
    		new_max = max(arr[0], arr[n-1]), new_min = min(arr[0], arr[n-1])
    7. Finalize middle n-2 elements. Do following for every element arr[j] where j lies from 1 to n-2.
        If current element is less than min of modified array, add k.
        Else If current element is more than max of modified array, subtract k.
        arr[j] is between new_min and new_max.
            If arr[j] is closer to new_max, subtract k
            Else add k to arr[j].
    8. Update new_max and new_min if required
    		new_max = max(arr[j], new_max), new_min = min(arr[j], new_min)
    9. Returns difference between new_max and new_min
    		return (new_max – new_min);
   * 
   * */
  
  def minimizeMaxDiff(arr: Array[Int],k:Int):Int = {
    val n =arr.length
    if(n <= 1)
      0
    else {
      val sortedAr = arr.sorted
      val maxe = sortedAr(n-1)
      val mine = sortedAr(0)
      if(k >= (maxe-mine)) {
        val nSArr = sortedAr.foldLeft(0)((a,b) => {sortedAr(a) = b+k;a+1})
        print( " k >= maxe-mine" )
        (maxe-mine)
      } else {
        sortedAr(0) = sortedAr(0)+k
        sortedAr(n-1) = sortedAr(n-1)-k
        val (newMax,newMin) = if(sortedAr(0)>sortedAr(n-1)) (sortedAr(0),sortedAr(n-1)) else (sortedAr(n-1),sortedAr(0))
        val (nMax,nMin,idx) = sortedAr.drop(1).dropRight(1).foldLeft((newMax,newMin,1))((a,b) => {
          if(b < a._2) {sortedAr(a._3) = b +k}
          else if(b > a._1) sortedAr(a._3) = b-k
          else if((b-a._2)>(a._1-b)) sortedAr(a._3) = b-k
          else sortedAr(a._3) = b+k
          val nMn = List(sortedAr(a._3),a._2).min
          val nMx = List(sortedAr(a._3),a._1).max
          (nMx,nMn,a._3+1)
        })
        println(sortedAr.toList)
        nMax-nMin
      }
    }
    
  }
  
}