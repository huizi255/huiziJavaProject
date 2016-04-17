package comm.huizi.week7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import comm.huizi.week7.bean.Customer;
import comm.huizi.week7.util.ConnectionFactory;

public class CustomerDao {

	/**
    */
	public CustomerDao() {

	}

	/**
	 * @param customer
	 */
	public void save(Customer customer) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			try {
				// 1.2获取链接
				conn = ConnectionFactory.getConn();
				// 3.创建pstmt
				String sql = "insert into rj_customer(name,password,age) value(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, customer.getName());
				pstmt.setString(2, customer.getPassword());
				pstmt.setInt(3, customer.getAge());
				// 4.执行sql语句
				pstmt.execute();
				// 5.处理结果集
				// 6.释放资源
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param id
	 * @return comm.huizi.week7.bean.Customer
	 */
	public Customer findById(Long id) {
		return null;
	}

	/**
	 * @param name
	 * @return comm.huizi.week7.bean.Customer
	 */
	public Customer deleteByName(String name) {
		return null;
	}

	/**
	 * @param customer
	 */
	public void update(Customer customer) {

	}
}
