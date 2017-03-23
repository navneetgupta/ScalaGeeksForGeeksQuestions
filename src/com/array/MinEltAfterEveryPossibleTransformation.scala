package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 23-Mar-2017
 */

object MinEltAfterEveryPossibleTransformation {
  /*
   * http://www.geeksforgeeks.org/find-minimum-elements-considering-possible-transformations/ 
   * 
   * Given an array of three colors. The array elements have a special property. Whenever two elements of different colors become 
   * adjacent to each other, they merge into an element of the third color. How many minimum number of elements can be there in array 
   * after considering all possible transformations.
   * */
  
  /*
   * Possible Patterns

      Let n be number of elements in array. No matter what the input is, we always end up in three types of outputs:
      
      n: When no transformation can take place at all
      2: When number of elements of each color are all odd or all even
      1: When number of elements of each color are mix of odd and even
      	Steps:

        1) Count the number of elements of each color.
        2) Then only one out of the folowing four cases can happen:
        ......1) There are elements of only one color, return n.
        ......2) There are even number of elements of each color, return 2.
        ......3) There are odd number of elements of each color, return 2.
        ......4) In every other case, return 1.
                (The elements will combine with each other repeatedly until 
                 only one of them is left)
  */
  def findMin(arr: Array[Char]): Int = {
    val n = arr.length
    val (r,g,b) = arr.foldLeft((0,0,0))((a,b) => {
      if(b=='B')(a._1,a._2,a._3+1)
      else if(b=='R')(a._1+1,a._2,a._3)
      else if(b=='G')(a._1,a._2+1,a._3)
      else a
    })
    
    if(r == n || g == n || b ==n) n
    else if(((r&1) != 0) && ((g&1) != 0) && ((b&1) != 0)) 2
    else if(!((r&1) != 0) && !((g&1) != 0) && !((b&1) != 0)) 2
    else 1
  }
}