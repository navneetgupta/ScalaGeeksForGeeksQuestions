package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 05-Mar-2017
 */

object PossibleGroupOf2Or3WithSumAs3Mult {
  /*
   * http://www.geeksforgeeks.org/count-possible-groups-size-2-3-sum-multiple-3/ 
   * Given an unsorted integer (positive values only) array of size ‘n’, we can form a group of two or three, t
   * he group should be such that the sum of all elements in that group is a multiple of 3. Count all possible number of
   * groups that can be generated in this way.*/
  
  /*
   * The idea is to see remainder of every element when divided by 3. A set of elements can form a group only if sun of their remainders is multiple of 3. Since the task is to enumerate groups, we count all elements with different remainders.

      1. Hash all elements in a count array based on remainder, i.e, 
         for all elements a[i], do c[a[i]%3]++;
      2. Now c[0] contains the number of elements which when divided
         by 3 leave remainder 0 and similarly c[1] for remainder 1 
         and c[2] for 2.
      3. Now for group of 2, we have 2 possibilities
         a. 2 elements of remainder 0 group. Such possibilities are 
            c[0]*(c[0]-1)/2
         b. 1 element of remainder 1 and 1 from remainder 2 group
            Such groups are c[1]*c[2].
      4. Now for group of 3,we have 4 possibilities
         a. 3 elements from remainder group 0.
            No. of such groups are c[0]C3
         b. 3 elements from remainder group 1.
            No. of such groups are c[1]C3
         c. 3 elements from remainder group 2.
            No. of such groups are c[2]C3
         d. 1 element from each of 3 groups. 
            No. of such groups are c[0]*c[1]*c[2].
      5. Add all the groups in steps 3 and 4 to obtain the result.
   */
  
  def possibleGroups(arr: Array[Int]): Int = {
    val n = arr.length
    // Create an array C[3] to store counts of elements with remainder 0, 1 and 2.  c[i] would store count of elements with remainder i
    val c = Array(0,0,0)
    arr.foldLeft(0)((a,b) => {
      c(b%3) = c(b%3)+1
      a+1
    })
    
    (c(0)*(c(0)-1)/2) + (c(1)*c(2)) + (c(0)*(c(0)-1)*(c(0)-2)/6) + (c(1)*(c(1)-1)*(c(1)-2)/6) + (c(2)*(c(2)-1)*(c(2)-2)/6) + (c(0)*c(1)*c(2))
  }
}