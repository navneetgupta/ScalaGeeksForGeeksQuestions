package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 11-Feb-2017
 */

/*
 * http://www.geeksforgeeks.org/check-leaves-level/
 * */

object AreAllLeafNodeAtSameLevel {
  
  def checkLeavesLevelUtil[A](tree:BinaryTree[A],level: Int,leafLevel: Int): (Boolean,Int) = tree match {
    case EmptyTree => (true,leafLevel)
    case Node(v,EmptyTree,EmptyTree) => if(leafLevel==0) (true,level) else (leafLevel==level,leafLevel)
    case Node(v,l,r) => 
      val lt = checkLeavesLevelUtil(l, level+1, leafLevel)
      if(lt._1) {
        checkLeavesLevelUtil(r, level+1, lt._2)
      } else {
        lt
      }
  }
  
  def checkLeavesLevelUtil2[A](tree:BinaryTree[A],level: Int,leafLevel: Int): (Boolean,Int) = tree match {
    case EmptyTree => (true,leafLevel)
    case Node(v,l,r) =>
      
      var updated_leafLEvel = leafLevel
      (l,r) match {
        case (EmptyTree,EmptyTree) => 
          if(updated_leafLEvel == 0) {
            updated_leafLEvel = level
            (true,updated_leafLEvel)
          } else 
            (leafLevel==level,leafLevel)
            
        case (_,_) => 
          val lt = checkLeavesLevelUtil2(l, level+1, updated_leafLEvel)
          if(lt._1) {
            checkLeavesLevelUtil2(r, level+1, lt._2)
          } else {
            lt
          }
      }
  }
  
  def checkLeavesLevel[A](tree:BinaryTree[A]) : Boolean = {
    checkLeavesLevelUtil(tree,0,0)._1
  }
  
}