package exercise2;

class Person {
	private int age;
	private static int totalAge = 0;
	private static int populationSize = 0;

	public Person(int age) {
		this.age = age;
		totalAge += this.age;
		populationSize++;
	}

	static int computePopulationSize() {
		return Person.computePopulationSize();
	}

	static float computeAveragePopulationAge()  {
		return totalAge/populationSize;
	}
	static void resetPopulation()
	{
		totalAge = 0;
		populationSize = 0;
	}

}
