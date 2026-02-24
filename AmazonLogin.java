class AmazonLogin {

    public static void loginUsingMobile(long mobile, String password) {
        System.out.println("loginUsingMobile is invoked");

        if (mobile == 9876543210L) {
            if (password == "Amazon@123") {
                System.out.println("Login Successful");
                System.out.println("Mobile: " + mobile + " Password: " + password);
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Mobile Number");
        }

        System.out.println("loginUsingMobile is ended");
    }

    public static void loginUsingEmail(String email, String password) {
        System.out.println("loginUsingEmail is invoked");

        if (email == "lalu@amazon.com") {
            if (password == "Amazon@123") {
                System.out.println("Login Successful");
                System.out.println("Email: " + email + " Password: " + password);
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Email");
        }

        System.out.println("loginUsingEmail is ended");
    }
}