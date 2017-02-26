package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 21-Feb-2017
 */

case class Level(var maxLevel: Int)
object DeepestLeftLeafNode {
  /*
   * http://www.geeksforgeeks.org/deepest-left-leaf-node-in-a-binary-tree/
   * 
   * Given a Binary Tree, find the deepest leaf node that is left child of its parent. For example, consider the following tree.
   * 
   * The idea is to recursively traverse the given binary tree and while traversing, maintain “level” which will store the current node’s level in the tree. If current node is left leaf, then check if its level is more than the level of deepest left leaf seen so far. If level is more then update the result. If current node is not leaf, then recursively find maximum depth in left and right subtrees, and return maximum of the two depths.
   * */
  
  /*
   * class Level 
{
    // maxlevel: gives the value of level of maximum left leaf
    int maxlevel = 0;
}
  
class BinaryTree 
{
    Node root;
      
    // Node to store resultant node after left traversal
    Node result;
  
    // A utility function to find deepest leaf node.
    // lvl:  level of current node.
    // isLeft: A bool indicate that this node is left child
    void deepestLeftLeafUtil(Node node, int lvl, Level level,
            boolean isLeft) 
    {
        // Base case
        if (node == null) 
            return;
  
        // Update result if this node is left leaf and its level is more
        // than the maxl level of the current result
        if (isLeft != false && node.left == null && node.right == null
                && lvl > level.maxlevel) 
        {
            result = node;
            level.maxlevel = lvl;
        }
  
        // Recur for left and right subtrees
        deepestLeftLeafUtil(node.left, lvl + 1, level, true);
        deepestLeftLeafUtil(node.right, lvl + 1, level, false);
    }
  
    // A wrapper over deepestLeftLeafUtil().
    void deepestLeftLeaf(Node node) 
    {
        Level level = new Level();
        deepestLeftLeafUtil(node, 0, level, false);
    }
      */
  
  def deepestLeftLeafUtil[A](tree: BinaryTree[A],lvl: Int, maxLevel: Int,isLeft:Boolean): (BinaryTree[A],Int) = tree match {
    case  EmptyTree => (EmptyTree,maxLevel)
    case Node(v,EmptyTree,EmptyTree) if(isLeft && lvl > maxLevel) => (tree,lvl)
    case Node(v,l,r) => 
      val lt = deepestLeftLeafUtil(l, lvl+1, maxLevel, true)
      val rt = deepestLeftLeafUtil(r, lvl+1, lt._2, false)
      rt
  }
  def deepestLeftLeafUtil2[A](tree: BinaryTree[A],lvl: Int, level: Level,isLeft:Boolean,res: BinaryTree[A]): BinaryTree[A] = tree match {
    case  EmptyTree => res
    case Node(v,EmptyTree,EmptyTree) if(isLeft && lvl > level.maxLevel) =>
      level.maxLevel = lvl
      tree
    case Node(v,l,r) => 
      val lt = deepestLeftLeafUtil2(l, lvl+1, level, true,tree)
      val rt = deepestLeftLeafUtil2(r, lvl+1, level, false,lt)
      rt
  }
  
  def deepestLeftLeaf[A](tree: BinaryTree[A]) : BinaryTree[A] = {
    deepestLeftLeafUtil2(tree, 0, Level(0), false,EmptyTree)
  }
}