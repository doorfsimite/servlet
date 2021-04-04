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

public class NovaEmpresaForm  implements Acao{

	
		public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
			return "foward:formNovaEmpresa.jsp";
//			response.sendRedirect("entrada?acao=ListaEmpresas");
		}
}
