/*
 * [Class name]
 * Author: [the name of the person who created the class. It might be different from yours]
 * Date: [date]
 *
 * Description
 * [Description about the class]
 */
package model;


import java.util.Calendar;




/**
 *
 * @author nathan
 */
public class SoftDrink implements Comparable<SoftDrink> {

    private String brandName;
    private String flavour;
    private String expiryDate;
    private int numberOfSoftDrinks;
    final private Calendar calendar;
    
  

    public SoftDrink() {
        ++numberOfSoftDrinks;
        calendar = Calendar.getInstance(); //This is how we create an instance of Calendar type. Its an immutable class meaning we can create an instance of it althoughn this how we do it.
        brandName = "Unknown name";
        flavour = "Unknown flavour";
        expiryDate = String.format("%s/%s/%s",calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1,calendar.get(Calendar.YEAR)); //returns the actually month and date currently. Calendar.MONTH returns the day of the motnhs in array, january(0) being the first element 
    }

    //GETTERS
    public String getBrandName() {
        return brandName;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    //Returns both the brand name and the flavour.
    //I have the methods seperate for "Searching". I havnt figured it out completely yet so im just making this note
    //NOTE: We might have to use the return value for REGEX BE CAREFUL,
    public String getFullName() {
        return String.format("%s %s", getBrandName(), getFlavour());
    }

    //SETTERS
    //data field setter
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    //data field setter
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    
    //This method compares objects based on theyre brand name(Coca Cola, Pepsi..etc)
    @Override
    public boolean equals(Object o){
        return this.getBrandName().equals(((SoftDrink)o).getBrandName());
    }
    
    @Override
    public int compareTo(SoftDrink o) {
        if (this.getFullName().equals(o.getFullName())) {
            return 0;
        } else if (this.getFullName().compareTo(getFullName()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
