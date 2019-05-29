package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import SOLID.Boleto;
import SOLID.Fatura;
import SOLID.ProcessadorDeBoleto;

public class PagamentosTest {

	@Test
	public void test() {

		Boleto b1 = new Boleto(400.0);
		Boleto b2 = new Boleto(300.0);
		Boleto b3 = new Boleto(300.0);

		Fatura f = new Fatura(1000.0);

		List<Boleto> listaBoletos = Arrays.asList(b1, b2, b3);

		double valorPago = 0;
		for (Boleto boleto : listaBoletos) {
			valorPago += boleto.getValor();
		}

		ProcessadorDeBoleto pb = new ProcessadorDeBoleto();
		pb.processa(listaBoletos, f);

		assertEquals(3, listaBoletos.size(), 00000.1);

		assertFalse(f.getPago());

		assertEquals(1000, valorPago, 00000.1);
		
		assertEquals(1000, f.getValor(), 0000.1);
		
		
		
	}

}
