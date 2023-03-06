import java.util.ArrayList;
import java.util.List;

public class Center {

    // Attributes
    private Address address;
    private HeadMaster headMaster;
    private final List<Teacher> teachers;
    private final List<Student> students;


    // Constructor
    public Center(Address address, HeadMaster headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }


    // Getters and Setters
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HeadMaster getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(HeadMaster headMaster) {
        this.headMaster = headMaster;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getNumTeachers() {
        return teachers.size();
    }

    public int getNumStudents() {
        return students.size();
    }


    // Operations

    // Calculate the average mark of all students in the tuition center
    public double calcAvg() {
        double sum = 0;
        for (Student student : students) {
            sum += student.calcStudentAvg();
        }
        return sum / students.size();
    }


    // Find the minimum mark of all students in the tuition center
    public double calcMin() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            double avgMark = student.calcStudentMin();
            if (avgMark < min) {
                min = avgMark;
            }
        }
        return min;
    }


    // Find the maximum mark of all students in the tuition center
    public double calcMax() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            double avgMark = student.calcStudentMax();
            if (avgMark > max) {
                max = avgMark;
            }
        }
        return max;
    }


    // Teachers background to be printed in the report
    // Teachers background = teacher's qualification  +  teacher's year of experience
    public List<String> getTeacherBackgrounds() {
        List<String> backgrounds = new ArrayList<>();
        for (Teacher teacher : teachers) {
            backgrounds.add(teacher.getQualification() + " with " + teacher.getYearsExp() + " years of experience");
        }
        return backgrounds;
    }

    // Teachers name to be printed in the report
    // Teachers name = first name + middle name + last name
    public List<String> getTeachersInfo() {
        List<String> teacherInfo = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherInfo.add(teacher.name.getFName() + " " + teacher.name.getMName()  + " " + teacher.name.getLName());
        }
        return teacherInfo;
    }


    // Students name to be printed in the report
    // Students name = first name + middle name + last name
    public List<String> getStudentInfo() {
        List<String> studentInfo = new ArrayList<>();
        for (Student student : students) {
            studentInfo.add(student.name.getFName() + " " + student.name.getMName() + " " + student.name.getLName());
        }
        return studentInfo;
    }
}
