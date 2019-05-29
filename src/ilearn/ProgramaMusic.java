package ilearn;

import java.util.Arrays;
import java.util.List;

public class ProgramaMusic {

	public static void main(String[] args) {

		NotasMusicais notasMusicais = new NotasMusicais();

		List<Nota> DoReMiFa = Arrays.asList(notasMusicais.pegaNota("do"), notasMusicais.pegaNota("re"),
				notasMusicais.pegaNota("mi"), notasMusicais.pegaNota("fa"), notasMusicais.pegaNota("fa"),
				notasMusicais.pegaNota("fa"),

				notasMusicais.pegaNota("do"), notasMusicais.pegaNota("re"), notasMusicais.pegaNota("do"),
				notasMusicais.pegaNota("re"), notasMusicais.pegaNota("re"), notasMusicais.pegaNota("re"),

				notasMusicais.pegaNota("do"), notasMusicais.pegaNota("sol"), notasMusicais.pegaNota("fa"),
				notasMusicais.pegaNota("mi"), notasMusicais.pegaNota("mi"), notasMusicais.pegaNota("mi"),

				notasMusicais.pegaNota("do"), notasMusicais.pegaNota("re"), notasMusicais.pegaNota("mi"),
				notasMusicais.pegaNota("fa"), notasMusicais.pegaNota("fa"), notasMusicais.pegaNota("fa")

		);
		
		Piano piano = new Piano();
		piano.toca(DoReMiFa);
	}

}
