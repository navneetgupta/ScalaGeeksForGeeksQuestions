package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 21-Feb-2017
 */

object FindLCAinBT {
  /*
   * http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
   * 
   * Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).
   * 
   * 
   * Method 1 (By Storing root to n1 and root to n2 paths):
      Following is simple O(n) algorithm to find LCA of n1 and n2.
      1) Find path from root to n1 and store it in a vector or array.
      2) Find path from root to n2 and store it in another vector or array.
      3) Traverse both paths till the values in arrays are same. Return the common element just before the mismatch. 

	 * 
 	 * 
	 * Method 2 (Using Single Traversal)
			The method 1 finds LCA in O(n) time, but requires three tree traversals plus extra spaces for path arrays. 
			If we assume that the keys n1 and n2 are present in Binary Tree, we can find LCA using single traversal of Binary Tree 
			and without extra storage for path arrays.
			The idea is to traverse the tree starting from root. If any of the given keys (n1 and n2) matches with root, then root is LCA 
			(assuming that both keys are present). If root doesn’t match with any of the keys, we recur for left and right subtree. 
			The node which has one key present in its left subtree and the other key present in right subtree is the LCA. 
			If both keys lie in left subtree, then left subtree has LCA also, otherwise LCA lies in right subtree.
	 * 
	 * 
	 * */
  def findLCA[A](tree: BinaryTree[Int],n1: Int,n2:Int) : Int = {
    val lt = findPath(tree, Nil, n1)
    if(lt._2) {
      val path1Vector = lt._1.toVector
      val rt = findPath(tree, Nil, n2)
      val path2Vector = rt._1.toVector
      if(!rt._2) -1
      else {
        val ls = for {
          i <- ( 0 to List((lt._1).size,(rt._1).size).min)
          if(path1Vector(i) != path2Vector(i))
        } yield {
          i
        }
        if(ls.size >0) {
          path1Vector(ls.head -1)
        } else {
          -1
        }
      }
    } else {
      -1
    }
  }
  
  def findPath[A](tree: BinaryTree[A],path : List[A],k:A) : (List[A],Boolean) = tree match {
    case EmptyTree => (path,false)
    case Node(v,l,r) => 
      val newPath = v::path
      if(v==k) {
        (newPath,true)
      } else {
        (l,r) match {
          case (EmptyTree,EmptyTree) => (path,false)
          case (Node(v1,l1,r1), EmptyTree) => 
            val lt = findPath(l, newPath, k)
            if(lt._2) lt
            else (lt._1.tail,false)
          case (EmptyTree,Node(v2,l2,r2)) => 
            val rt = findPath(r, newPath, k)
            if(rt._2) rt
            else (rt._1.tail,false)
          case (Node(v1,l1,r1),Node(v2,l2,r2)) => 
            val lt = findPath(l, newPath, k)
            if(lt._2) lt
            else {
              val rt = findPath(r, lt._1, k)
              if(rt._2) rt
              else (rt._1.tail,false)
            }
        }
      }
  }
  
  def findLCA2[A](tree: BinaryTree[A],n1: A, n2: A) : BinaryTree[A] = tree match {
    case EmptyTree => tree
    case Node(v,l,r) if(v == n1 || v == n2) =>  tree
    case Node(v,l,r) => 
      val lt = findLCA2(l, n1, n2)
      val rt = findLCA2(r, n1, n2)
      (lt,rt) match {
        case (EmptyTree,EmptyTree) => EmptyTree
        case (Node(v1,l1,r1),EmptyTree) => lt
        case (EmptyTree, Node(v2,l2,r2)) => rt
        case _ => tree
      }
  }
  
  /*
   * Note that the above method assumes that keys are present in Binary Tree. If one key is present and other is absent, then it 
   * returns the present key as LCA (Ideally should have returned NULL).We can extend this method to handle all cases by passing 
   * two boolean variables v1 and v2. v1 is set as true when n1 is present in tree and v2 is set as true if n2 is present in tree.
	 * */
  
  def findLCAUtil[A](tree: BinaryTree[A],n1: A, n2: A,v1:Boolean,v2: Boolean) : (BinaryTree[A],Boolean,Boolean)= tree match{
    case EmptyTree => (tree,v1,v2)
    case Node(v,l,r) =>
      if(v == n1) {
        (tree,true,v2)
      } else if (v == n2) {
        (tree,v1,true)
      } else {
        val lt = findLCAUtil(l, n1, n2, v1, v2)
        val rt = findLCAUtil(r, n1, n2, lt._2, lt._3)
        (lt._1,rt._1) match {
          case (EmptyTree,EmptyTree) => (EmptyTree,rt._2,rt._3)
          case (Node(v1,l1,r1),EmptyTree) => (lt._1,rt._2,rt._3)
          case (EmptyTree,Node(v2,l2,r2)) => rt
          case _ => (tree,rt._2,rt._3)
        }
      }
  }
  
  def findLCA3[A](tree: BinaryTree[A],n1:A,n2:A): BinaryTree[A] = {
    val res = findLCAUtil(tree, n1, n2, false, false)
    if(res._2 && res._3) {
      res._1
    } else {
      EmptyTree
    }
  }
}