public class StudentBatch {
    // data section
    // what is a StudentBatch?
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    private Student students[] = new Student[10];
    private int currsz = 0;


    // operation
    public void add(Student s, int i) {
        students[i] = s;
    }

    public int getNumStudents() {
        return students.length;
    }

    // method overloading
    public void add(Student s) {
        students[currsz++] = s;
    }

    // find a particular student
    public boolean find(Name name) {
        // loop through the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].name == name)
                return true;
        }
        return false;
    }
}