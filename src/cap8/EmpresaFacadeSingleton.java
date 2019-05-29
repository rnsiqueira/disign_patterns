package cap8;

public class EmpresaFacadeSingleton {

	private static EmpresaFacade instancia;

	protected EmpresaFacade getInstancia() {
		if (instancia == null) {
			instancia = new EmpresaFacade();
			
		}
		return instancia;
	}

}
