class Paytm {
    public static void main(String[] args) {
           System.out.println("Main Started");

String email = "lalu@paytm.com";
String password = "Pay@123";
long mobile = 9876543210L;
String mobileLogin = PaytmLogin.loginUsingMobile(mobile, password);
System.out.println("Mobile Login Result: " + mobileLogin);
String emailLogin = PaytmLogin.loginUsingEmail(email, password);
System.out.println("Email Login Result: " + emailLogin);
System.out.println("Main Ended");
    }
}