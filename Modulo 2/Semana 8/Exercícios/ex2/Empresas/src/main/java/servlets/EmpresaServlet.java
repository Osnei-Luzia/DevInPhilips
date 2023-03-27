package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Empresa;
import repositorios.EmpresaRepository;

/**
 * Servlet implementation class EmpresaServlet
 */
@WebServlet("/EmpresaServlet")
public class EmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpresaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Empresa> empresas = EmpresaRepository.getEmpresas();
				
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		for(Empresa empresa : empresas) {
			out.println("<li>"+empresa.getNome()+"</li>");
			//System.out.println(empresa.getNome());
		}
		out.println("</ul>");
		out.println("</body></html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		
		Empresa novaEmpresa = new Empresa();
		novaEmpresa.setNome(nome);
		novaEmpresa.setCnpj(cnpj);
		
		EmpresaRepository.setEmpresas(novaEmpresa);
		
		doGet(request, response);
	}

}
