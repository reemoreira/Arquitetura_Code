package view;
import control.FlorFacroty;
import factory.FlorIF;
public class DemoFactoryMethod {
		public static void main(String[] args) {
			FlorFacroty fabricaFlor = new FlorFacroty();
			FlorIF minhaFlor = fabricaFlor.gerarFlor("ROSA");
			minhaFlor.criarFlor();
			minhaFlor = fabricaFlor.gerarFlor("MARGARIDA");
			minhaFlor.criarFlor();
			minhaFlor = fabricaFlor.gerarFlor("MARGARIDA");
			minhaFlor.criarFlor();
		}
}
