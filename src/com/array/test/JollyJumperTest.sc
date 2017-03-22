package com.array.test

import com.array.JollyJumper.{isJollyJump,isJollyJump2,isJollyJump3}

object JollyJumperTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
  isJollyJump(Array(1, 4, 2, 3))                  //> res0: Boolean = true
 
  isJollyJump(Array(1, 4, 2, -1, 6))              //> res1: Boolean = false
  isJollyJump(Array(11, 7, 4, 2, 1, 6))           //> res2: Boolean = true
  isJollyJump2(Array(1, 4, 2, 3))                 //> res3: Boolean = true
  isJollyJump2(Array(1, 4, 2, -1, 6))             //> res4: Boolean = false
  isJollyJump2(Array(11, 7, 4, 2, 1, 6))          //> res5: Boolean = true
  isJollyJump3(Array(1, 4, 2, 3))                 //> res6: Boolean = true
  isJollyJump3(Array(1, 4, 2, -1, 6))             //> res7: Boolean = false
  isJollyJump3(Array(11, 7, 4, 2, 1, 6))          //> res8: Boolean = true
}