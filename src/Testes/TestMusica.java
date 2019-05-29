package Testes;

import java.util.Arrays;
import java.util.List;

import ilearn.Nota;
import ilearn.NotasMusicais;
import ilearn.Piano;

public class TestMusica {
	
	public static void main(String[] args) {
		
		
		List<Nota> lnotas = Arrays.asList(new NotasMusicais().pegaNota("dos"),
				new NotasMusicais().pegaNota("res"),
				new NotasMusicais().pegaNota("fas"));
		
		Piano piano = new Piano();
		
		piano.toca(lnotas);
	}

}
