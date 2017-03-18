package com.array.test

import com.array.MaxProductOfTriplet.{maxTripletPRoduct,maxTripletPRoduct2,maxTripletPRoduct3}
object MaxProductOfTripletTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  maxTripletPRoduct2(Array(1, 4, 3, -6, -7, 0 ))  //> res0: Int = 168
	maxTripletPRoduct2(Array(10, 3, 5, 6, 20  ))
                                                  //> res1: Int = 1200
	maxTripletPRoduct2(Array(-10, -3, -5, -6, -20 ))
                                                  //> res2: Int = -90
  maxTripletPRoduct(Array(1, 4, 3, -6, -7, 0 ))   //> res3: Int = 168
	maxTripletPRoduct(Array(10, 3, 5, 6, 20  ))
                                                  //> res4: Int = 1200
	maxTripletPRoduct(Array(-10, -3, -5, -6, -20 ))
                                                  //> res5: Int = -90
	maxTripletPRoduct3(Array(1, 4, 3, -6, -7, 0 ))
                                                  //> res6: Int = 168
	maxTripletPRoduct3(Array(10, 3, 5, 6, 20  ))
                                                  //> res7: Int = 1200
	maxTripletPRoduct3(Array(-10, -3, -5, -6, -20 ))
                                                  //> res8: Int = -90
}