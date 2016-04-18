package comm.huizi.week7.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.huizi.week7.service.CustomerServiceImpl;
import comm.huizi.week7.service.ICustomerService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ICustomerService customerService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        customerService = new CustomerServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.处理编码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//2.获取参数
		String name =request.getParameter("name");
		String password = request.getParameter("password");
		//3.调用service层代码
		customerService.login(name, password);
		//4.页面跳转
		request.getRequestDispatcher("/loginSuccess.jsp").forward(request, response);
	}

}
