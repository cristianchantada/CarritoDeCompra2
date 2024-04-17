package com.cristian.carrito.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.cristian.carrito.models.Carrito;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/comprar")
public class comprarServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("productsPerPage", req.getParameter("productsPerPage"));
		req.setAttribute("theFirstProduct", req.getParameter("theFirstProduct"));
		req.setAttribute("theLastProduct", req.getParameter("theLastProduct"));

		System.out.println("codigo= " + req.getParameter("codigo"));
		System.out.println("ProductsPerPage =" + req.getParameter("ProductsPerPage"));
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		
		HttpSession session = req.getSession();
			
		Carrito carrito = (Carrito) session.getAttribute("carrito");
		try {
			carrito.meterProducto(codigo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.setAttribute("carrito", carrito);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}
}
