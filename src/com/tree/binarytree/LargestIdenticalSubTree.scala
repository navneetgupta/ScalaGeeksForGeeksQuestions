package com.tree.binarytree

case class Str(var str:String)
object LargestIdenticalSubTree {
  /*
   * http://www.geeksforgeeks.org/find-largest-subtree-having-identical-left-and-right-subtrees/
   * 
   * A simple solution is to consider every node, recursively check if left and right subtrees are identical */
  
  /*
   * We can save recursive calls. The idea is to do a postorder traversal of given binary tree and for each node,
   * we store structure of its left and right subtrees. In order to store the structure of left and right subtree, 
   * we use a string. We separate left and right subtree nodes from current node in the string by using a delimiter. 
   * For every encountered node, we update largest subtree found so far if its left and right subtree structure are similar.
   */
//  def getLargestSubTreeSizeAndRootNode[A](tree: BinaryTree[A],str:Str,maxNode:Int,maxSize:Int):(Option[A],Int,String) = tree match {
//    case EmptyTree => (None,0,null)
//    case Node(v,l,r) => {
//      String left
//      val lt = getLargestSubTreeSizeAndRootNode(l,)
//    }
//  }
  
  
  /*
   * // Sets maxSize to size of largest subtree with
// identical left and right.  maxSize is set with
// size of the maximum sized subtree. It returns
// size of subtree rooted with current node. This
// size is used to keep track of maximum size.
int largestSubtreeUtil(Node* root, string& str,
                    int& maxSize, Node*& maxNode)
{
    if (root == NULL)
        return 0;
 
    // string to store structure of left and
    // right subtrees
    string left = "", right = "";
 
    // traverse left subtree and finds its size
    int ls = largestSubtreeUtil(root->left, left,
                               maxSize, maxNode);
 
    // traverse right subtree and finds its size
    int rs = largestSubtreeUtil(root->right, right,
                               maxSize, maxNode);
 
    // if left and right subtrees are similar
    // update maximum subtree if needed (Note that
    // left subtree may have a bigger value than
    // right and vice versa)
    int size = ls + rs + 1;
    if (left.compare(right) == 0)
    {
       if (size > maxSize)
       {
            maxSize  = size;
            maxNode = root;
       }
    }
 
    // append left subtree data
    str.append("|").append(left).append("|");
 
    // append current node data
    str.append("|").append(to_string(root->data)).append("|");
 
    // append right subtree data
    str.append("|").append(right).append("|");
 
    return size;
}
 
// function to find the largest subtree
// having identical left and right subtree
int largestSubtree(Node* node, Node*& maxNode)
{
    int maxSize = 0;
    string str = "";
    largestSubtreeUtil(node, str, maxSize, maxNode);
 
    return maxSize;
}
   */
}