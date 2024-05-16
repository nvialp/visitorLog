/**
 *
 * @author Nicholas Vialpando
 */

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class DataCenter {
    //declare private instance variables
    private ArrayList<Visitor> visitors;
    private ArrayList<Vendor> vendors;
    
    //declare constructors
    public DataCenter(){
        this.visitors = new ArrayList<Visitor>();
        this.vendors = new ArrayList<Vendor>();
    }
    
    //declare instance methods
    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }
    
    public void addVendor(Vendor vendor){
        vendors.add(vendor);
    }
    
    public ArrayList<Visitor> getVisitors(){
        return visitors;
    }
    
    public String getSignedIn() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (int i = 0; i < visitors.size(); i++) {
            stringBuilder.append(visitors.get(i).getLastName())
                    .append(", ")
                    .append(visitors.get(i).getFirstName())
                    .append("\nCompany: ")
                    .append(visitors.get(i).getCompany())
                    .append(",\nSigned In: ")
                    .append(visitors.get(i).getTimeIn())
                    .append("\n\n");
        }
        stringBuilder.append("\n");
        
        for (int i = 0; i < vendors.size(); i++) {
            stringBuilder.append(vendors.get(i).getLastName())
                    .append(", ")
                    .append(vendors.get(i).getFirstName())
                    .append("\nCompany: ")
                    .append(vendors.get(i).getCompany())
                    .append(",\nSigned In: ")
                    .append(vendors.get(i).getTimeIn())
                    .append("\n\n");

        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}