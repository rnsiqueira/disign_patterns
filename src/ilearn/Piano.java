package ilearn;

import java.util.List;

import org.jfugue.player.Player;



public class Piano {

	public void toca(List<Nota> musica) {
		Player player = new Player();

		StringBuilder sb = new StringBuilder();

		for (Nota nota : musica) {
			sb.append(nota.simbolo() + " ");

		}
		
		System.out.println(sb.toString());
		player.play(sb.toString());
	}

}
