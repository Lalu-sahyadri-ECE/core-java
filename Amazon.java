class Amazon {
    public static void main(String[] args) {
     System.out.println("Main Started");
     String email = "lalu@amazon.com";
	 String password = "Amazon@123";
     System.out.println("Logged in using Mobile");

   AmazonLogin.loginUsingEmail(email, password);
   System.out.println("Logged in using Email");

    System.out.println("Main Ended");
    }
}