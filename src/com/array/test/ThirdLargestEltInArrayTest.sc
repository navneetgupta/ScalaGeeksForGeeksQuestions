package com.array.test

import com.array.ThirdLargestEltInArray.{findThirdLargest,findThridLargest}
object ThirdLargestEltInArrayTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findThirdLargest(Array(12, 13, 1, 10, 34, 16))  //> 34
                                                  //| 16
                                                  //| res0: Option[Int] = Some(13)
  findThridLargest(Array(12, 13, 1, 10, 34, 16))  //> res1: Option[Int] = Some(13)
}