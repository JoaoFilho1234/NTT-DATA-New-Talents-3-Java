package classes.veiculos;

public class TesteImplem implements Teste {

	@Override
	public void teste() {
		System.out.println("Testado");
		
	}

	@Override
	public void teste2(String a) {
		System.out.println("Testado " +a);
		
	}
}
