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

public class ListaEmpresas  implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			Banco banco = new Banco();
			List<Empresa> lista = banco.getEmpresas();
			PrintWriter out = response.getWriter();
			
			request.setAttribute("empresas", banco.getEmpresas());

			return "forward:listaEmpresas.jsp";
//			RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
//			rd.forward(request, response);
		}
}
