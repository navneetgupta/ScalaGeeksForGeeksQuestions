package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Mar-2017
 */

object RearrangeArray {
  /*
   * http://www.geeksforgeeks.org/rearrange-array-arrj-becomes-arri-j/ 
   * 
   * Given an array of size n where all elements are in range from 0 to n-1, change contents of arr[] so that 
   * arr[i] = j is changed to arr[j] = i.
   * */
  
  /*
   * A Simple Solution is to create a temporary array and one by one copy ‘i’ to ‘temp[arr[i]]’ where i varies from 0 to n-1.
   * Time complexity of the above solution is O(n) and auxiliary space needed is O(n).
   * */
  
  def rearrange(arr: Array[Int]) : Array[Int]  = {
    val n = arr.length
    val temp = new Array[Int](n)
    arr.foldLeft(0)((a,b) => {temp(b) = a;a+1})
    temp.foldLeft(0)((a,b) => {arr(a) = b;a+1})
    arr
  }
  
  /*
   * Let us consider array ‘{1, 3, 0, 2}’ for example. We start with i = 0, arr[i] is 1. So we go to arr[1] and change it to 0 (because i is 0). 
   * Before we make the change, we store old value of arr[1] as the old value is going to be our new index i. In next iteration, we have i = 3, 
   * arr[3] is 2, so we change arr[2] to 3. Before making the change we store next i as old value of arr[2].
   * 
   * The above function doesn’t work for inputs like {2, 0, 1, 4, 5, 3}; as there are two cycles. One cycle is (2, 0, 1) and other 
   * cycle is (4, 5, 3).
   * How to handle multiple cycles with the O(1) space constraint?
   * The idea is to process all cycles one by one. To check whether an element is processed or not, we change the value of processed 
   * items arr[i] as -arr[i]. Since 0 can not be made negative, we first change all arr[i] to arr[i] + 1. In the end, we make all values 
   * positive and subtract 1 to get old values back.*/
  
  def rearrange2(arr: Array[Int]):Array[Int] = {
    val n = arr.length
    arr.foldLeft(0)((a,b) => {arr(a) = b+1;a+1;})
    val nArr = processArr(arr,0,n)
    nArr.foldLeft(0)((a,b) => {
      nArr(a) = -b -1
      a+1
    })
    nArr
  }
  
  def processArr(arr: Array[Int],i: Int,n: Int): Array[Int] = {
    if(i<n) {
      val newArr = if(arr(i)>0) rearrange2Util(arr,i,n) 
      else arr
      processArr(newArr, i+1, n)
    } else arr
  }
  
  def rearrange2Util(arr: Array[Int],i:Int,size:Int): Array[Int]  = {
    processCycle(arr,arr(i)-1,- (i+1))
  }
  
  def processCycle(arr: Array[Int],i:Int,value:Int) : Array[Int] = {
    if(arr(i) >0) {
      val newI = arr(i)-1
      arr(i) = value
      processCycle(arr, newI, -(i+1))
    } else arr
  }
}