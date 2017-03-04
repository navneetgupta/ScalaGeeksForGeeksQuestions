package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 04-Mar-2017
 */

object StockBuySellMaximizeProfit {
  /*
   * http://www.geeksforgeeks.org/stock-buy-sell/ 
   * 
   * The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. */
  
  /*
   * Here we are allowed to buy and sell multiple times. Following is algorithm for this problem.
      1. Find the local minima and store it as starting index. If not exists, return.
      2. Find the local maxima. and store it as ending index. If we reach the end, set the end as ending index.
      3. Update the solution (Increment count of buy sell pairs)
      4. Repeat the above steps if end is not reached.
   */
  
  def maxProffit(arr: Array[Int]) : Unit = {
    val n = arr.length
    if(n==1) {
      print("Can not Buy Sell as it is only one day price")
    } else{
      val (count,intervalList) = processArray(arr, 0, n, Nil, 0)
      if(count==0) {
        println("There is no day when buying the stock will make profit")
      } else {
        intervalList.map(a => println("Buy On Day: "+ a._1+"       Sell On Day: "+ a._2));
      }
    }
  }
  
  def processArray(arr:Array[Int],i:Int,n:Int,xs:List[(Int,Int)],count:Int): (Int,List[(Int,Int)]) = {
    if( i < n-1) {
      val newIBuy = getIBuy(arr,i,n)
      if(newIBuy == n-1) {
        (count,xs)
      } else {
        val buy = newIBuy
        val newISell = getISell(arr, newIBuy+1, n)
        (newIBuy,newISell-1)
        processArray(arr, newISell, n, (newIBuy,newISell-1)::xs, count+1)
      }
    } else {
      (count,xs)
    }
  }
  
  def getIBuy(arr:Array[Int],i:Int,n:Int): Int = {
    if(i < n-1 && arr(i+1) <= arr(i)) {
      getIBuy(arr,i+1,n)
    } else i
  }
  
  def getISell(arr:Array[Int],i:Int,n:Int): Int = {
    if(i < n && arr(i-1) <= arr(i)) {
      getISell(arr,i+1,n)
    } else i
  }
  
  
}