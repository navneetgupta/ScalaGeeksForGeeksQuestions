package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 10-Mar-2017
 */

case class RequestC(
    arr1: Array[Int],
    arr2:Array[Int],
    res:Array[Int],
    i:Int,
    j:Int,
    len:Int,
    flag:Boolean,
    m:Int,
    n:Int,
    prevReq:Option[RequestC]
) {
  def this(arr1:Option[Array[Int]] = None,arr2: Option[Array[Int]] = None,res: Option[Array[Int]] = None,i:Option[Int] = None,j:Option[Int] = None,
      len:Option[Int] = None,flag:Option[Boolean] = None,m:Option[Int] = None,n:Option[Int] = None,prevReq:RequestC) = {
    this(
      arr1.getOrElse(prevReq.arr1),
      arr2.getOrElse(prevReq.arr2),
      res.getOrElse(prevReq.res),
      i.getOrElse(prevReq.i),
      j.getOrElse(prevReq.j),
      len.getOrElse(prevReq.len),
      flag.getOrElse(false),
      m.getOrElse(prevReq.arr1.length),
      n.getOrElse(prevReq.arr2.length),
      Some(prevReq))
  }
}

object AllSortedArrayFromAltEltsFrm2SortedArr {
  /*
   * http://www.geeksforgeeks.org/generate-all-possible-sorted-arrays-from-alternate-elements-of-two-given-arrays/ 
   * */
  
  def generate(arr1: Array[Int],arr2:Array[Int]) : Unit = {
    val m = arr1.length
    val n = arr2.length
    val res = new Array[Int](m+n)
    generateUtil(RequestC(arr1,arr2,res,0,0,0,true,m,n,None))
  }
  
  def generateUtil(req:RequestC):Unit ={
    if(req.flag) {
      if(req.len != 0)
        println(req.res.take(req.len+1).toList)
      for {
        k <- (req.i until req.m)
      } yield {
        if(req.len == 0) {
          req.res(req.len) = req.arr1(k)
          generateUtil(new RequestC(i=Some(k+1),prevReq=req,flag=Some(!req.flag)))
        } else if(req.arr1(k) > req.res(req.len)) {
          req.res(req.len+1) = req.arr1(k)
          generateUtil(new RequestC(i=Some(k+1),len=Some(req.len+1),prevReq=req,flag=Some(!req.flag)))
        }
      }
    } else {
      for {
        k <- (req.j until req.n)
        if(req.arr2(k) > req.res(req.len))
      } yield {
        req.res(req.len+1) = req.arr2(k)
        generateUtil(new RequestC(j=Some(k+1),len=Some(req.len+1),prevReq=req,flag=Some(!req.flag)))
      }
    }
  }
}