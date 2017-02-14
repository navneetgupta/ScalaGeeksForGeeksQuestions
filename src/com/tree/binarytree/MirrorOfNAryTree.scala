package com.tree.binarytree

object MirrorOfNAryTree {
  /*
   * Given a Tree where every node contains variable number of children, convert the tree to its mirror. 
   * Below diagram shows an example. 
   */
  
  def mirrorOfNAryTree[A](tree: NAryTree[A]):NAryTree[A] = tree match {
    case EmptyNAryTree => tree
    case NAryNode(v,c) =>  {
      val arrLength = c.length
      if(arrLength<2) tree
      else {
        val res:IndexedSeq[NAryTree[A]] = for{
          i <- (1 to arrLength)
        }yield{
          mirrorOfNAryTree(c(i))
        }
        NAryNode(v,res.reverse.toArray)
      }
    }
  }
}