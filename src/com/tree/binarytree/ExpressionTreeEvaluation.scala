package com.tree.binarytree

import com.tree.binarytree.BinaryTree._

/**
 * @author: Navneet Gupta
 * @createdOn: 08-Feb-2017
 */

object ExpressionTreeEvaluation extends App {

  def evaluate(tree:BinaryTree[String],result:Int):Int = tree match {
    case EmptyTree=> result
    case Node(v,EmptyTree,EmptyTree) => result+v.toInt
    case Node(v,l,r) => {
      val l_data = evaluate(l, result)
      val r_data = evaluate(r,result)
      if(v == "+") {
        l_data + r_data
      } else if(v == "-") {
        l_data - r_data
      } else if(v == "*") {
        l_data * r_data
      } else {
        l_data / r_data
      }
    }
  }
  
  evaluate(expresiionTree, 0)
}