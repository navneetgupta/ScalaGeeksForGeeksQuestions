package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 21-Feb-2017
 */

object BuildTreeFromInAndLevelOrderTraversal {
  /*
   * http://www.geeksforgeeks.org/construct-tree-inorder-level-order-traversals/
   * */
  
  /*
   * Node buildTree(int in[], int level[]) 
    {
        Node startnode = null;
        return constructTree(startnode, level, in, 0, in.length - 1);
    }
  
    Node constructTree(Node startNode, int[] levelOrder, int[] inOrder,
            int inStart, int inEnd) 
    {
  
        // if start index is more than end index
        if (inStart > inEnd)
            return null;
  
        if (inStart == inEnd)
            return new Node(inOrder[inStart]);
             
        boolean found = false;
        int index = 0;
  
        // it represents the index in inOrder array of element that
        // appear first in levelOrder array.
        for (int i = 0; i < levelOrder.length - 1; i++) 
        {
            int data = levelOrder[i];
            for (int j = inStart; j < inEnd; j++) 
            {
                if (data == inOrder[j]) 
                {
                    startNode = new Node(data);
                    index = j;
                    found = true;
                    break;
                }
            }
            if (found == true)
                break;
        }
  
        //elements present before index are part of left child of startNode.
        //elements present after index are part of right child of startNode.
        startNode.setLeft(constructTree(startNode, levelOrder, inOrder, 
                                                    inStart, index - 1));
        startNode.setRight(constructTree(startNode, levelOrder, inOrder, 
                                                     index + 1, inEnd));
  
        return startNode;
    }
  
    /* Utility function to print inorder traversal of binary tree */
    void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }*/
  
  def buildTreeFromInOrderAndLevelOrderTravesal[A](inOrder: Array[A],levelOrder: Array[A],start: Int,end: Int) : BinaryTree[A] = {
    if(start > end) EmptyTree
    else if(start == end) Node(inOrder(start),EmptyTree,EmptyTree)
    else {
      val al:IndexedSeq[(BinaryTree[A],Int,Boolean)] = for {
        i <- (0 until levelOrder.length-1)
        j <- (start until end)
      } yield {
        val data = levelOrder(i)
        if(data == inOrder(j)) {
          (Node(data,EmptyTree,EmptyTree),j,true)
        } else {
          (EmptyTree,0,false)
        }
      }
      val newAl = al.takeWhile(p => (p._3 == true))
//      newAl.toList match {
//        case Nil => EmptyTree
//        case x::xs => 
//          val last = newAl.toList.last
//          val lt = 
//      }
      EmptyTree
    }
  }
}