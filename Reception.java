class Reception{
static void book(String patientName,String symptom,String email,long mobile){
 System.out.println("Reception received Patient details:");
System.out.println("Email: " + email);
System.out.println("Mobile: " + mobile);
System.out.println("Reception Informing to the Hospital...");
 Hospital.bookAppointment(patientName, symptom);

}
}