package Activity5thJuly;

public class Duck extends Animal
{

	public Duck() // item number 5 says no 
	{
		isMamal = false;
		isCarnivorous = false;
	}
	
	
	@Override
	public String getGreeting() 
	{
		return "'quack'";
	}

}