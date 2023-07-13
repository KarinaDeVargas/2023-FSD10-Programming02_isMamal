package Activity5thJuly;

abstract class Animal 
{
	
	protected boolean isMamal;
	protected boolean isCarnivorous;
	
	public Animal(boolean isMamal, boolean isCarnivorous) //by parameter constructor - pass in the arguments
	{
		this.isMamal = isMamal;
		this.isCarnivorous = isCarnivorous;		
	}
	
	public Animal() //
	{
		this.isCarnivorous = isCarnivorous;		
	}
	
	public boolean getIsMamal() 
	{
		return isMamal;		
	}
	
	public boolean getIsCarnivorous()
	{
		return isCarnivorous;
	}
	
	public abstract String getGreeting();
	
	public void printInfo()
	{
		String carnivorousText;
		if (isCarnivorous)
		{
			carnivorousText = "is carnivorous";
		}
		else
		{
			carnivorousText = "is not carnivorous";
		}
		
		String mamalText;
		if (isMamal)
		{
			mamalText = "is mamal";
		}
		else
		{
			mamalText = "is not mamal";
		}
	
		System.out.println("A " +  getClass().getSimpleName() + " says " + getGreeting() + ", " + carnivorousText + ", and " + mamalText + ".");
	}
}
