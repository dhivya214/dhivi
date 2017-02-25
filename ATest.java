abstract class Person
{
	public abstract void learn();
}
class Staff extends Person
{
	public void learn()
	{
		System.out.println("Learning..");
	}	
}
class Student extends Person
{
	public void learn()
	{
		System.out.println("Playing..");
	}	
}
class ATest
{
	public static void main(String args[])
	{
		Person x;
		x = new Staff();
		x.learn();
		x = new Student();
		x.learn();
	}
}