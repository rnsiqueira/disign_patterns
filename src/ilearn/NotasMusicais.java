package ilearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> clazzes;

	static {
		clazzes = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class,
				DoS.class, ReS.class, FaS.class);

	}

	public Nota pegaNota(String nota) {
		try {
			if (!notas.containsKey(nota)) {
				for (Class<? extends Nota> clazz : clazzes) {
					if (clazz.getSimpleName().toLowerCase().equals(nota)) {
						notas.put(nota, (Nota) clazz.newInstance());
						break;
					}
				}

			}
			return notas.get(nota);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
