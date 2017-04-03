package com.array.test
import com.array.NoOfSwapsToSortWithOnlyAdjacentSwap.countSwaps

object NoOfSwapsToSortWithOnlyAdjacentSwapTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  countSwaps(Array(1, 20, 6, 4, 5))               //> 1    2    1
                                                  //| 2    3    1
                                                  //| 3    5    2
                                                  //| 4    5    4
                                                  //| java.lang.ArrayIndexOutOfBoundsException: 5
                                                  //| 	at com.array.NoOfSwapsToSortWithOnlyAdjacentSwap$.processJ(NoOfSwapsToSo
                                                  //| rtWithOnlyAdjacentSwap.scala:66)
                                                  //| 	at com.array.NoOfSwapsToSortWithOnlyAdjacentSwap$.merge(NoOfSwapsToSortW
                                                  //| ithOnlyAdjacentSwap.scala:45)
                                                  //| 	at com.array.NoOfSwapsToSortWithOnlyAdjacentSwap$.mergeSort(NoOfSwapsToS
                                                  //| ortWithOnlyAdjacentSwap.scala:37)
                                                  //| 	at com.array.NoOfSwapsToSortWithOnlyAdjacentSwap$.mergeSort(NoOfSwapsToS
                                                  //| ortWithOnlyAdjacentSwap.scala:36)
                                                  //| 	at com.array.NoOfSwapsToSortWithOnlyAdjacentSwap$.countSwaps(NoOfSwapsTo
                                                  //| SortWithOnlyAdjacentSwap.scala:29)
                                                  //| 	at com.array.test.NoOfSwapsToSortWithOnlyAdjacentSwapTEst$$anonfun$main$
                                                  //| 1.apply$mcV$sp(com.array.test.NoOfSwapsToSortWithOnlyAdjacentSwapTEst.scala:
                                                  //| 7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scala
                                                  //| Output exceeds cutoff limit.
                                             
}