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

        
        SoftDrink[] y = new SoftDrink[4];
        
          list.add(new SoftDrink("Coca-cola", "vanilla"));
          list.add(new SoftDrink("Coca-cola", "cherry"));
          list.add(new SoftDrink("Coca-cola", "vanilla"));
          list.add(new SoftDrink("Coca-cola", "vanilla"));
      
      
        System.out.println(list.getItemQuanityByFlavour("cherry"));

 
    
    }

}
