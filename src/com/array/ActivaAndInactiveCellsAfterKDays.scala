package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object ActivaAndInactiveCellsAfterKDays {
  /*
   * http://www.geeksforgeeks.org/active-inactive-cells-k-days/ 
   * Given a binary array of size n where n > 3. A true (or 1) value in the array means active and false (or 0) means inactive. 
   * Given a number k, the task is to find count of active and inactive cells after k days. After every day, status of i’th cell 
   * becomes active if left and right cells are not same and inactive if left and right cell are same (both 0 or both 1).
   */
  
  /*
   * The only important thing is to make sure that we maintain a copy of given array because we need previous values to update for 
   * next day. Below are detailed steps.
   * First we copy the cells[] array into temp[] array and make changes in temp[] array according to given condition. 
   * In the condition, it is given that if immediate left and right cell of i’th cell either inactive or active 
   * 	the next day i becomes inactive i.e; (cells[i-1] == 0 and cells[i+1] == 0) or (cells[i-1] == 1 and cells[i+1] == 1) then 
   * 	cells[i] = 0, these conditions can be applied using XOR of cells[i-1] and cells[i+1].
   * For 0’th index cell temp[0] = 0^cells[1] and for (n-1)’th index cell temp[n-1] = 0^cells[n-2].
   * Now for index 1 to n-2, do the following operation temp[i] = cells[i-1] ^ cells[i+1] 
   * Repeat the process till k days are completed.
   * */
  
  def activaInactiveCells(arr: Array[Int],k: Int) : (Int,Int) = {
    val cells = processArr(arr,k,arr,arr.length)
    cells.foldLeft((0,0))((a,b) => {
      if(b == 1) (a._1+1,a._2) else (a._1,a._2+1)
    })
  }
  
  def processArr(arr : Array[Int],k: Int,temp: Array[Int],n: Int) : Array[Int] = {
    println(arr.toList)
    println(temp.toList)
    if(k > 0) {
      temp(0) = 0 ^ arr(1)
      temp(n-1) = 0 ^ arr(n-2)
      for {
        i <- (1 to n-2)
      } yield (temp(i) = arr(i-1) ^ arr(i+1))
      
      for {
        i <- (0 to n-1)
      } yield (arr(i) = temp(i))
      
      processArr(arr, k-1, temp, n)
    } else arr
  }
  
}