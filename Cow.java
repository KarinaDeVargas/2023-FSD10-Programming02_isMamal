package Activity5thJuly;

public class Cow extends Animal
{

	public Cow() // item number 5 says no 
	{
		isMamal = true;
		isCarnivorous = false;
	}
	
	
	@Override
	public String getGreeting() 
	{
		return "'moo'";
	}

}
