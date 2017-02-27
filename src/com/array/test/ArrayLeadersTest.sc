package com.array.test

import com.array.ArrayLeaders.{leadersOfArray,leadersOfArray2}

object ArrayLeadersTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  leadersOfArray(Array(16,17,4,3,5,2))            //> 17 , 5 , 2 , 
  leadersOfArray(Array(12,14,2,3,12, 3,4,5,11,6,7,10,4,5,6,9,1,2,3,8,1,2,3,4,7,1))
                                                  //> 14 , 12 , 11 , 10 , 9 , 8 , 7 , 1 , 
    leadersOfArray2(Array(16,17,4,3,5,2))         //> 
                                                  //| 2 , 5 , 17 , 
  leadersOfArray2(Array(12,14,2,3,12, 3,4,5,11,6,7,10,4,5,6,9,1,2,3,8,1,2,3,4,7,1))
                                                  //> 
                                                  //| 1 , 7 , 8 , 9 , 10 , 11 , 12 , 14 , 
   println("")                                    //> 
}