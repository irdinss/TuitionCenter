public class Name {

    // Attributes
    private String fname;
    private String mname;
    private String lname;

    //Constructor
    // no return, name same as class
    public Name(String fname, String mname, String lname){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public void setFName(String fname){
        //this -> local parameter
        this.fname = fname;
    }

    public String getFName(){
        return fname;
    }


    public String setMName(String mname){
        this.mname = mname;
        return mname;
    }

    public String getMName(){
        return mname;
    }

    public String setLName(String lname){
        this.lname = lname;
        return lname;
    }

    public String getLName(){
        return lname;
    }
}