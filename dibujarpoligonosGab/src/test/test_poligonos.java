package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Figuras.Poligono;
import dibujo.Dibujo;

class test_poligonos {

	@Test
	void testPerimetrohexagono() {
		 Poligono perimetro = new Poligono("hexagono");
		 Dibujo hexagono = new Dibujo();
		 perimetro.getDibujo();
		 perimetro.setDibujo(hexagono);
		 perimetro.getLongitudLado();
		 perimetro.setLongitudLado(10);
		 perimetro.getLados();
		 perimetro.setLados(6);
		 double resultado = perimetro.calcularPerimetro();
		 assertEquals(resultado, 60);	 
	
	}
	
	@Test
	void testPerimetrocuadrado() {
		 Poligono perimetro = new Poligono("cuadrado");
		 perimetro.setLongitudLado(5); 
		 perimetro.setLados(4);
		 double resultado =perimetro.calcularPerimetro();
		 assertEquals(resultado, 40);	 
	
	}
	
	@Test
	void testPerimetro100() {
		Poligono perimetro = new Poligono("todo");

		 
		
		 double resultado =perimetro.calcularPerimetro();
		 assertEquals(resultado, 40);	 
	
	}
	
	

}
