package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Angajat;
import clase.Aplicant;
import readers.AngajatReader;
import readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader aplicantReader = new AngajatReader("angajati.txt");
		try {
			listaAngajati = aplicantReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
