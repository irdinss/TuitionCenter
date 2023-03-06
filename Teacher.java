// created by team in Bangalore
public class Teacher {

    // Attributes
    public Name name;
    public String kp;
    public Address address;
    public String qualification;
    private int yearsExp;
    private Date dateJoined;
    private int yearsInCenter;


    // Constructor
    public Teacher(Name name, String kp, Address address, String qualification, int yearsExp, Date dateJoined, int yearsInCenter) {
        this.name = name;
        this.kp = kp;
        this.address = address;
        this.qualification = qualification;
        this.yearsExp = yearsExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }


    // Getter and Setter
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getYearsInCenter() {
        return yearsInCenter;
    }

    public void setYearsInCenter(int yearsInCenter) {
        this.yearsInCenter = yearsInCenter;
    }
}