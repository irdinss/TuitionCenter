import java.util.List;

public class Student {

    // Attributes
    public Name name;
    public String kp;
    public Address address;
    private int year;
    private String schoolName;
    private List<Integer> marks;


    // Constructor
    public Student(Name name, String kp, Address address, int year, String schoolName, List<Integer> marks) {
        this.name = name;
        this.kp = kp;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.marks = marks;
    }

    public Student() {

    }


    // Getter and Setter
    void setName(Name thename) {
        name = thename;
    }

    void setMark(float mark, int i) throws Exception{
        if (i <0 || i > 4){
            throw new Exception("Error in index detected!");
        }

        if (mark < 0){
            throw new Exception("Error in mark detected!");
        }
        marks.set(i, (int) mark);
    }
    public Name getName() {
        return name;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }

    public List<Integer> getMarks() {
        /*try{    // try block... something in here can cause exception
            this.setMark(10, 0);
            this.setMark(65, 1);
            this.setMark(54, 2);
            this.setMark(80, 3);
            this.setMark(-10, 4);
        } catch (Exception ex) {    //catch block ... action to be taken in case of Exception
            System.out.println("Cannot continue :( ");
            ex.printStackTrace();   //method that prints the throwable + line number and class name where the exception occurred
        }*/
        this.displayMarks();

        return marks;
    }

    // methods or operations
    public double calcStudentAvg() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public double calcStudentMin() {
        if (marks == null || marks.isEmpty()) {
            return 0;
        }
        int minMark = marks.get(0);
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) < minMark) {
                minMark = marks.get(i);
            }
        }
        return minMark;
    }

    public double calcStudentMax() {
        if (marks == null || marks.isEmpty()) {
            return 0;
        }
        int maxMark = marks.get(0);
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > maxMark) {
                maxMark = marks.get(i);
            }
        }
        return maxMark;
    }


    void displayMarks(){
        //print the marks
        System.out.println("\nSTUDENT MARK: ");
        for(int i=0; i < marks.size(); i++){
            System.out.println("Mark #" + (i+1) + ": " + marks.get(i));
        }
    }

    public static void main(String[] args) {

    }
}