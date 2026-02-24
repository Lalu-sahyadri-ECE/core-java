class ZomatoLogin {
static boolean loginStatus;
    public static boolean loginUsingEmail(String email, String password) {

        System.out.println("loginUsingEmail invoked");

        if (email == "lalu@zomato.com"){
if (password == "Zomato@123") {
loginStatus = true;
System.out.println("Login Successful using Email");
		 System.out.println("The user Email is "+ email +"  and password is "+password);

            return loginStatus;
        } else { 
            System.out.println("Invalid  Password");
            return loginStatus;
        }}else {
            System.out.println("Invalid  emial");
			return loginStatus;
		}
    }

    public static boolean loginUsingmobile(long mobile, String password) {

        System.out.println("loginUsingmobile invoked");

        if (mobile == 8888888888L ) {
		if (password =="Zomato@123"){
		loginStatus = true ;
            System.out.println("Login Successful using Mobile");
        System.out.println("The user phone number is "+ mobile +"  and password is "+password);
			
            return loginStatus;
        } else {
            System.out.println("Invalid  Password");
			return loginStatus;}}
			else{
            System.out.println("Invalid  mobile number");
			
            return loginStatus;
        }
    }
}