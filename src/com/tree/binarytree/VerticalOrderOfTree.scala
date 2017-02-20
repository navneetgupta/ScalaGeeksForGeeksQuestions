package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object VerticalOrderOfTree {
  /*
   * http://www.geeksforgeeks.org/print-binary-tree-vertical-order/
   * 
   * The idea is to traverse the tree once and get the minimum and maximum horizontal distance with respect to root. 
   * For the tree shown above, minimum distance is -2 (for node with value 4) and maximum distance is 3 (For node with value 9).
   * Once we have maximum and minimum distances from root, we iterate for each vertical line at distance minimum to maximum from root, 
   * and for each vertical line traverse the tree and print the nodes which lie on that vertical line.
   * 
   * findMinMax(tree, min, max, hd)
     if tree is NULL then return;
 
     if hd is less than min then
           min = hd;
     else if hd is greater than max then
          *max = hd;
 
     findMinMax(tree->left, min, max, hd-1);
     findMinMax(tree->right, min, max, hd+1);

 
printVerticalLine(tree, line_no, hd)
     if tree is NULL then return;
 
     if hd is equal to line_no, then
           print(tree->data);
     printVerticalLine(tree->left, line_no, hd-1);
     printVerticalLine(tree->right, line_no, hd+1); 
   * */
  
  def findMinMax[A](tree: BinaryTree[A],min: Int,max: Int,hd: Int): (Int,Int) = tree match {
    case EmptyTree => (min,max)
    case Node(v,l,r) => 
      if(hd < min) {
        val newMin = hd
        val lt = findMinMax(l,newMin,max,hd-1)
        findMinMax(r,lt._1,lt._2,hd-1)
      } else if(hd>max) {
        val newMax = hd
        val lt = findMinMax(l,min,newMax,hd-1)
        findMinMax(r,lt._1,lt._2,hd-1)
      } else {
        findMinMax(l, min, max, hd - 1);
        findMinMax(r, min, max, hd + 1);
      }  
  }
  
  def printVerticalLine[A](tree: BinaryTree[A],lineNo:Int,hd:Int): Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) => 
      if(hd == lineNo)
        print(v+ " , ")
      
      printVerticalLine(l,lineNo,hd-1)
      printVerticalLine(r, lineNo, hd+1)    
  }
  
  def verticalOrder[A](tree: BinaryTree[A]) : Unit = {
    val minMax = findMinMax(tree, Int.MaxValue, Int.MinValue, 0)
    for{
      i <- (minMax._1 to minMax._2)
    } yield {
      printVerticalLine(tree, i, 0)
      println("")
    }
  }
   
}