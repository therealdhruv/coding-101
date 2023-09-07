package oops;

public class thisKeyword {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "Aman";
        ac.email = "dhruvkochi@gmail.com";
        ac.setPassword("hsdisksnsv");
        System.out.println("\n\n");
        System.out.println("The name of the account holder is : "+ac.name);
        System.out.println("The email of the account holder is : "+ac.email);
        System.out.println("The password of the account holder is : "+ac.getPassword());
        System.out.println("\n\n");
    }
}



class Account {
    public String name;
    protected String email;
    private String password;

    // In order to access private member in other classes we need to set
    // getters and setters

    // let's set a getter for password as its a private member
    public String getPassword () {
        return this.password;
    }

    // let's set a setter for password as its a private member
    public void setPassword (String thePassword) {
        this.password = thePassword;
    }


}

