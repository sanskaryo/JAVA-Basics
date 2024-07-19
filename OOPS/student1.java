// we got student from  student class in student.java file 

public class student1 {

    public static void change(Student s) {
        s.name = "gourav";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aditya";
        s1.rno    = 1;
        change(s1);
        System.out.println(s1.name);
    }
    }
    
