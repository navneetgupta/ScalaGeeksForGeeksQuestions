package com.tree.binarytree

object BinaryTreeFormParentArrayRepresentation extends App{
  /*
   * http://www.geeksforgeeks.org/construct-a-binary-tree-from-parent-array-representation/
   * 
   * Given an array that represents a tree in such a way that array indexes are values in tree nodes and array values give the 
   * parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root. 
   * */
   
  def createNode(parent: Array[Int],i : Int,created: Array[BinaryTree[Int]]) : Unit = {
    created(i) match {
      case Node(v,l,r) => 
      case EmptyTree => 
        if(parent(i) == -1) {
          
        } else {
          created(parent(i)) match {
            case EmptyTree => createNode(parent,parent(i),created)
            case _ =>
              val temp = created(i)
              temp match {
                case Node(v, EmptyTree,r ) => created(i) = Node(v,created(i),r)
                case Node(v,l,r) => created(i) = Node(v,l,created(i))
                case _ => 
              }
          }
        }
    }
  }
  
  def createdTree(parent:Array[Int],n: Int):BinaryTree[Int] = {
    val created: Array[BinaryTree[Int]] = Array.fill(parent.length)(EmptyTree)
    for{
      i <- (0 until parent.length)
    } yield {println(created);createNode(parent, i, created)}
    val index = parent.indexWhere(_ == -1)
    created(index)
  }
  
  createdTree(Array(-1, 0, 0, 1, 1, 3, 5), 7)
  
}

