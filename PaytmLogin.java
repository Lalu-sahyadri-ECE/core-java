class PaytmLogin {
public static String loginUsingMobile(long mobile, String password) {
System.out.println("loginUsingMobile is invoked");
if (mobile == 9876543210L) {
if (password=="Pay@123") {
System.out.println("Valid Credentials");
System.out.println("Mobile Number : " + mobile);
System.out.println("Password: " + password);
System.out.println("loginUsingMobile is ended");
	System.out.println("loginUsingMobile is ended");

return "Login Successful using Mobile";
} else {
System.out.println("Invalid Password");
	System.out.println("loginUsingMobile is ended");

return "Login Failed - Wrong Password";
}
} else {
	System.out.println("Invalid Mobile Number");
	System.out.println("loginUsingMobile is ended");
	
            return "Login Failed - Invalid Mobile";
	}
		
    }

public static String loginUsingEmail(String email, String password) {
System.out.println("loginUsingEmail is invoked");

if (email == "lalu@paytm.com") {
	if (password == "Pay@123") {
			System.out.println("Valid Credentials");
	System.out.println("Email: " + email);
System.out.println("Password: " + password);
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