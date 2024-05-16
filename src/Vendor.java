
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Nicholas Vialpando
 */
public class Vendor {
    private String firstName;
    private String lastName;
    private Boolean vendor;
    private String company;
    private Date currentDate = new Date();
    private Timestamp timeIn = new Timestamp(currentDate.getTime());
    private Timestamp timeOut = new Timestamp(currentDate.getTime());
    
    
    //declare constructors
    public Vendor(String fName, String lName, String company, Timestamp time) {
        this.firstName = fName;
        this.lastName = lName;
        this.company = company;
        this.timeIn = time;
    }
    
    public Vendor(String fName, String lName, String company) {
        this.firstName = fName;
        this.lastName = lName;
        this.company = company;
        this.timeIn = getTimeIn();
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
    
    public String getCompany(){
        return company;
    }
    
    public Timestamp getTimeIn(){
        return timeIn;
    }
    
    public Timestamp getTimeOut(){
        return timeOut;
    }
    
    public String getVendorInfo(){
        String info = ""; 
        info = info + lastName + ", " + firstName + " - " + company;
        return info;
    }
}
