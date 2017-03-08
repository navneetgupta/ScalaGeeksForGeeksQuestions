package com.array.test

import com.array.PythagoreanTriplet.{findTriplet,findTriplet2}
object PythagoreanTripletTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findTriplet(Array(3, 1, 4, 6, 5))               //> res0: List[(Int, Int, Int)] = List((3,4,5))
  findTriplet2(Array(3, 1, 4, 6, 5))              //> res1: List[(Int, Int, Int, Boolean)] = List((9,16,25,true))
  findTriplet(Array(10, 4, 6, 12, 5))             //> res2: List[(Int, Int, Int)] = List()
  findTriplet2(Array(10, 4, 6, 12, 5))            //> res3: List[(Int, Int, Int, Boolean)] = List()
  findTriplet(Array(3, 1, 4, 6, 5))               //> res4: List[(Int, Int, Int)] = List((3,4,5))
  findTriplet2(Array(3, 1, 4, 6, 5))              //> res5: List[(Int, Int, Int, Boolean)] = List((9,16,25,true))
  findTriplet(Array(3, 1, 4, 6, 5))               //> res6: List[(Int, Int, Int)] = List((3,4,5))
  findTriplet2(Array(3, 1, 4, 6, 5))              //> res7: List[(Int, Int, Int, Boolean)] = List((9,16,25,true))
}