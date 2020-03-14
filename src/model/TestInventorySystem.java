/*
* Name:  [your name here]
* Assignment:  [assignment name]
* Program: [your program name here]
* Date:  [assignment due date here]
    
* Description:
* [program description in your own words]
 */
package model;

/**
 *
 * @author nathan
 */
public class TestInventorySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SoftDrinkList list = new SoftDrinkList();
        SoftDrink[] y = new SoftDrink[21];

        //Throws exception because vending machine has reached its limit
        for (int i = 0; i < y.length; i++) {
            list.add(new SoftDrink());
        }

        //Correctly shows expiry date format "dayOfMonth/Month/Year"
        SoftDrink x = new SoftDrink();
        
       
        
        System.out.println(x.getExpiryDate());

    }

}
