package com.array.test

import com.array.ProductArrayPuzzle.{productArray,productArray2}

object ProductArrayPuzzleTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  productArray(Array(10, 3, 5, 6, 2))             //> res0: Array[Int] = Array(1800, 1800, 1800, 1800, 1800)
  productArray2(Array(10, 3, 5, 6, 2))            //> res1: Array[Int] = Array(180, 600, 360, 300, 900)
}