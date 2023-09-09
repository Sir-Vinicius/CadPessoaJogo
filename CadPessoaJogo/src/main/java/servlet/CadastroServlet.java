package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidades.Pessoa;

@WebServlet(urlPatterns = "/cadastrarServlet")
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String idadeStr = request.getParameter("idade");
		int idade = Integer.parseInt(idadeStr);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		
		response.setContentType("text/html");
		PrintWriter Writer = response.getWriter();
		
		Writer.println("<html>");
		Writer.println("<head>");
		Writer.println("<title>CadastroServlet</title>");
		Writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
		Writer.println("</head>");
		Writer.println("<body>");
		Writer.println("<h1>Dados cadastrados com sucesso:</h1>");
		Writer.println("<ol>");
		Writer.println("<li>Nome: " + pessoa.getNome() + "</li>");
		Writer.println("<li>Idade: " + pessoa.getIdade() + "</li>");
		Writer.println("</ol>");
		Writer.println("<p><a href=\"index.html\">Voltar para a pÃ¡gina inicial</a></p>");
		Writer.println("</body>");
		Writer.println("</html>");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lógica para lidar com solicitações GET, se necessário
    }
}
