package aufgabe6_OOP;

public class Wilder {

    //Attributes
    private String firstname;
    private boolean present;

    //constructor
    public Wilder(String firstname, boolean present) {
        this.firstname = firstname;
        this.present = present;
    }

    //getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    //methods
    public String whoAmI() {
        if (this.present) {
            return "My name is " + this.firstname + " and I am present";
        }
        else {
            return "My name is " + this.firstname + " and I am NOT present";
        }
    }
}
