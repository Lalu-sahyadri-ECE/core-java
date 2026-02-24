class Swiggy {
    public static void main(String[] args) {

        System.out.println("Main Started");

        String email = "lalu@swiggy.com";
        String password = "Swiggy@321";
        long mobile = 9090909090L;

        String result1 = SwiggyLogin.loginUsingMobile(mobile, password);
        System.out.println("Mobile Login Result: " + result1);

        String result2 = SwiggyLogin.loginUsingEmail(email, password);
        System.out.println("Email Login Result: " + result2);

        System.out.println("Main Ended");
    }
}