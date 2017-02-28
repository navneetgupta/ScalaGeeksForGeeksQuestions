package com.array.test

import com.array.MaxDiffWithLargerEltAfterSmallerElt.{findDiffrence2,findDiffrence,findDiffMethod2,findDiffMethod3,fundDiffMethod3_2}

object MaxDiffWithLargerEltAfterSmallerEltTEst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  findDiffrence2(Array(2, 3, 10, 6, 4, 8, 1))     //> res0: Int = 8
  findDiffrence2(Array(7,9,5, 6, 3, 2))           //> res1: Int = 2
                               
  findDiffrence(Array(2, 3, 10, 6, 4, 8, 1))      //> res2: Int = 8
  findDiffrence(Array(7,9,5, 6, 3, 2))            //> res3: Int = 2
  
  findDiffMethod2(Array(2, 3, 10, 6, 4, 8, 1))    //> res4: Int = 8
  findDiffMethod2(Array(7,9,5, 6, 3, 2))          //> res5: Int = 2
  
  findDiffMethod3(Array(2, 3, 10, 6, 4, 8, 1))    //> res6: Int = 8
  findDiffMethod3(Array(7,9,5, 6, 3, 2))          //> res7: Int = 2
  
  fundDiffMethod3_2(Array(2, 3, 10, 6, 4, 8, 1))  //> res8: Int = 9
  fundDiffMethod3_2(Array(7,9,5, 6, 3, 2))        //> res9: Int = 4
  
  
}