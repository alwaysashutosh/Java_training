import java.util.*;
class InvalidException extends Exception
{
public String toString()
    {
	return("Invalid Password...");
    }
}

class exception_handling
{
public static void main(String args[])
    {
	try (Scanner s = new Scanner(System.in)) {
		System.out.print("Enter username ,password = ");
		String user = s.next();
		String pass = s.next();

		if(user.equals("Hello") && pass.equals("a123"))
			System.out.println("Login Successful...");
		else
			throw new InvalidException();
	} catch(InvalidException e) {
		System.out.println("Error : " + e);
	}
    }
}