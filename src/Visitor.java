/**
 *
 * @author Nicholas Vialpando
 */

//import java.sql.Timestamp; 
//import java.util.Date;
//import java.util.Formatter;
import java.util.*;
public class Visitor {
    //declare private instance variables
    private String firstName;
    private String lastName;
    private Boolean vendorCheck = false;
    private String vendor="No";
    private String company;
    private Calendar c = Calendar.getInstance();
    private Date timeIn;
    private Date timeOut;
    /*private Timestamp timeIn = new Timestamp(currentDate.getTime());
    private String tIn = String.format("%1$TD %1$TT", timeIn);
    private Timestamp timeOut; //= new Timestamp(currentDate.getTime());
    private String tOut;// = String.format("%1$TD %1$TT", timeIn);*/
    
    
    //declare constructors    
    public Visitor(String fName, String lName, String company) {
        this.firstName = fName;
        this.lastName = lName;
        this.company = company;
        this.timeIn = c.getTime();
    }
    
    public Visitor(String fName, String lName, String company, Boolean vendorCheck) {
        this.firstName = fName;
        this.lastName = lName;
        this.vendorCheck = vendorCheck;
        if(vendorCheck){
            vendor = "Yes";
        }
        this.company = company;
        this.timeIn = c.getTime();
    }
    
    //declare instance methods
    public void setFirstName(String fName){
        firstName = fName;
    }
    
    public void setLastName(String lName){
        lastName = lName;
    }
    
    public void setCompany(String company){
        this.company = company;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public Boolean getVendorStatus(){
        return vendorCheck;
    }
    
    public void setVendorStatus(){
        this.vendorCheck = true;
    }
    
    public String getCompany(){
        return company;
    }
    
    public Date getTimeIn(){
        return timeIn;
    }
    
    public Date getTimeOut(){
        return timeOut;
    }
    
    public void setTimeOut(){
        Calendar cOut = Calendar.getInstance();
        this.timeOut = cOut.getTime();
    }
    
    public String getVisitorInfo(){
        String info = "";
        
        info += lastName + ", " + firstName + " - " + company + " (Vendor: " + vendor + ")" + " Signed In: " + timeIn + ", Signed Out: " + timeOut;
        return info;
    }
    
    public String getVisitorData(){
        String info = "";
        
        info += lastName + "," + firstName + "," + company + "," + vendor + "," + timeIn + "," + timeOut;
        return info;
    }
}
