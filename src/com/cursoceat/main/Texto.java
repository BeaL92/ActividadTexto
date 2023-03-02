package com.cursoceat.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


	public class Texto {
	private String cad;
	LocalDate creacion;
	LocalDateTime ultimaModificacion;
	private final int LONGITUD_MAX;
	static final String VOCALES="aeiouáéíóú";
	
	
	public Texto(int longitud) {//paso de valor
		LONGITUD_MAX = longitud;//asigno a la constante y se inicializa
		this.cad="";
		creacion=LocalDate.now();
		this.ultimaModificacion=null;
		//en este momento cuando se crea el objeto con el constructor
		//Se inicializan todos los atributos de la clase
		
	}
	public void addFinal (char c) {
		if(this.LONGITUD_MAX>this.cad.length()) {
			this.cad=this.cad+c;//la cadena + caracter que hemos recibido
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	public void addFinnal(String cadena) {
		if(this.LONGITUD_MAX>this.cad.length()+cadena.length()) {
			this.cad=this.cad+cadena;
			this.ultimaModificacion=LocalDateTime.now();
			
		}
	}

	public void addInicio(char c) {
		if(this.LONGITUD_MAX>this.cad.length()) {
			this.cad=c+this.cad;//caracter + cadena que hemos recibido
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
		
	
	public void addInicio(String cadena) {
		if(this.LONGITUD_MAX>this.cad.length()+cadena.length()) {
			this.cad=cadena+this.cad;
			this.ultimaModificacion=LocalDateTime.now();
			
		}
	}
	public void mostrar() {
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha de creación: "+this.creacion.format(formato));
		DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd/MM/yyyy 'Hora: 'hh:mm:ss");
		System.out.println("Fecha de la última modificación: "+this.ultimaModificacion.format(formato1));
		System.out.println("La cadena es:\n"+this.cad);
	}
}
