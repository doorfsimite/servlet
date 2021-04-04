package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.tutorial.gerenciador.modelo.Banco;
import br.com.tutorial.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostraEmpresa  implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);
			
			Banco banco = new Banco();
			Empresa empresa = banco.buscaEmpresaPeloId(id);
			
			request.setAttribute("empresa", empresa);
			
			return "forward:formAlteraEmpresa.jsp";
//			RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
//			rd.forward(request,response);
		}
}
