package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 01-Feb-2017
 */

object GetLevelOfANode {
  def getLevelOfANode(tree:BinaryTree[Int],target:Int):Int = {
    getLevelUtilOfANode(tree,target,1)
  }
  
  def getLevelUtilOfANode(tree:BinaryTree[Int],target:Int,level:Int):Int = tree match {
    case EmptyTree => 0
    case Node(v,l,r) => {
      if(v==target) level
      else {
        val dLevel = getLevelUtilOfANode(l, target,level+1)
        if(dLevel != 0)
          dLevel
        else getLevelUtilOfANode(r, target, level+1)
      }
    }
  }
}