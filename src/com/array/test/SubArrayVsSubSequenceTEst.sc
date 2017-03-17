package com.array.test

import com.array.SubArrayVsSubSequence.{subArray,subSequence}
object SubArrayVsSubSequenceTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  subArray(Array(1, 2, 3, 4))                     //> 1, 
                                                  //| 1, 2, 
                                                  //| 1, 2, 3, 
                                                  //| 1, 2, 3, 4, 
                                                  //| 2, 
                                                  //| 2, 3, 
                                                  //| 2, 3, 4, 
                                                  //| 3, 
                                                  //| 3, 4, 
                                                  //| 4, 
  subSequence(Array(1,2,3,4))                     //> 1 , 
                                                  //| 2 , 
                                                  //| 1 ,2 , 
                                                  //| 3 , 
                                                  //| 1 ,3 , 
                                                  //| 2 ,3 , 
                                                  //| 1 ,2 ,3 , 
                                                  //| 4 , 
                                                  //| 1 ,4 , 
                                                  //| 2 ,4 , 
                                                  //| 1 ,2 ,4 , 
                                                  //| 3 ,4 , 
                                                  //| 1 ,3 ,4 , 
                                                  //| 2 ,3 ,4 , 
                                                  //| 1 ,2 ,3 ,4 , 
}