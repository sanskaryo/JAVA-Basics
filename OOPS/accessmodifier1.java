

class AccessModifier {

    public String name;
    protected String email;
    private String password;

    // getter
    public String getPassword() {
        return this.password;
    }

    // setter
    public void setPassword(String password) {
        this.password = password;
    }
}

public class accessmodifier1 {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.name = "Rahul";
        obj.email = "XXXXXXXXXXXXXXX";
        obj.setPassword("123456");
        System.out.println(obj.getPassword());
        System.out.println(obj.name);
        System.out.println(obj.email);
    }
}
