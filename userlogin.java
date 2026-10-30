package Hotelmenuproject;

public class userlogin {





    private String name;
    private String contact;
    private String email;
    private int password;
    private String city;

    // Parameterized Constructor
    public userlogin(String name, String contact,
                     String email, int password, String city) {

        this.name = name;
        this.contact = contact;
        this.email = email;
        this.password = password;
        this.city = city;
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }
}



