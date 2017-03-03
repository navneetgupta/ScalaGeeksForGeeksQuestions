package com.tree.AVLTree

sealed trait AVLTree[+A] {
  def getHeight:Int = this match {
    case EmptyAvlNode => 0
    case AVLNode(v,l,r,h,s) => h
  }
  
  def getSize:Int = this match {
    case EmptyAvlNode => 0
    case AVLNode(v,l,r,h,s) => s
  }
  
  def getLeft: AVLTree[A] = this match {
    case EmptyAvlNode => EmptyAvlNode
    case AVLNode(v,l,r,h,s) => l
  }
  
  def getRight: AVLTree[A] = this match {
    case EmptyAvlNode => EmptyAvlNode
    case AVLNode(v,l,r,h,s) => r
  }
  
}
case object EmptyAvlNode extends AVLTree[Nothing]
case class AVLNode[+A](value:A, left: AVLTree[A], right:AVLTree[A], heigth: Int, size:Int) extends AVLTree[A]


object AVLTree {
  def empty[A]: AVLTree[A] = EmptyAvlNode
  
  def node[A](value: A, left: AVLTree[A] = empty, right: AVLTree[A] = empty) =
    AVLNode(value,left,right,1,1)
    
  def rightRotate[A](tree: AVLTree[A]): AVLTree[A] = tree match {
    case AVLNode(v,AVLNode(v1,l1,r1,h1,s1),r,h,s) => 
      val newRtHt = List(l1.getHeight,r.getHeight).max +1
      val newRtSz = l1.getSize + r.getSize + 1
      val newNodeHt = List(l1.getHeight,newRtHt).max + 1
      val newNodeSz = l1.getSize + newRtSz +1 ;
      AVLNode(v1,l1,AVLNode(v,l1,r,newRtHt,newRtSz),newNodeHt,newNodeSz)
    case _ => sys.error("Can Not be Left Rotated");
  }
  
  def leftRotate[A](tree: AVLTree[A]):AVLTree[A] = tree match {
    case AVLNode(v,l,AVLNode(v1,l1,r1,h1,s1),h,s) => 
      val newLtHt = List(l.getHeight,l1.getHeight).max +1
      val newLtSz = l.getSize + l1.getSize + 1
      val newNodeHt = List(newLtHt,r1.getHeight).max + 1
      val newNodeSz = newLtSz + r1.getSize +1 ;
      AVLNode(v1,AVLNode(v,l,l1,newLtHt,newLtSz),r1,newNodeHt,newNodeSz)
    case _ => sys.error("Can Not be Left Rotated");
  }
  
  def getBalance[A](tree: AVLTree[A]):Int = tree match {
    case EmptyAvlNode => 0
    case AVLNode(v,l,r,h,s) => l.getHeight - r.getHeight
  }
  
  def insert[A:Ordering](tree: AVLTree[A], a: A): AVLTree[A] = tree match {
    case EmptyAvlNode => node(a)
    case AVLNode(v,l,r,h,s) => 
      val order = implicitly[Ordering[A]]
      val newNode = if(order.lt(a, v)) {
        val lt = insert(l,a)
        val ht = List(lt.getHeight,r.getHeight).max +1
        val sz = lt.getSize + r.getSize + 1
        AVLNode(v,lt,r,ht,sz)
      } else {
        val rt = insert(r,a)
        val ht = List(l.getHeight,rt.getHeight).max + 1
        val sz = l.getSize + rt.getSize + 1
        AVLNode(v,l,rt,ht,sz)
      }
      
      val balance = getBalance(newNode)
      val nodeLeft:AVLNode[A] = newNode.getLeft.asInstanceOf[AVLNode[A]]
      val rightNode:AVLNode[A] = newNode.getRight.asInstanceOf[AVLNode[A]]
      
      if(balance > 1 && order.lt(a,nodeLeft.value)) {
        //Left Left Case
        rightRotate(newNode)
      } else if(balance < -1 && order.gt(a,rightNode.value)) {
        //Right Right case
        leftRotate(newNode)
      } else if(balance > 1 && order.gt(a,nodeLeft.value)) {
        //Left Right case
        val newNode1 = AVLNode(newNode.value,leftRotate(newNode.left),newNode.right,newNode.heigth,newNode.size)
        rightRotate(newNode1)
      } else if( balance < -1 && order.lt(a,rightNode.value)) {
        //Right Left Case
        val newNode1 = AVLNode(newNode.value,newNode.left,rightRotate(newNode.right),newNode.heigth,newNode.size)
        leftRotate(newNode1)
      } else {
        newNode
      }
  }
  
  // Method for min/max/search/isAvlInvariant/
  
  def min[A:Ordering](tree: AVLTree[A]):A = {
    require( tree != EmptyAvlNode, "Empty Node Cannot find Min")
    tree match {
      case AVLNode(v,EmptyAvlNode,_,_,_) => v
      case AVLNode(_,l,_,_,_) => min[A](l)
    }
  }
  
   def max[A:Ordering](tree: AVLTree[A]):A = {
    require( tree != EmptyAvlNode, "Empty Node Cannot find Min")
    tree match {
      case AVLNode(v,_,EmptyAvlNode,_,_) => v
      case AVLNode(_,_,r,_,_) => max[A](r)
    }
  }
   
  def search[A: Ordering](tree: AVLTree[A],a:A):Boolean = tree match {
    case EmptyAvlNode => false
    case AVLNode(v,l,r,h,s) => 
      val order = implicitly[Ordering[A]]
      if(order.equiv(v, a)) true
      else if(order.gt(v,a)) search(l,a)
      else search(r,a)
  }
  
  def isAVLInvariant[A:Ordering](tree: AVLTree[A]): Boolean = tree match {
    case EmptyAvlNode => true
    case AVLNode(v,EmptyAvlNode,EmptyAvlNode,_,_) => true
    case AVLNode(v,l,r,h,s) =>
      val order = implicitly[Ordering[A]]
      val bal = getBalance(tree)
      val balanced = (bal <= 1) && (-1 <= bal)
      val lBalanced = l match {
        case EmptyAvlNode => true
        case _ => isAVLInvariant(l) && order.lt(max(l),v)
      }
      val rBalanced  = r match {
        case EmptyAvlNode => true
        case _ => isAVLInvariant(r) && order.gt(max(r),v)
      }  
      balanced && lBalanced && rBalanced
  }
  
    
}