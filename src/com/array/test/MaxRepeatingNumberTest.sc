package com.array.test

import com.array.MaxRepeatingNumber.maxRepeatingNumber
object MaxRepeatingNumberTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val array = Array(1,2,1,2,1,2,1,1,4,3,4,4,5,5,5,5,4,4,4,2,3,2,3,2,3,2,3,4,4,4,1,2,3,2,3,4,5,3,2,3)
                                                  //> array  : Array[Int] = Array(1, 2, 1, 2, 1, 2, 1, 1, 4, 3, 4, 4, 5, 5, 5, 5, 
                                                  //| 4, 4, 4, 2, 3, 2, 3, 2, 3, 2, 3, 4, 4, 4, 1, 2, 3, 2, 3, 4, 5, 3, 2, 3)
  array.foldLeft(0)((a,b) => (if(b==1)a+1 else a))//> res0: Int = 6
  array.foldLeft(0)((a,b) => (if(b==2)a+1 else a))//> res1: Int = 10
  array.foldLeft(0)((a,b) => (if(b==3)a+1 else a))//> res2: Int = 9
  array.foldLeft(0)((a,b) => (if(b==4)a+1 else a))//> res3: Int = 10
  array.foldLeft(0)((a,b) => (if(b==5)a+1 else a))//> res4: Int = 5
  maxRepeatingNumber(array, 6)                    //> res5: Int = 2
 
  
 
  
}