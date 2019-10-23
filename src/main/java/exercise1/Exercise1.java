package exercise1;


public class Exercise1 {
	static Person createPerson(String name, int age) {    // on peut appeler direct

		// Ajoutez les champs name et age à la classe Person.
		// Créez un constructeur public permettant d'initialiser ces valeurs au moment de la construction.
		// Créez des getters publics pour lire ces valeurs une fois la classe construite.
		//System.out.println("vous vous apprêtez à construire une personne");
		Person p = new Person(name, age);
		return p;
	}

	public static void main(String[] args) {
		// Considérant que cette classe est démarrée en ligne de commande avec un premier paramètre donnant le nom
		// et un second donnant l'âge (nombre entier), créez un objet Person sur base de ceux-ci.
		// Ecrivez ensuite le nom et l'âge de cette personne sur la sortie standard.
		String nom = "toto";
		int age = 20;

		Person p=Exercise1.createPerson(args[0], Integer.parseInt(args[1]));
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
