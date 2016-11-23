package factory;

import produtos.Hatch;
import produtos.HatchClio;
import produtos.SUV;
import produtos.SUVDuster;
import produtos.Sedan;
import produtos.SedanSymbol;

public class Renault implements AbstractFactory{

	@Override
	public Sedan criarSedan() {
		Sedan sedan = new SedanSymbol();
		return sedan;
	}

	@Override
	public SUV criarSUV() {
		SUV suv = new SUVDuster();
		return suv;
	}

	@Override
	public Hatch criarHatch() {
		Hatch hatch = new HatchClio();
		return hatch;
	}

}
