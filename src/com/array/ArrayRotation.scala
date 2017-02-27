package com.array

import scala.annotation.tailrec

/**
 * @author: Navneet Gupta
 * @createdOn: 27-Feb-2017
 */

object ArrayRotation {
  /*
   * http://www.geeksforgeeks.org/array-rotation/ 
   * http://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
   * 
   * METHOD 1 (Use temp array)

      Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
      1) Store d elements in a temp array
         temp[] = [1, 2]
      2) Shift rest of the arr[]
         arr[] = [3, 4, 5, 6, 7, 6, 7]
      3) Store back the d elements
         arr[] = [3, 4, 5, 6, 7, 1, 2]
      Time complexity O(n)
      Auxiliary Space: O(d)
      
      
      
      METHOD 2 (Rotate one by one)
      
      leftRotate(arr[], d, n)
      start
        For i = 0 to i < d
          Left rotate all elements of arr[] by one
      end
      
      Method 4(The Reversal Algorithm)
Please read this for first three methods of array rotation.

Algorithm:

rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], l, n);
  
  METHOD 3 (A Juggling Algorithm)
This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

Here is an example for n =12 and d = 3. GCD is 3
   * */
  
  //Method:2
  def leftRotateByOne[A](arr: Array[A]): Array[A] = {
    val start = arr(0)
    val length = arr.length
    for{
      i <- (1 to length-1)
    } yield (arr(i-1) = arr(i))
    arr(arr.length-1) = start
    arr
  }
  
  def leftRotate(arr: Array[Int],n : Int) : Array[Int] = {
    for {
      i <- (0 until n)
    } yield{
      leftRotateByOne(arr)
    }
    arr
  } 
  
  //Method:4(Reversal Algorithm)

  def leftRotate4[A](arr: Array[A],d: Int): Array[A] = {
    val n = arr.length
    val arr1 = reverseRec(arr,0,d-1)
    val arr2 = reverseRec(arr1,d,n-1)
    reverseRec(arr2,0,n-1)
  }
  
  @tailrec
   def reverseRec[A](arr: Array[A],start: Int,end :Int): Array[A] = {
     if(start<end){
        val temp = arr(start)
        arr(start) = arr(end)
        arr(end) = temp
        reverseRec(arr,start +1,end-1)
     } else arr
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*
   * void leftRotate(int arr[], int d, int n) 
    {
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) 
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (1 != 0) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
 
    /*UTILITY FUNCTIONS*/
     
    /* function to print an array */
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    */
  
  def leftRotate2[A](arr: Array[A],d: Int): Array[A] = {
    var arr1= arr
    val n = arr.length
    for{
      i <- (0 until gcd(d,n))
    } yield {
      val temp = arr1(i)
      var break = true
      val newArr = processArray(arr1,i,i,i+d,n)
      newArr._1(newArr._2) = temp
      arr1= newArr._1
    }
    arr1
  }
  
  @tailrec
  def processArray[A](arr: Array[A],i : Int,j:Int,k:Int,n:Int) : (Array[A],Int) = {
    if(k >= n) {
      if((k-n) == i) (arr,j)
      else {
        arr(j) = arr(k-n)
        processArray(arr,i,k-n,k-n,n)
      }
    } else {
        if(k == i) (arr,j)
        else {
          arr(j) = arr(k)
          processArray(arr,i,k,k,n)
        }
    }
  }
  
  @tailrec
  def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)

}