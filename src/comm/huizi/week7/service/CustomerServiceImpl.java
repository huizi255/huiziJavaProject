package comm.huizi.week7.service;

import comm.huizi.week7.exception.ServiceException;
import comm.huizi.week7.dao.CustomerDao;
import comm.huizi.week7.bean.Customer;

public class CustomerServiceImpl implements ICustomerService 
{
   public CustomerDao theCustomerDao;
   
   /**
    */
   public CustomerServiceImpl() 
   {
    
   }
   
   /**
   @param name
   @param password
   @return comm.huizi.week7.bean.Customer
    */
   public Customer login(String name, String password)throws ServiceException 
   {
    return null;
   }
   
   /**
   @param customer
    */
   public void register(Customer customer) 
   {
    
   }
}
