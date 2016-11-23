package factory;

import produtos.Hatch;
import produtos.HatchEtios;
import produtos.SUV;
import produtos.SUVSw4;
import produtos.Sedan;
import produtos.SedanEtios;

public class Toyota implements AbstractFactory{

	@Override
	public Sedan criarSedan() {
		Sedan sedan = new SedanEtios();
		return sedan;
	}

	@Override
	public SUV criarSUV() {
		SUV suv = new SUVSw4();
		return suv;
	}

	@Override
	public Hatch criarHatch() {
		Hatch hatch = new HatchEtios();
		return hatch;
	}

}
