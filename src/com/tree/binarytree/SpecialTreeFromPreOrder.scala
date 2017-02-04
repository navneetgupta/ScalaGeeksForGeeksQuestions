package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Feb-2017
 */

object SpecialTreeFromPreOrder {
  def createTreeUtil[A](preOrder: Array[A],preLN: Array[Char],pIndex: PIndex,n: Int):BinaryTree[A] = {
    val indx = pIndex.index
    if(indx ==n) EmptyTree
    else {
      pIndex.index = indx+1
      if(preLN(indx) == 'N') {
        val lt = createTreeUtil(preOrder, preLN, pIndex, n)
        val rt = createTreeUtil(preOrder, preLN, pIndex, n)
        Node(preOrder(indx),lt,rt)
      } else {
        Node(preOrder(indx),EmptyTree,EmptyTree)
      }
    }
  }
  def specialTreeFromPreOrder[A](preOrder: Array[A],preLN: Array[Char],n: Int):BinaryTree[A] = {
    createTreeUtil(preOrder, preLN, PIndex(0), n)
  }
}