package Activity5thJuly;

public class Dog extends Animal
{

	public Dog() // item number 5 says no 
	{
		isMamal = true;
		isCarnivorous = true;
	}
	
	
	@Override
	public String getGreeting() 
	{
		return "'ruff'";
	}

}
