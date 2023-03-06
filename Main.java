import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    // application code
    public static void main(String[] args) {
        // Center no.1's Headmaster
        HeadMaster headMaster1 = new HeadMaster(new Name("Rosnah", "Fadhilah", "Mansor"),
                                "780903-03-1234",
                                new Address("34", "Jalan Titi Air", "32110", "Tronoh", "Perak"));

        // New tuition center (tuition center 1)
        Center center1 = new Center(new Address("Lot 23A", "Jalan Permaisuri", "34250", "Ipoh", "Perak"),
                        headMaster1);

        // Create and add teacher to the tuition center 1
        Teacher MrHassan = new Teacher(
                           new Name("Hassan", "Awang", "Embong"), "720103-06-3418",
                           new Address("14", "Jalan Merah", "34321", "Lumut", "Perak"),
                           "Bachelor of Science",
                           5,
                           new Date(23, 10, 2022),
                           1);
        center1.addTeacher(MrHassan);

        // Create and add teacher to the tuition center 1
        Teacher MrsMaimunah = new Teacher(
                new Name("Maimunah", "Zakiah", "Ali"), "780901-10-5621",
                new Address("12", "Jalan Merpati", "12322", "Manjung", "Perak"),
                "Bachelor of Mathematics",
                6,
                new Date(4, 6, 2021),
                2);
        center1.addTeacher(MrsMaimunah);

        // Create student batch of 2023
        StudentBatch sb2023 = new StudentBatch();

        // Create new student, add to center1 and sb2023
        Student Ahmad = new Student(
                        new Name("Ahmad", "Kwan", "Shah"),
                        "67918-07-2912",
                        new Address("1", "Jalan Platinum", "40000", "Shah Alam", "Selangor"),
                        2022,
                        "SMK Melawati",
                        new ArrayList<>(Arrays.asList(71, 89, 96)));
        center1.addStudent(Ahmad);
        sb2023.add(Ahmad);


        // Create new student, add to center1 and sb2023
        Student Haida = new Student(
                        new Name("Nur", "Haida", "Kamal"),
                        "03124-10-9876",
                        new Address("25", "Jalan Keluli", "12342", "Subang Jaya", "Selangor"),
                        2022,
                        "SMK Sejahtera",
                        new ArrayList<>(Arrays.asList(57, 82, 93)));
        center1.addStudent(Haida);
        sb2023.add(Haida);


        // Performance report for center 1
        System.out.println("*****************************************************************");
        System.out.println("\t\t\t\tREPORT FOR TUITION CENTER 1");
        System.out.println("Number of teachers\t\t\t\t: " + center1.getNumTeachers());
        System.out.println("Number of students\t\t\t\t: " + center1.getNumStudents());
        System.out.println("Average marks\t\t\t\t\t: " + String.format("%.02f", center1.calcAvg()));
        System.out.println("Minimum marks\t\t\t\t\t: " + String.format("%.02f", center1.calcMin()));
        System.out.println("Maximum marks\t\t\t\t\t: " + String.format("%.02f",center1.calcMax()));

        // Print Teachers name and background
        for(int i = 0; i < center1.getNumTeachers(); i++) {
            System.out.println("\nTeacher name\t\t\t\t\t: " + center1.getTeachersInfo().get(i));
            System.out.println("Teacher backgrounds\t\t\t\t: " + center1.getTeacherBackgrounds().get(i));
        }

        // Print Students name
        System.out.println("\nStudent name\t\t\t\t\t: " + center1.getStudentInfo());
    }
}
