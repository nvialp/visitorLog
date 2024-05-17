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
    
    //declare constructors
    public DataCenter(){
        this.visitors = new ArrayList<Visitor>();
    }
    
    //declare instance methods
    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }
    
    public int getVisitorIndex(Visitor referenceVisitor){
        int index=-1;
        for(Visitor v: visitors){
            if(v.equals(referenceVisitor)){
                index = visitors.indexOf(v);
                break;
            }
            else{
                System.out.print("visitor record not found!");
            }
        }
        return index;
    }
    
    public Visitor getVisitor(int index){
        return visitors.get(index);
    }
    
    public ArrayList<Visitor> getVisitors(){
        return visitors;
    }
    
    public String getVisitorRecords() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n");
        for (int i = 0; i < visitors.size(); i++) {
            stringBuilder.append(visitors.get(i).getLastName())
                    .append(", ")
                    .append(visitors.get(i).getFirstName())
                    .append("\nCompany: ")
                    .append(visitors.get(i).getCompany())
                    .append(",\nVendor: ")
                    .append(visitors.get(i).getVendorStatus())
                    .append(",\nSigned In: ")
                    .append(visitors.get(i).getTimeIn())
                    .append(",\nSigned out: ")
                    .append(visitors.get(i).getTimeOut())
                    .append("\n\n");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}