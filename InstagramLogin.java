class InstagramLogin{
 public static void loginUsingPhoneNumber(long phonenumber , String password){
  System.out.println("loginUsingPhoneNumber is invoked"); 
	
  if (phonenumber == 8217279387l){
	  if(password == "Lalu@123"){
        System.out.println("Logged in to Your Account");
        System.out.println("The user phone number is "+ phonenumber +"  and password is "+password);
      }else{
        System.out.println("Password is Invalid /worng");
  }}else{
        System.out.println("Phone Number  is invalid /worng");
	   }
  System.out.println("loginUsingPhoneNumber is ended"); 
	   
	 }
public static void loginUsingEmail(String email , String password){
  System.out.println("loginUsingEmail is invoked"); 
	
if(email == "lalu@gmail.com"){
	  if(password == "Lalu@123"){
         System.out.println("Logged in to Your Account");
		 System.out.println("The user Email is "+ email +"  and password is "+password);
      }else{
           System.out.println("Passowrd is worng/invalid");
}}else{
     System.out.println("email id  is Invalid /worng");
    }
  System.out.println("loginUsingEmail is ended"); 
	
  }
}