class Mobile{

static void register(String patientName,String symptom,String email,long mobile){
    System.out.println("Patient Registering through mobile app...");
    System.out.println("Patient Registeration Ended...");
    Reception.book(patientName, symptom, email, mobile);
}}