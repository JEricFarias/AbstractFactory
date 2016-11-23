package test;

import factory.*;
import produtos.*;

public class Teste {
	public static void main(String [] args){
		//Toyota
		System.out.println("Toyota: ");
		AbstractFactory toyota = new Toyota();
		
		System.out.print("Sedan: ");
		Sedan tSedan = toyota.criarSedan();
		tSedan.escreverMarca();
		
		System.out.print("\nHatch: ");
		Hatch hatch = new HatchEtios();
		hatch.escreverMarca();
		
		System.out.print("\nSUV: ");
		SUV suv = new SUVSw4();
		suv.escreverMarca();
		
	}
}
