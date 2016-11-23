package factory;

import produtos.Hatch;
import produtos.SUV;
import produtos.Sedan;

public interface AbstractFactory {
	public Sedan criarSedan();
	public SUV criarSUV();
	public Hatch criarHatch();
}
