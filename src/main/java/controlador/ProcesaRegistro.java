package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.camaraDatos;

import java.io.IOException;
import java.util.ArrayList;

import dao.insertarDAO;

/**
 * Servlet implementation class ProcesaRegistro
 */
public class ProcesaRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private insertarDAO insertardatos;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesaRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		insertardatos = new insertarDAO();
		ArrayList<camaraDatos> ingresar = null;
		
		try {
			String fecha = request.getParameter("fecha");
			String matricula = request.getParameter("matricula");
			String foto = request.getParameter("foto");
			
			camaraDatos datos = new camaraDatos(fecha, matricula, foto);
		
			insertardatos.insertar(datos);
			ingresar=insertardatos.buscar();
			
			request.setAttribute("ingresar", ingresar);
			request.getRequestDispatcher("desplegarDatos.jsp").forward(request,response);
			
		}catch(NumberFormatException nfe) {
			
		}
	}

}
