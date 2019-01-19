package cours01;

public class Etudiants {
	public Etudiants(String name, String prenom, int number) {
		
		this.name = name;
		this.prenom = prenom;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Etudiants() {
		
	}

	private String name;
	private String prenom;
	private int number;
	
	public static void main(String[] args) {
		Etudiants etudiant1 = new Etudiants();
		etudiant1.number= 42;
		etudiant1.name = "Castiaux";
		etudiant1.prenom = "Julien";
		
		Etudiants etudiant2 = new Etudiants ();
		etudiant2.number = 3;
		etudiant2.name = "Dupont";
		etudiant2.prenom = "Jérémy";
		
	}


}
