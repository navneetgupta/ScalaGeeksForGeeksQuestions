package com.tree.binarytree

import scala.collection.mutable.Queue

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Feb-2017
 */

/*
 * Given an infinite number line from -INFINITY to +INFINITY and we are on zero. We can move n steps either side at each n’th time.

		1st time; we can move only 1 step to both ways, means -1 1;

		2nd time we can move 2 steps  from -1 and 1;
		-1 :  -3 (-1-2)  1(-1+2)
 		 1 :  -1 ( 1-2)  3(1+2)
 		 
 		 This problem can be modeled as tree. We put initial point 0 at root, 1 and -1 as children of root. Next level contains values at distance 2 and so on.

              0
            /   \
         -1       1  
        /  \     /  \
       1   -3   -1   3
     /  \  / \  / \  / \
 */


case class Number(var n: Int,var level: Int)

object FindANumberInMinSteps extends App {
  val INF = 9999
  def findNthNumber(n:Int) : Unit = {
    println("Inside Method for n =" +n)
    val queue = Queue[Number]()
    queue.enqueue(Number(0,1))
    getNumber(queue, n)
  } 
  
  def getNumber(queue:Queue[Number],n:Int):Unit = {
    if(queue.size>0) {
      val loop:Boolean = queue.dequeue() match {
        case Number(a,b) if(a >=INF || a <= -INF ) => false
        case Number(a,b) if(a == n) => println("Found at "+ (b-1)); false
        case Number(a,b) => {
          queue.enqueue(Number(a+b,b+1))
          queue.enqueue(Number(a-b,b+1))
          true
        }
      }
      if(loop) getNumber(queue, n)  
    }
  }
  
  findNthNumber(13)
}