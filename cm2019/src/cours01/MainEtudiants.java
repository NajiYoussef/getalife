package cours01;

public class MainEtudiants {
	Etudiants etudiant1 = new Etudiants("Khona","felgrouna",3);
	Etudiants etudiant5 = new Etudiants ("Simo","mol honda",6);
	public static void main(String[] args) {
	Etudiants etudiant6 = new Etudiants();
	etudiant6.setName("Polo");
	System.out.println(etudiant6.getName());
	}
}
//get et set fonctionnent sous main + on utilise avec get ce quon a mis avec set seulement)