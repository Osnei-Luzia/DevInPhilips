package repositorios;

import models.Empresa;
import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public static List<Empresa> getEmpresas() {
        return empresas;
    }

    public static void setEmpresas(Empresa empresa) {
        EmpresaRepository.empresas.add(empresa);
    }
}
