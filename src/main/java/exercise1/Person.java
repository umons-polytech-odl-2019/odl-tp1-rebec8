package exercise1;

class Person {
		private String name;
	private int age;
	public Person(String nom, int monage){  // création du constructeur
		this.name=nom;  // this.name est le "name" définit ds le private
		this.age= monage;
	}
	public  String getName ()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public  int getAge ()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.name = age;
	}
}
