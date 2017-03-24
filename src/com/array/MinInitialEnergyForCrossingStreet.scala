package com.array

/**
 * @author: Navneet Gupta
 * @createdOn: 24-Mar-2017
 */

object MinInitialEnergyForCrossingStreet {
  /*
   * http://www.geeksforgeeks.org/minimum-initial-energy-required-to-cross-street/ 
   * Given an array containing positive and negative numbers. The array represents checkpoints from one end to other end of street. 
   * Positive and negative values represent amount of energy at that checkpoint. Positive numbers increase the energy and negative 
   * numbers decrease. Find the minimum initial energy required to cross the street such that Energy level never becomes 0 or less than 0
   * */
  
  
  /*
   * We take initial minimum energy 0 i.e; initMinEnergy = 0 and energy at any checkpoint as currEnergy = 0. Now traverse each checkpoint 
   * linearly and add energy level at each i’th checkpoint i.e; currEnergy = currEnergy + arr[i]. If currEnergy becomes non-positive, 
   * then we need at least “abs(currEnergy) + 1” extra initial energy to cross this point. Therefore we update initMinEnergy = 
   * (initMinEnergy + abs(currEnergy) + 1). We also update currEnergy = 1 as we now have the required extra minimum initial energy 
   * for next point*/
  
  def minInitialEnergy(arr: Array[Int]):Int = {
    //(initialEnergy,currEnergy,flag)
    val (initialEnergy,currEnergy,flag) = arr.foldLeft((0,0,false))((a,b) => {
      val newCurrEn = a._2 + b
      if(newCurrEn <= 0) {
        (a._1+math.abs(newCurrEn)+1,1,true)
      } else (a._1,newCurrEn,a._3)
    })
    if(!flag) 1 else initialEnergy
  }
}