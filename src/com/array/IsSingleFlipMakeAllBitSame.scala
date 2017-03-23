package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object IsSingleFlipMakeAllBitSame {
  /*
   * http://www.geeksforgeeks.org/change-bits-can-made-one-flip/ 
   * Given a binary string, find if it is possible to make all its digits equal (either all 0’s or all 1’s) by flipping exactly one bit. 
   * */
  
  /*
   * Method 1 (Counting 0’s and 1’s)
   * If all digits of a string can be made identical by doing exactly one flip, that means the string has all its digits equal to one 
   * another except this digit which has to be flipped, and this digit must be different than all other digits of the string. 
   * The value of this digit could be either zero or one. Hence, this string will either have exactly one digit equal to zero, 
   * and all other digits equal to one, or exactly one digit equal to one, and all other digit equal to zero.
   * Therefore, we only need to check whether the string has exactly one digit equal to zero/one, and if so, the answer is yes; 
   * otherwise the answer is no.
   * 
   * Time complexity : O(n) where n is the length of the string
   */
  
  def canMakeSame(str: String) : Boolean = {
    val (zeros,ones) = str.toArray.foldLeft((0,0))((a,b) => if(b=='0')(a._1+1,a._2) else (a._1,a._2+1))
    (zeros ==1 || ones ==1)
  }
  
  /*
   * Method 2 (Counting 0’s and 1’s)
   * The idea is to compute sum of all bits. If sum is n-1 or 1, then output is true, else false. This solution doesn’t require a 
   * comparison in a loop.
   */
  def canMakeSame2(str: String): Boolean = {
    val sum = str.toArray.foldLeft(0)((a,b) => (b-'0')+a)
    (sum == str.length-1 || sum ==1)
  }
}