package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 20-Feb-2017
 */

object DistanceBtwnTwoGivenKeysOfBT {
  /*
   * http://www.geeksforgeeks.org/find-distance-two-given-nodes/
   * Find the distance between two keys in a binary tree, no parent pointers are given. Distance between two nodes is the minimum number of edges to be traversed to reach one node from other.
   * 
   * The distance between two nodes can be obtained in terms of lowest common ancestor. Following is the formula.

Dist(n1, n2) = Dist(root, n1) + Dist(root, n2) - 2*Dist(root, lca) 
'n1' and 'n2' are the two given keys
'root' is root of given Binary Tree.
'lca' is lowest common ancestor of n1 and n2
Dist(n1, n2) is the distance between n1 and n2.
   * 
   * 
   * */
  
  /*
   * // Returns level of key k if it is present in tree, otherwise returns -1

 
  
// The main function that returns distance between n1 and n2
// This function returns -1 if either n1 or n2 is not present in
// Binary Tree.


// This function returns pointer to LCA of two given values n1 and n2. 
// It also sets d1, d2 and dist if one key is not ancestor of other
// d1 --> To store distance of n1 from root
// d2 --> To store distance of n2 from root
// lvl --> Level (or distance from root) of current node
// dist --> To store distance between n1 and n2
Node *findDistUtil(Node* root, int n1, int n2, int &d1, int &d2, 
                   int &dist, int lvl)
{
    // Base case
    if (root == NULL) return NULL;
 
    // If either n1 or n2 matches with root's key, report
    // the presence by returning root (Note that if a key is
    // ancestor of other, then the ancestor key becomes LCA
    if (root->key == n1)
    {
         d1 = lvl;
         return root;
    }
    if (root->key == n2)
    {
         d2 = lvl;
         return root;
    }
 
    // Look for n1 and n2 in left and right subtrees
    Node *left_lca  = findDistUtil(root->left, n1, n2, d1, d2, dist, lvl+1);
    Node *right_lca = findDistUtil(root->right, n1, n2, d1, d2, dist, lvl+1);
 
    // If both of the above calls return Non-NULL, then one key
    // is present in once subtree and other is present in other,
    // So this node is the LCA
    if (left_lca && right_lca)
    {
        dist = d1 + d2 - 2*lvl;
        return root;
    }
 
    // Otherwise check if left subtree or right subtree is LCA
    return (left_lca != NULL)? left_lca: right_lca;
}
int findDistance(Node *root, int n1, int n2)
{
    // Initialize d1 (distance of n1 from root), d2 (distance of n2 
    // from root) and dist(distance between n1 and n2)
    int d1 = -1, d2 = -1, dist;
    Node *lca = findDistUtil(root, n1, n2, d1, d2, dist, 1);
 
    // If both n1 and n2 were present in Binary Tree, return dist
    if (d1 != -1 && d2 != -1)
        return dist;
 
    // If n1 is ancestor of n2, consider n1 as root and find level 
    // of n2 in subtree rooted with n1
    if (d1 != -1)
    {
        dist = findLevel(lca, n2, 0);
        return dist;
    }
 
    // If n2 is ancestor of n1, consider n2 as root and find level 
    // of n1 in subtree rooted with n2
    if (d2 != -1)
    {
        dist = findLevel(lca, n1, 0);
        return dist;
    }
 
    return -1;
}
int findLevel(Node *root, int k, int level)
{
    // Base Case
    if (root == NULL)
        return -1;
 
    // If key is present at root, or in left subtree or right subtree,
    // return true;
    if (root->key == k)
        return level;
 
    int l = findLevel(root->left, k, level+1);
    return (l != -1)? l : findLevel(root->right, k, level+1);
}
*/
  
  def findLevel[A](tree: BinaryTree[A],n1: A,level: Int): Int = tree match {
    case EmptyTree => -1
    case Node(v,l,r) if(v == n1) => level
    case Node(v,l,r) => 
      val lt = findLevel(l,n1,level+1)
      if(lt != -1)  lt else findLevel(r, n1, level+1)
  }
  
  def findDistance[A](tree: BinaryTree[A],n1: A, n2 :A) : Int = {
     val lca = findDistUtil(tree,n1,n2,-1,-1,0,1)
     if(lca._2 != -1 && lca._3 != -1) lca._4
     else if(lca._2 != -1) {
       findLevel(lca._1,n2,0)
     } else if(lca._3 != -1) {
       findLevel(lca._1,n1,0)
     } else {
       -1
     }
  }
  
  def findDistUtil[A](tree: BinaryTree[A],n1: A, n2: A, d1: Int,d2: Int,dist: Int,lvl: Int) : (BinaryTree[A],Int,Int,Int) = tree match {
    case EmptyTree => (EmptyTree,d1,d2,dist)
    case Node(v,l,r) => 
      if(v == n1) {
        (tree,lvl,d2,dist)
      } else if(v == n2) {
        (tree,d1,lvl,dist)
      } else {
        val lt = findDistUtil(l, n1, n2, d1, d2, dist, lvl+1)
        val rt = findDistUtil(r, n1, n2, lt._2, lt._3, lt._4, lvl+1)
        if(!lt._1.isEmptyTree && !rt._1.isEmptyTree) {
          (tree,d1,d2,d1+d2-2*lvl)
        } else {
          if(!lt._1.isEmptyTree) {
            (lt._1,rt._2,rt._3,rt._4)
          } else {
            rt
          }
        }
      }
  }
}