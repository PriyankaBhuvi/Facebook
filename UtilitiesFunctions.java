package com.vstl.assignment;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class UtilitiesFunctions {
	

	public static String getFisrtName() {
	String strFisrtName=" ";
		String strArray[]= {"Riya","Rohini","Ruhi","chaitali","Rima","Rishi","sonu"};
		strFisrtName=strArray[new Random().nextInt(strArray.length)];
	  return strFisrtName;
	  
	}
	public static String getLastName() {
		String strLastName=" ";
		String strArray[] = {"Ghate","Malhotra","Bhuvi","Bhamne","upadye"};
		strLastName=strArray[new Random().nextInt(strArray.length)];
		return strLastName;
	}
	
	
	public static String getMobileNumber() {
		Random rd=new Random();
		String strMobileNumber=" ";
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
	return	strMobileNumber=str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];
		
	}
	
	public static String getPassword() {
		 String strPassword=" xy123";
		return strPassword;
	}
		 
	public static String getDateOfBirth() {
	   
	   GregorianCalendar gc= new GregorianCalendar();
	    String strDateOfBirth=" ";
	    int year = randBetween(2000,2010);
	    gc.set(gc.YEAR,year);
	    int dayofyear = randBetween(1 ,gc.getActualMaximum(gc.DAY_OF_YEAR));
	    gc.set(gc.DAY_OF_YEAR , dayofyear);
	    System.out.println(gc.get(gc.YEAR) + "-"+ (gc.get(gc.MONTH) + 1) + "-" +gc.get(gc.DATE));
		return strDateOfBirth;
	    
   }
      public static int randBetween(int start , int end) {
    	  return start + (int)Math.round(Math.random() * (end -start));
      }

   public String getRandomNumber( int intLength) {
	   String allowChars="0123456789";
	   String randomString="";
	   
	   for (int intIndex=0; intIndex<intLength;intIndex++) {
		   int intNum =(int)Math.floor(Math.random()*allowChars.length());
		   randomString+=allowChars.substring(intNum, intNum+1);
		   
	   }
	     return randomString;
   }
   
   public String getRandomBirthDate() {
		try {
			String strRandomDate="";
			int intRandom=(int) (Math.random()*30);
			strRandomDate=String.valueOf(intRandom).trim();
			return strRandomDate;
		}catch (Exception exception) {
			System.out.println("Error Msg==>  "+exception.getMessage());
			return "";
		}
	 
  }
  
    public String getRandomNumberWithString( int intLength) {
	   String allowChars="77992347583909736839djvcnnvjhuCHHCJCKCHUDCDCSH";
	   String randomString="";
	   
	   for (int intIndex=0; intIndex<intLength;intIndex++) {
		   int intNum =(int)Math.floor(Math.random()*allowChars.length());
		   randomString+=allowChars.substring(intNum, intNum+1);
		   
	   }
	     return randomString;
   }
   
   public String getRandomString( int intLength) {
	   String allowChars="njiplopnubvmocofurytiwuiruCNDHUBBVPWPIEYRYRWKCB";
	   String randomString="";
	   
	   for (int intIndex=0; intIndex<intLength;intIndex++) {
		   int intNum =(int)Math.floor(Math.random()*allowChars.length());
		   randomString+=allowChars.substring(intNum, intNum+1);
		   
	   }
	     return randomString;
   }
   
   public String getRandomStringWithSpecialCharecter( int intLength) {
	   String allowChars="njiplopnruCNDHUBBVPW?*&^%#$$#@!!$^&**%";
	   String randomString="";
	   
	   for (int intIndex=0; intIndex<intLength;intIndex++) {
		   int intNum =(int)Math.floor(Math.random()*allowChars.length());
		   randomString+=allowChars.substring(intNum, intNum+1);
		   
	   }
	     return randomString;
   }
   
   public String getRandomNumberWithSpecialCharecter( int intLength) {
	   String allowChars="986435272920*%*&^%#$$#@!!$^&**%";
	   String randomString="";
	   
	   for (int intIndex=0; intIndex<intLength;intIndex++) {
		   int intNum =(int)Math.floor(Math.random()*allowChars.length());
		   randomString+=allowChars.substring(intNum, intNum+1);
		   
	   }
	     return randomString;
   }
   
   public String getCurrentDateAndTime() {
	    String sdf=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
	    return sdf;
   
   }
   
}
   
   
   
   
   
   
   
   
   
   

   











   /*
   public void getCurrentDate() {
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	    Date date = new Date();
	    System.out.println(date);
	    
   }
   
     public void getLocalDate() {
	  LocalDateTime localDate =LocalDateTime.now();
	  System.out.println(localDate);
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd ,yyyy");
    System.out.println(dtf.format(localDate));
     }
     
}
   
   
   
   
   
   
   
   
   
   
   
   
 
   
   /*
   
    //get current date /time
   public void getCurrentDate() {
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
   Date date=new Date();
   System.out.println(sdf.format(date));
   
   //convert String to date :
   try {
	   String strDate="4/09/1998";
	   SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
      Date birthday =sdfBirthday.parse(strDate);
      SimpleDateFormat sdfBirthday1 = new SimpleDateFormat("yyyy-mm-dd");
      System.out.println("Birthday : " +sdfBirthday1.format(birthday));
      } catch (Exception e) {
    	  System.out.println(e.getMessage());
}
   }
   
   }
   
   
   
   
   */
   
   
   
   
   
   
   
   
   
   
   
   
   
 
    
   
 
/*
    			System.out.println(date);
    			
    	Date date1 = new Date(System.currentTimeMillis());
    	System.out.println(date1);
    }

}

/*
String locaDate =" ";
LocalDate localdate=locaDate.now();
System.out.println(localdate);

 LocalDate ldt=LocalDate.now();
 System.out.println(ldt);

return "";*/
    
      
   



  /*
    public static void getRandomGender() {
    	String strGender=" ";
    	if(new Random().nextBoolean() {
    		System.out.println("If the gender is male :"+male);
    	}
    	else
    	{
    		System.out.println("If the gender is female : "+female);
    	{
    		//female
    	
    
    }
*/

   /*
     public static String getRandomPhoneNumberGenerator {
    	    Random rand =new Random();
    	  Syso("Genarating a random phone number .....");
    System.out.println("%d%d%d"-%03d-%4d\n", rand.nextInt(8), rand.nextInt(8),rand.nextInt(8), rand.nextInt(656), rand.Int(10000));
    	   		
    	    
       }
     }
	
*/