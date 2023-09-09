package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import strategy.Estrategia;
import strategy.EstrategiaMaior;
import strategy.EstrategiaMenor;

@WebServlet(urlPatterns = "/jogoServlet")
public class JogoServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	
    private Estrategia estrategia = new EstrategiaMaior(); // Estratégia padrão
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] numerosStr = request.getParameterValues("numero");
        int[] numeros = new int[numerosStr.length];

        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        int maior = estrategia.processar(numeros);

        estrategia = new EstrategiaMenor(); // Altera a estratégia para EstrategiaMenor
        int menor = estrategia.processar(numeros);

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<link rel='stylesheet' type='text/css' href='style.css'>");
        writer.println("<title>JogoServlet Resultado</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Resultado</h1>");
        writer.println("<p>O maior número digitado foi: " + maior + "</p>");
        writer.println("<p>O menor número digitado foi: " + menor + "</p>");
        writer.println("<a href='index.html'>Voltar para a página inicial</a>");
        writer.println("</body>");
        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Código para lidar com solicitações GET, se necessário
    }
}
