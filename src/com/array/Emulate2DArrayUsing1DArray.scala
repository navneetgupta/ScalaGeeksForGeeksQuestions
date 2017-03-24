package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */


object Emulate2DArrayUsing1DArray {
  /*
   * http://www.geeksforgeeks.org/emulating-a-2-d-array-using-1-d-array/ 
   * Clearly, the size of 1-d array is the number of elements in 2-d array i.e. (m x n). If the elements in the 2-d array are stored 
   * in row-major order. Then, the element at index [i, j] in 2-d array will be stored in 1-d array at index k as:
   * k = j + (i * total_no_of_columns_in_matrix)
   * If the elements in the 2-d array are stored in column-major order, the value of index k will be
   * k = i + (j * total_no_of_rows_in_matrix)
   */
  
  def emulate(arr: Array[Array[Int]],n: Int, m: Int): Unit = {
    val arr1D = new Array[Int](n*m)
    for {
      i <- (0 to n-1)
      j <- (0 to m-1)
    } yield {
      val k = i*m+j
      arr1D(k) = arr(i)(j)
    }
    /*
     * for {
      i <- (0 to n-1)
    } yield {
      arr.foldLeft((0,0))((a,b) => {
        
      })
    }*/
    for {
      i <- (0 to n-1)
      j <- (0 to m-1)
    } yield print(arr1D(1*m+j) + "  ")
  }
}