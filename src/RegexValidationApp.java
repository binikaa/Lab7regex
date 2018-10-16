import java.util.InputMismatchException;
import java.util.Scanner;
//program for valid data regex 
public class RegexValidationApp {

	public static void main(String[] args) {
		


		Scanner scr= new Scanner(System.in);
		
		System.out.println("Please enter the Name");
		String name = scr.next();
		boolean b = isvalidNames(name);
		if(b!=true)
			System.out.println("Sorry,name is not valid!");
		
		System.out.println("Please enter the Email");
		String email= scr.next();
		boolean c=isvalidEmails(email);
		if(c!=true)
			System.out.println("Email is not valid");
		
		System.out.println("Please enter the Phone number");
		String number= scr.next();		
		boolean d=isvalidPhoneNo(number);
		if(d!=true)
			System.out.println("invalid number");
				
		System.out.println("Please enter the Date");
		String date = scr.next();
		boolean k=isvalidDate(date);
		if(k!=true)
			System.out.println("invalid date format");
		scr.close();
    
	
	//catch(InputMismatchException e)
	//{
      //System.out.println("");
	//}

}	
	
	
	public static boolean isvalidNames(String name)
	{
		if(name.matches("[A-Z]{1}[a-z]{1,29}")) 
			return true;
		else 
			return false;
	}

	public static boolean isvalidEmails(String email)
	{
		if(email.matches("[A-Za-z0-9]{5,30}+@[A-Za-z0-9]{5,10}+\\.[A-Za-z0-9]{2,}?"))
			return true;
		else
			return false;
	}

	
	public static boolean isvalidPhoneNo(String number)
	  {
		
		
		if(number.matches("[0-9]{3}+-[0-9]{3}+-[0-9]{4}"))
			return true;
		else
			return false;
	  }
	

	public static boolean isvalidDate(String date)
	{
		if(date.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$"))
			return true;
		else
			return false;
	}
	
}

