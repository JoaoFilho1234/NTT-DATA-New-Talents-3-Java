import java.util.ArrayList;
import java.util.List;

import classes.veiculos.TesteImplem;
import classes.veiculos.TipoCarro;
import classes.veiculos.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		TesteImplem t = new TesteImplem();
		List<Veiculo> veiculos = new ArrayList<>();
		Veiculo v = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		v.setTipoCarro(TipoCarro.MOTO);
		v2.setTipoCarro(TipoCarro.CARRO);
		v3.setTipoCarro(TipoCarro.UTILITARIO);
		v.setPlaca("OIR-3439");
		v2.setPlaca("EDF-4369");
		v3.setPlaca("DFD-9434");
		
		veiculos.add(v);
		veiculos.add(v2);
		veiculos.add(v3);
		
		veiculos.forEach(vi->System.out.println(vi.getPlaca()+ " " +vi.getTipoCarro()));
				
		t.teste();
		t.teste2("JAVA");
		
	}

}
