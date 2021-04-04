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

public class RemoveEmpresa  implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);
			
			Banco banco = new Banco();
			banco.removeEmpresa(id);
			
			return "redirect:entrada?acao=ListaEmpresas";
//			response.sendRedirect("entrada?acao=ListaEmpresas");
		}
}
