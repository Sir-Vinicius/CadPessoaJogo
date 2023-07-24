package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/jogoServlet")
public class JogoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String numero1 = request.getParameter("numero1");
    String numero2 = request.getParameter("numero2");
    String numero3 = request.getParameter("numero3");
    String numero4 = request.getParameter("numero4");
    String numero5 = request.getParameter("numero5");
 
    int n1 = Integer.parseInt(numero1);
    int n2 = Integer.parseInt(numero2);
    int n3 = Integer.parseInt(numero3);
    int n4 = Integer.parseInt(numero4);
    int n5 = Integer.parseInt(numero5);

    int numMaior = n1;
    int numMenor = n1;

    if (n2 > numMaior) {
      numMaior = n2;
    } else if (n2 < numMenor) {
      numMenor = n2;
    }
    if (n3 > numMaior) {
      numMaior = n3;
    } else if (n3 < numMenor) {
      numMenor = n3;
    }
    if (n4 > numMaior) {
      numMaior = n4;
    } else if (n4 < numMenor) {
      numMenor = n4;
    }
    if (n5 > numMaior) {
      numMaior = n5;
    } else if (n5 < numMenor) {
      numMenor = n5;
    }
    
    response.setContentType("text/html");
    PrintWriter Writer = response.getWriter();

    Writer.println("<html>");
    Writer.println("<head>");
    Writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
    Writer.println("<title>JogoServlet Resultado</title>");
    Writer.println("<link rel='stylesheet' type='text/css' href='style.css'>");
    Writer.println("</head>");
    Writer.println("<body>");
    Writer.println("<h1>Resultado</h1>");
    Writer.println("<p>O maior número digitado foi: " + numMaior + "</p>");
    Writer.println("<p>O menor número digitado foi: " + numMenor + "</p>");
    Writer.println("<a href='index.html'>Voltar para a página inicial</a>");
    Writer.println("</body>");
    Writer.println("</html>");
  }
}