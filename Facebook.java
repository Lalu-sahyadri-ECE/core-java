class Facebook{
static String firstName ;
static String lastName ;
static String dateOfBirth;
static String gender ;
static String email;
static String passowrd;

static boolean createAccount(String fName,String sureName , String dob ,String maleOrFemale ,String gmail ,String pwd){
System.out.println("Account creation started ...");

boolean isAccountCreated = false;
boolean isfNameValid = false;
boolean isSurenameValid = false;
boolean isdobValid = false;
boolean ismaleOrFemaleVlaid = false;
boolean isgmailValid = false;
boolean ispwdValid =false;

if(fName != null && !fName.isEmpty()){
	System.out.println("The First name is valid...");
	firstName = fName;
	isfNameValid = true ;
// return isfNameValid;
	} else {
	System.out.println("The first name is null or empty ");
}
	if(sureName != null && !sureName.isEmpty()){
		System.out.println("The Last name is valid...");
		lastName = sureName;
		isSurenameValid = true ;
	// return isSurenameValid;
	
	}else {
		System.out.println("The Last name is null or empty ");
}
 
		if(dob != null && !dob.isEmpty()){
			System.out.println("The Date of birth is valid...");
			dateOfBirth = dob;
			isdobValid = true ;
		// return isdobValid;
	
	} else {
			System.out.println("The date of birth  is null or empty ");
}

			if(maleOrFemale != null && !maleOrFemale.isEmpty()){
				System.out.println("The Gender is valid...");
			gender = maleOrFemale;
			ismaleOrFemaleVlaid = true ;
		// return ismaleOrFemaleVlaid;
	
	} else {
			System.out.println("The gender  is null or empty ");
}
				if(gmail != null && !gmail.isEmpty()){
				System.out.println("The gamil is valid...");
			email = gmail;
			isgmailValid = true ;
		// return isgmailValid;
	
	} else {
			System.out.println("The email  is null or empty ");
}

			if(pwd != null && !pwd.isEmpty()){
				System.out.println("The Password is valid...");
			passowrd = pwd;
			ispwdValid = true ;
		// return ispwdValid;
	
	} else {
			System.out.println("The Password  is null or empty ");
}

if(isfNameValid == true && isSurenameValid == true && isdobValid == true && ismaleOrFemaleVlaid  == true && isgmailValid  == true && ispwdValid  == true ){
	isAccountCreated = true;
	return isAccountCreated ;
}else{
	System.out.println("Account is not created issue on the  field / details");
	return isAccountCreated ;
}

}


static void getDetails(){
	
	
	System.out.println("The account details are..");
	System.out.println("The first Name is "+ firstName);
	System.out.println("The Last Name is "+lastName );
	System.out.println("The date of birth is "+dateOfBirth);
	System.out.println("The gender is " +gender);
	System.out.println("The Email Id is " +email);
	System.out.println("The passowrd is " + passowrd);
	
}
}