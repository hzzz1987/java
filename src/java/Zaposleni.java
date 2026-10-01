package java;

import java.Zaposleni;

public class Zaposleni {
	private String ime;
	private String prezime;
	private int godine_staza;
	private float plata;
	
	

	public Zaposleni(String ime, String prezime, int godine_staza, float plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}
	
	



	public String getIme() {
		return ime;
	}





	public void setIme(String ime) {
		this.ime = ime;
	}





	public String getPrezime() {
		return prezime;
	}





	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}





	public int getGodine_staza() {
		return godine_staza;
	}





	public void setGodine_staza(int godine_staza) {
		this.godine_staza = godine_staza;
	}





	public float getPlata() {
		return plata;
	}





	public void setPlata(float plata) {
		this.plata = plata;
	}
	public void stampa() {
		System.out.println("Ime: " + this.ime);
		System.out.println("Prezime: " + this.prezime);
		System.out.println("Godine staza: " + this.godine_staza);
		System.out.println("Plata: " + this.plata);
	}
	
	public void azuriranjePlate() {
		if(this.godine_staza > 10) {
			if(this.plata < 800) {
				this.plata = this.plata + this.plata * 0.06f;
			}
			}
		}
	
	




	public static void main(String[] args) {
		Zaposleni zaposleni1 = new Zaposleni("Ivan", "Ivanovic", 10, 1500);
		Zaposleni zaposleni2 = new Zaposleni("Petar", "Ivanovic", 12, 750);
		Zaposleni zaposleni3 = new Zaposleni("Milica", "Ivanovic", 5, 900);
		
		zaposleni1.stampa();
		System.out.println();
		zaposleni2.stampa();
		System.out.println();
		zaposleni3.stampa();
		System.out.println();
		
		zaposleni2.azuriranjePlate();
		zaposleni2.stampa();
	}

}
