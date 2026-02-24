class Patient{
static void sick(){
 System.out.println("sick method started");
 System.out.println("Patient is feeling sick...!");
 String patientName = "Lalu Prasad .B";
 String symptoms = "Headache & Fewer";
 String email = "lalu@gmail.com";
 long phoneNumber = 8527419630l;
 Mobile.register(patientName,symptoms,email,phoneNumber);
 System.out.println("sick method is Ended");
}}