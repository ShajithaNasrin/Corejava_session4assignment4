class Assignment{
	Assignment()
	{
		System.out.println("I am default constructor");
	}
	public Assignment(String s)
	{
		this();
		//this keyword is used for construtor chaining to call constructor of same class					
		System.out.println("I am chain constructor "+s);
	}
		
}
class Assignment4 extends Assignment{
	Assignment4()
	{
		super();		
		/*Super() used to call parent class constructor, Here its calling default constructor 		of Assignment*/
		System.out.println("Above output is parent class constructor using super keyword");
	}
	public Assignment4(String s)
	{
		super("thankyou"); 
		//super() invoke parameterised constructor of parent class
		System.out.println("I am the constructor from "+s+ "class parameterised constructor(overloading)");
	}
		
	public static void main(String args[])
	{
		Assignment4 supkey=new Assignment4();
		Assignment4 supkey1=new Assignment4("child");
		
	}
}