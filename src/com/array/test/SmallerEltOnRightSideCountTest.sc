package com.array.test

import com.array.SmallerEltOnRightSideCount.{constructLowerArray,constructSmallerEltCount}
object SmallerEltOnRightSideCountTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  constructSmallerEltCount(Array(12, 1, 2, 3, 0, 11, 4))
                                                  //> res0: Array[Int] = Array(6, 1, 1, 1, 0, 1, 0)
  constructSmallerEltCount(Array(12, 10, 5, 4, 2, 20, 6, 1, 0, 2))
                                                  //> res1: Array[Int] = Array(8, 7, 5, 4, 2, 4, 3, 1, 0, 0)
  constructSmallerEltCount(Array(5, 4, 3, 2, 1))  //> res2: Array[Int] = Array(4, 3, 2, 1, 0)
  constructSmallerEltCount(Array(1, 2, 3, 4, 5))  //> res3: Array[Int] = Array(0, 0, 0, 0, 0)
  
  constructLowerArray(Array(12, 1, 2, 3, 0, 11, 4))
                                                  //> java.lang.ClassCastException: com.tree.AVLTree.EmptyAvlNode$ cannot be cast 
                                                  //| to com.tree.AVLTree.AVLNode
                                                  //| 	at com.array.SmallerEltOnRightSideCount$.insert(SmallerEltOnRightSideCou
                                                  //| nt.scala:71)
                                                  //| 	at com.array.SmallerEltOnRightSideCount$.processArray(SmallerEltOnRightS
                                                  //| ideCount.scala:102)
                                                  //| 	at com.array.SmallerEltOnRightSideCount$.constructLowerArray(SmallerEltO
                                                  //| nRightSideCount.scala:96)
                                                  //| 	at com.array.test.SmallerEltOnRightSideCountTest$$anonfun$main$1.apply$m
                                                  //| cV$sp(com.array.test.SmallerEltOnRightSideCountTest.scala:12)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at com.array.test.SmallerEltOnRightSideCountTest$.main(com.array.test.Sm
                                                  //| allerEltOnRig
                                                  //| Output exceeds cutoff limit.
  constructLowerArray(Array(12, 10, 5, 4, 2, 20, 6, 1, 0, 2))
  constructLowerArray(Array(5, 4, 3, 2, 1))
  constructLowerArray(Array(1, 2, 3, 4, 5))
                                               
                                                  
                                                  
}