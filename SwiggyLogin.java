class SwiggyLogin {
public static String loginUsingMobile(long mobile, String password) {
System.out.println("loginUsingMobile is invoked");

    if (mobile == 9090909090L) {
        if (password.equals("Swiggy@321")) {
            System.out.println("Valid Credentials");
            System.out.println("Mobile: " + mobile);
            System.out.println("loginUsingMobile is ended");
                return "Login Successful using Mobile";
        } else {
          System.out.println("Invalid Password");
          System.out.println("loginUsingMobile is ended");
          return "Login Failed - Wrong Password";
   }}else {
     System.out.println("Invalid Mobile Number");
     System.out.println("loginUsingMobile is ended");
     return "Login Failed - Invalid Mobile";
        }
    }

 public static String loginUsingEmail(String email, String password) {
System.out.println("loginUsingEmail is invoked");

    if (email.equals("lalu@swiggy.com")) {

 if (password.equals("Swiggy@321")) {
System.out.println("Valid Credentials");
System.out.println("Email: " + email);
  System.out.println("loginUsingEmail is ended");
return "Login Successful using Email";
} else {
  System.out.println("Invalid Password");
 System.out.println("loginUsingEmail is ended");
return "Login Failed - Wrong Password";
 }
} else {
 System.out.println("Invalid Email");
 System.out.println("loginUsingEmail is ended");
  return "Login Failed - Invalid Email";
        }
    }
}