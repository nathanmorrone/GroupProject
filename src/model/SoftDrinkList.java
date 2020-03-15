/*
 * [Class name]
 * Author: [the name of the person who created the class. It might be different from yours]
 * Date: [date]
 *
 * Description
 * [Description about the class]
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author nathan
 */
public class SoftDrinkList {

    private int softDrinkCountByFlavour;
    private int inventoryQuantity;
    private final int INVENTORY_LIMIT = 20;
    private Calendar calendar;
    private ArrayList<SoftDrink> list = new ArrayList<SoftDrink>();

    //This should create a new date everytime we run the application. which can be saved
    //to the file each time we create a file and save the each softdrink wiht its expiry date
    public SoftDrinkList() {
        softDrinkCountByFlavour = 0;
        inventoryQuantity = 0;
        calendar = Calendar.getInstance();
    }

    
    /*GUI interaction: When the user clicks the add button this method will be used.
    This method will ultimately help add objects/records to the arrayList/file but WONT save the records*/
    /*Method Note: The soft drink vending machine has a limit on how many cans of pop
    it can have within it. The constant data field "INEVENTORY_LIMIT" resprents
    thhe limit of pop cans able to fit inside the vending machine.
     */
    //GUI interaction: Adding
    public void add(SoftDrink object) {


        if (list.size() == INVENTORY_LIMIT) {
            throw new IllegalArgumentException("ERROR: Inventory has reached its limit\n");
        } else {
            list.add(object);
            ++inventoryQuantity;
        }

    }

    /*This method is feature of our application used to match items that are expired
    and then remove those items and return them in an array list. We can display to the user what items we have removed
     */
    //GUI interaction: Removing expired items adn displaying them to the screen
    public ArrayList<SoftDrink> removeExpiredItems() {

        ArrayList<SoftDrink> temp = new ArrayList<SoftDrink>();
        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i).getExpiryDate().compareTo(String.format("%s/%s/%s",
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH) + 1,
                    calendar.get(Calendar.DAY_OF_MONTH))) > 0) {
                temp.add(list.remove(i));
            }
        }
        return temp;
    }

    //This method removes an item from the list 
    public void removeItem(SoftDrink softDrink) {
        list.remove(softDrink);
    }
    
    
    /*This method will change the current data fields of a Soft Drink.
    The fullName argument is used to check if the object in the 
    list has the same name. based on if thats true, the objectFields variable
    will replace the data fields of the matched object, and save the overwritten
    object to the arrayList */
    //GUI Interatcion: When the user clicks edit, then save. 
    public void editItem(SoftDrink softdrink, String...objectFields) {
        
        double price;
        
        
        
        
 

    }

    //This method is meant to search for an object/record within and arrayList/file and return the obejct based on their brand name. We will have to validate this
    //GUI interaction: Searching
    public SoftDrink findItemByBrand(String brandName) {
        SoftDrink temp = new SoftDrink();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBrandName().equals(brandName)) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    //This method is meant to search for an objects/records within and arrayList/file and return the obejcts based on their brand name. We will have to validate this
    //GUI interaction: Searching
    public ArrayList<SoftDrink> findItemsByBrand(String brandName) {
        ArrayList<SoftDrink> temp = new ArrayList<SoftDrink>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBrandName().equals(brandName)) {
                temp.set(i, list.get(i));
            }
        }
        return temp;
    }

    /*This method is meant to search for an objects/records within and arrayList/file 
    and return an arraylist of obejcts based on their flavour. We will have to validate this*/
    //GUI interaction: Searching
    public ArrayList<SoftDrink> findItemsByFlavour(String flavour) {
        ArrayList<SoftDrink> temp = new ArrayList<SoftDrink>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFlavour().equals(flavour)) {
                temp.set(i, list.get(i));
            }
        }
        return temp;
    }

    public int getIndexOf(SoftDrink drink) {
        //returns the index of the element(item object) in the itemList
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFlavour().equals(drink.getFlavour())) {
                return list.indexOf(list.get(i));
            }
        }
        return -1;
    }

    //This method returns the number of softdrinks in the inventory based on flavour
    //This methods return value will be used inside the specfic field for each record/object that is displayed in the textfields 
    public int getItemQuanityByFlavour(String softDrinkFlavour) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFlavour().equals(softDrinkFlavour)) {
                ++softDrinkCountByFlavour;
            }

        }
        return softDrinkCountByFlavour;
    }

    public int getInventoryQuantity() {
        return this.inventoryQuantity;
    }

    //This method returns the next item in an array list after the current item
    //GUI interaction: This method will be used when the user clicks the next button on the GUI(Refer to wireframe)
    public SoftDrink getNextItem(SoftDrink softDrink) {
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(softDrink)) {
                softDrink = list.get(i + 1);
            }
        }

        return softDrink;
    }

    //This method returns the previous item in an array list after the current item
    //GUI interaction: This method will be used when the user clicks the previous button on the GUI(Refer to wireframe)
    public void getPreviousItem() {

    }

    //This method sorts the arrayList aplhabetically
    public void sortList() {
        Collections.sort(list); //must have Compareable Interface implemented in SoftDrink class for this to work

    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

}
