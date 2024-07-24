public class Apnaclg { // Class name capitalized

    private String name; // Attributes are private for encapsulation
    private int age;

    public Apnaclg(String name, int age) { // Parameterized constructor for initialization
        this.name = name;
        this.age = age;
    }

    public Apnaclg() { // Default constructor for empty object creation
        this.name = "";
        this.age = 0;
    }

    public void printInfo() { // Method name follows camelCase convention
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Apnaclg s1 = new Apnaclg("Rahul", 24); // Create Apnaclg objects with values
        Apnaclg s2 = new Apnaclg("Rani", 22);

        s1.printInfo(); // Print information of both objects
        s2.printInfo();
    }
}
