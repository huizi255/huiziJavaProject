package comm.huizi.week7.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.huizi.week7.bean.Customer;
import comm.huizi.week7.service.CustomerServiceImpl;
import comm.huizi.week7.service.ICustomerService;

/**
 * Servlet implementation class RegisterServlet
 */
//可以通过访问http://localhost:8888/CustomerWeek08/register 访问到RegisterServlrt
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ICustomerService customerService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		Customer customer = new Customer(name,age,password); 
		//3.调用service代码
		customerService.register(customer); 
		//4.页面跳转
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}

}
