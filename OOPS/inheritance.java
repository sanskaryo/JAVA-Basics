// reusability badhti h inheritamnce se 

// 4 types of inherticance -  * mutilple inheritance is not ther in java 
class Shape {
    String color;
}

class Triangle extends Shape {
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println( t1.color);
    }
}
