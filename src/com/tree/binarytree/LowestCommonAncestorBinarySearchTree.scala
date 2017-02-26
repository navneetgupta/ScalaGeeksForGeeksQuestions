package com.tree.binarytree

/**
 * @author: Navneet Gupta
 * @createdOn: 06-Jan-2017
 */

//TODO: INCOMPLETE What If tree is Not BST 
object LowestCommonAncestorBinarySearchTree {
  /* 
   * http://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/
   * We can solve this problem using BST properties. We can recursively traverse the BST from root. 
   * The main idea of the solution is, while traversing from top to bottom, the first node n we encounter with value 
   * between n1 and n2, i.e., n1 < n < n2 or same as one of the n1 or n2, is LCA of n1 and n2 (assuming that n1 < n2). 
   * So just recursively traverse the BST in, if node’s value is greater than both n1 and n2 then our LCA lies in left 
   * side of the node, if it’s is smaller than both n1 and n2, then LCA lies on right side. Otherwise root is LCA (assuming 
   * that both n1 and n2 are present in BST)
   */
//   def findBinaryTreeLCA[A](tree: BinaryTree[A],a:A,b:A) : BinaryTree[A] = {
//     val xs:List[A] = findPath(tree,a,Nil)
//     val ys:List[A] = findPath(tree,b,Nil)
//     (xs.reverse,ys.reverse) match {
//       case (Nil,Nil) => ???
//     }
//   }
//   
//   def findPath[A](tree: BinaryTree[A],x:A,xs:List[A]) : List[A] = tree match {
//     case EmptyTree => xs
//     case Node(v,l,r) => if(v==x) (v::xs) else {
//       findPath(l, x, v::xs)
//       findPath(r, x, v::xs)
//     }
//   }
//   
//   def findPathInt(tree: BinaryTree[Int],x:Int,xs:List[Int]) : (Boolean,List[Int]) = tree match {
//     case EmptyTree => (false,xs)
//     case Node(v,l,r) =>{
//       val xsNew = v::xs
//       if(v==x) (true,xsNew) 
//       else {
//         if(l!= EmptyTree) {
//           findPathInt(l, x, xsNew)
//         } else if(r!=EmptyTree) {
//           findPathInt(r,x,xsNew)
//         } else {
//           (false,xsNew)
//         }
//       }
//     }
//   }
  
//  def findLCAinBST[A](tree: BinaryTree[A],a: A, b: A) : BinaryTree[A] = {
//    tree match {
//      case EmptyTree => EmptyTree
//      case Node(v,l,r) => if(v > a && v > b) findLCAinBST(l, a, b) else if(v < a && v < b) findLCAinBST(r, a, b) else Node(v,l,r)
//    }
//  }
  
  def findLCAinBST(tree: BinaryTree[Int],a: Int, b: Int) : BinaryTree[Int] = {
    tree match {
      case EmptyTree => EmptyTree
      case Node(v,l,r) => if(v > a && v > b) findLCAinBST(l, a, b) else if(v < a && v < b) findLCAinBST(r, a, b) else Node(v,EmptyTree,EmptyTree)
    }
  }
}