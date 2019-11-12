/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author andre
 */
abstract class Price {
    abstract double getCharge(int daysRented);
    abstract int getPriceCode();
    
    int getFrequentRenterPoints(int daysRented) {
       return 1;
   }
}
