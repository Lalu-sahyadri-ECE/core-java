class Nurse{
public static void basicCheck(String patientName,String symptom,int bp,boolean sugar){
        System.out.println("Basic checkup is started");
	
 System.out.println("Nurse is checking patient: " + patientName);
 if(bp > 120 && bp <80){
        System.out.println("Blood Preasure of the Patient is high "+bp);
 }else {
        System.out.println("Blood Preasure of the Patient is Normal "+bp);
 }
 if(sugar == true){
        System.out.println(patientName +" has high sugar level in the blood");
 }else{
        System.out.println(patientName +" has no sugar level in the blood");
 }
        System.out.println("Basic checkup is Ended");
 
        Doctor.treat(patientName,symptom); 
}}	