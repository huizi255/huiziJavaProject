package comm.huizi.week7.service;

import comm.huizi.week7.exception.ServiceException;
import comm.huizi.week7.dao.CustomerDao;
import comm.huizi.week7.bean.Customer;

  /**
   * 业务逻辑层
   * 事务管理（事务提交及回滚）
   * 多次调用dao层代码完成增删改查
   * 处理复杂业务逻辑
   * */
public class CustomerServiceImpl implements ICustomerService 	
{
   private CustomerDao customerDao;
   
   /**
    */
   public CustomerServiceImpl() 
   {
    //实例化CustomerDao对象
	   customerDao = new CustomerDao();
   }
   
   /**
   @param name
   @param password
   @return comm.huizi.week7.bean.Customer
    */
   public Customer login(String name, String password)throws ServiceException 
   {
	   Customer customer =null;
	   Customer dbCustomer =customerDao.findByName(name);
	   if(dbCustomer!=null){
		   if(dbCustomer.getPassword().equals(password)){
			   customer = dbCustomer;
		   }else{
			   throw new ServiceException("该密码不正确");
		   }
	   }else{
		   throw new ServiceException("该用户不存在");
	   }
       return customer;
   }
   
   /**
   @param customer
    */
   public void register(Customer customer) 
   {
       customerDao.save(customer);
   }
}
