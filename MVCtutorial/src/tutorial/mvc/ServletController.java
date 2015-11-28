package tutorial.mvc;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PersonBeanModel person = new PersonBeanModel();
	person.setName(request.getParameter("name"));
	person.setMail(request.getParameter("mail"));
    person.doSomething();
	request.setAttribute("person", person);
	getServletContext().getRequestDispatcher("/jspView.jsp").forward(request, response);
	
	}

}
