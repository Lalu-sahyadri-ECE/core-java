class Instagram{
 public static void main(String []args){
  System.out.println("Main Started");
 
  String emial = "lalu@gmail.com";
  long phoneNumber = 8217279387l;
  String password = "Lalu@123";
  InstagramLogin.loginUsingPhoneNumber(phoneNumber,password);
  System.out.println("Logged in to your account using Phone Number and Passowrd");
  InstagramLogin.loginUsingEmail(emial,password);
  System.out.println("Logged in to your account using Email and Passowrd");
  
  System.out.println("Main Ended"); 
 }
}