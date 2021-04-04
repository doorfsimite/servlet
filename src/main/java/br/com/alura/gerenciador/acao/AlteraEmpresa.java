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

public class AlteraEmpresa implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			String nomeDaEmpresa = request.getParameter("nome");
			String dataDaEmpresa = request.getParameter("date");
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);

			Date dataAbertura = null;
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				dataAbertura = sdf.parse(dataDaEmpresa);
			} catch (ParseException e) {
				throw new ServletException(e);
			}

			Banco banco = new Banco();
			Empresa empresa = banco.buscaEmpresaPeloId(id);
			empresa.setNome(nomeDaEmpresa);
			empresa.setDataAbertura(dataAbertura);

			return "redirect:entrada?acao=ListaEmpresas";
//			response.sendRedirect("entrada?acao=ListaEmpresas");
		}
}
