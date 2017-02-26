package com.tree.binarytree

object PrintCousins {
  /*
   * http://www.geeksforgeeks.org/print-cousins-of-a-given-node-in-binary-tree/
   * 
   * The idea to first find level of given node using the approach discussed here. Once we have found level, 
   * we can print all nodes at a given level using the approach discussed here. The only thing to take care of is, 
   * sibling should not be printed. To handle this, we change the printing function to first check for sibling and 
   * print node only if it is not sibling.
   */
  def getLevel[A](tree:BinaryTree[A],target:A,level: Int) : Int = tree match {
    case EmptyTree => level
    case Node(v,l,r) => {
      if(v == target) level 
      else {
        val downLevel = getLevel(l,target,level+1)
        if(downLevel != 0) downLevel 
        else 
          getLevel(r,target,level+1)
      }
    }
  }
  
  def printGivenLevel[A](tree:BinaryTree[A],target:A,level:Int):Unit = tree match {
    case EmptyTree => 
    case Node(v,l,r) =>  
      if(level ==2)  {
          (l,r) match {
            case (Node(v1,l1,r1),Node(v2,l2,r2)) if((v1==target) || (v2==target)) =>
            case _ => 
              l match {
                case Node(v1,l1,r1) => print(v1 + " , ")
                case _ => 
              }
              r match {
                case Node(v1,l1,r1) => print(v1 + " , ")
                case _ => 
              }
          }
      } else if(level>2) {
        printGivenLevel(l, target, level-1)
        printGivenLevel(r, target, level-1)
      }
  }
  
  def printCousins[A](tree:BinaryTree[A],target:A) :Unit = {
    val level = getLevel(tree, target, 1)
    printGivenLevel(tree, target, level)
  }
}