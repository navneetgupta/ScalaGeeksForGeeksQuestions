package com.tree.binarytree

object SinkOddNodesOfBT {
  /*
   * Given a Binary Tree having odd and even elements, sink all its odd valued nodes such that no node with odd value 
   * could be parent of node with even value. There can be multiple outputs for a given tree, we need to print one of them. 
   * It is always possible to convert a tree
   * */
//  def sinkOddNodes[Int](tree: BinaryTree[Int],treeR:BinaryTree[Int]) : BinaryTree[Int] = tree match {
//    case EmptyTree => treeR
//    case Node(v,EmptyTree,EmptyTree) => treeR
//    case Node(v,l,r) => {
//      val lt = sinkOddNodes(l,treeR)
//      val rt = sinkOddNodes(r,lt)
//      if(v&1)sinkNodes(rt,)
//      else rt
//    }
//  }
//  def sinkNodes(tree:BinaryTree[Int],treeR:BinaryTree[Int]): BinaryTree[Int] = tree match {
//    case EmptyTree => treeR
//    case Node(v,EmptyTree,EmptyTree) => treeR
//    case Node(v,l,r) => {
//      val lt = tree.getLeft match {
//        case EmptyTree => 
//        case Node(v1,l1,r1) if(v1 & 1)=> 
//      }
//    }
//    
//  }
  
  
  
  
  /*
   * void sink(Node *&root)
{
    // If NULL or is a leaf, do nothing
    if (root == NULL || isLeaf(root))
        return;
 
    // if left subtree exists and left child is even
    if (root->left && !(root->left->data & 1))
    {
        // swap root's data with left child and
        // fix left subtree
        swap(root->data, root->left->data);
        sink(root->left);
    }
 
    // if right subtree exists and right child is even
    else if(root->right && !(root->right->data & 1))
    {
        // swap root's data with right child and
        // fix right subtree
        swap(root->data, root->right->data);
        sink(root->right);
    }
}
 
// Function to sink all odd nodes to the bottom of binary
// tree. It does a postorder traversal and calls sink()
// if any odd node is found
void sinkOddNodes(Node* &root)
{
    // If NULL or is a leaf, do nothing
    if (root == NULL || isLeaf(root))
        return;
 
    // Process left and right subtrees before this node
    sinkOddNodes(root->left);
    sinkOddNodes(root->right);
 
    // If root is odd, sink it
    if (root->data & 1)
        sink(root);
}*/
}