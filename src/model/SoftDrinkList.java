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

    private final Calendar calendar;
    private final int INVENTORY_LIMIT = 20;
    private final ArrayList<SoftDrink> list = new ArrayList();

    //This should create a new date everytime we run the application. which can be saved
    //to the file each time we create a file and save the each softdrink wiht its expiry date
    public SoftDrinkList() {
        calendar = Calendar.getInstance();
    }

    public SoftDrinkList(File file) {
        calendar = Calendar.getInstance();
    }

    public SoftDrinkList(String string) {
        calendar = Calendar.getInstance();
    }
    


    //This method will add SoftDrink obejcts to the array list.
    /*GUI interaction: When the user clicks the add button this method will be used.
    This method will ultimately help add objects/records to a file but WONT save the records*/
    
    
    /*Method Note: The soft drink vending machine has a limit on how many cans of pop
    it can have within it. The constant data field "INEVENTORY_LIMIT" resprents
    thhe limit of pop cans able to fit inside the vending machine.
    */
    //GUI interaction: Adding
    public void add(SoftDrink softdrink) {

        if (list.size() == this.INVENTORY_LIMIT) {
            throw new IllegalArgumentException("ERROR: Inventory has reached its limit\n");
        } else {
            
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getFullName().equals(softdrink.getFullName())){
                 //body
                }
            }
            list.add(softdrink);      
        }
        
        
    }

    //This method is meant to search for an object/record within and arrayList/file
    //GUI interaction: Searching
    public SoftDrink findItemByFullName(String itemFullName) {
        SoftDrink temp = new SoftDrink();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFullName().equals(itemFullName)) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    /*This method is feature of our application used to match the soft drink with the expiry
    date that is overdue(item is expired), then remove that item from the list.
     */
   //GUI interaction: Removing expired items adn displaying them to the screen
    public String removeExpiredItems() {
        String output  = "";
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getExpiryDate().compareTo(String.format("%s/%s/%s",
                    calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.MONTH) + 1,
                    calendar.get(Calendar.YEAR))) > 0) {
                output += list.remove(i) + "\n";
            }
        }
        return output;
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
    public void editItem(String fullName, String... objectFields) {

    }

    //This method sorts the arrayList aplhabetically
    public void sortList() {
        Collections.sort(list); //must have Compareable Interface implemented in SoftDrink class for this to work

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

    //Dont need to worry about these methods below for now
    //This method will help load the FILE/arrayList and it RECORDS/obejcts
    //GUI Interaction: Loading
    public void loadFromFile(File file) {

    }

    //This method help to save the RECORDS/objects to the FILE/arrayList
    //GUI Interaction: Saving
    public void writeToFile(File file) {

    }

}
