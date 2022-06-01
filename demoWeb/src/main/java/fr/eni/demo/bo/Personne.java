package fr.eni.demo.bo;

public class Personne {
	private int age;
	private String prenom;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public Personne(int age, String prenom) {
		super();
		this.age = age;
		this.prenom = prenom;
	}
	
	@Override
	public String toString() {
		return "Personne [age=" + age + ", prenom=" + prenom + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	
	
}
