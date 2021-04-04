package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.tutorial.gerenciador.modelo.Banco;
import br.com.tutorial.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovaEmpresa  implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String nomeDaEmpresa = request.getParameter("nome");
			String dataDaEmpresa = request.getParameter("date");
			Date dataAbertura = null;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(dataDaEmpresa);
			} catch (ParseException e) {
				throw new ServletException(e);
			}

			Empresa empresa = new Empresa(nomeDaEmpresa);
			empresa.setDataAbertura(dataAbertura);
			Banco banco = new Banco();
			banco.adiciona(empresa);

			return "redirect:entrada?acao=ListaEmpresas";
//			response.sendRedirect("entrada?acao=ListaEmpresas");
			// chamar o JSP
//			RequestDispatcher rd = req.getRequestDispatcher("/lista-empresas-servlet");
//			req.setAttribute("empresa", empresa.getNome());
//			rd.forward(req, resp);

		}
}
