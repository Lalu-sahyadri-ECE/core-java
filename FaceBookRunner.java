class FaceBookRunner{
public static void main(String []args){
String firstName = "Lalu";
String sureName = "Prasad";
String dob = "25/11/2004";
String gender = "male";
String gmail = "lalu@gmail.com";
String password= "lalu@123";

boolean isAccountCreated = Facebook.createAccount(firstName,sureName,dob,gender,gmail,password);
if(isAccountCreated){
Facebook.getDetails();
}else{
System.out.println("The Account is not created due to validation issue ");
}

isAccountCreated = Facebook.createAccount(firstName,sureName,dob,gender,gmail,null);
if(isAccountCreated){
Facebook.getDetails();
}else{
System.out.println("The Account is not created due to validation issue ");}

}}