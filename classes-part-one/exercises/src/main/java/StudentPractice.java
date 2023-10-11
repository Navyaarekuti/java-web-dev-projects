public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        //Student stu = new Student("Navya",12,1,4.0);
        //System.out.println(stu.toString());
        //System.out.println(new);
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("John");
        teacher1.setLastName("Smith");
        teacher1.setSubject("Math");
        teacher1.setYearsTeaching(10);
        System.out.println("Teacher 1 Information:");
        System.out.println("First Name: " + teacher1.getFirstName());
        System.out.println("Last Name: " + teacher1.getLastName());
        System.out.println("Subject: " + teacher1.getSubject());
        System.out.println("Years Teaching: " + teacher1.getYearsTeaching());

        Student student1 = new Student("Alice", 1, 4,4);
        Student student2 = new Student("Bob", 2, 3,1);

        Course math101 = new Course("Math 101", 101);
        Course history101 = new Course("History 101", 201);
        math101.addStudentToCourse(student1);
        math101.addStudentToCourse(student2);
        history101.addStudentToCourse(student1);
        System.out.println(math101.toString());
        System.out.println("Enrolled Students in Math 101:");
        for (Student student : math101.getEnrolledStudents()) {
            System.out.println(student.toString());
        }

        System.out.println(history101.toString());
        System.out.println("Enrolled Students in History 101:");
        for (Student student : history101.getEnrolledStudents()) {
            System.out.println(student.toString());
        }


    }
}
