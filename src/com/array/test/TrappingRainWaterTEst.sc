package com.array.test

import com.array.TrappingRainWater.trapRainWater
object TrappingRainWaterTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  trapRainWater(Array(2, 0, 2))                   //> res0: Int = 2
  trapRainWater(Array(3, 0, 0, 2, 0, 4))          //> res1: Int = 10
  trapRainWater(Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
                                                  //> res2: Int = 6
  trapRainWater(Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
                                                  //> res3: Int = 6
                                                  
}