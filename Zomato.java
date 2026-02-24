class Zomato{
    public static void main(String[] args) {
	  System.out.println("Main Started");
String email = "lalu@zomato.com";
String password = "Zomato@123";
long mobile = 8552085520l;
	  
boolean emailLogin = ZomatoLogin.loginUsingEmail(email, password);
System.out.println("Email Login Status: " + emailLogin);
	  
boolean mobileLogin = ZomatoLogin.loginUsingmobile(mobile, password);
System.out.println("Mobile Login Status: " + mobileLogin);

        System.out.println("Main Ended");
    }
}