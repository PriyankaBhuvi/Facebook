package com.vstl.assignment;


public class TestFaceBookSignUpPage extends UtilitiesFunctions{

	public static void main(String[] args) {
		
 FaceBookSignUpPage objFaceBookSignUpPage=new FaceBookSignUpPage("https://www.facebook.com/r.php");
 UtilitiesFunctions objUtilitiesFunctions= new UtilitiesFunctions();
 
   objFaceBookSignUpPage.setFisrtName(getFisrtName());
		
		
	objFaceBookSignUpPage.setLastName(getLastName());
	
	objFaceBookSignUpPage.setMobileNumber(getMobileNumber());
	
	objFaceBookSignUpPage.setCurrentDateAndTime(objUtilitiesFunctions.getCurrentDateAndTime());

	
	objFaceBookSignUpPage.setDateOfBirth(getDateOfBirth());
	
	objFaceBookSignUpPage.setRandomNumber(objUtilitiesFunctions.getRandomNumber(10));

 	objFaceBookSignUpPage.setPasswordFace(getPassword());

	objFaceBookSignUpPage.setRandomBirthDate(objUtilitiesFunctions.getRandomBirthDate());

	objFaceBookSignUpPage.setRandomString(objUtilitiesFunctions.getRandomString(8).toLowerCase());
	
	objFaceBookSignUpPage.setRandomNumberWithString(objUtilitiesFunctions.getRandomNumberWithString(10).toUpperCase());
	
	objFaceBookSignUpPage.setRandomNumberWithSpecialCharecter(objUtilitiesFunctions.getRandomNumberWithSpecialCharecter(5));

	
	objFaceBookSignUpPage.closingBrowser(); 
	}
}
 
