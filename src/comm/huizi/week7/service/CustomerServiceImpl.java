//Source file: E:\\uml\\rose code\\comm\\huizi\\week7\\service\\CustomerServiceImpl.java

package comm.huizi.week7.service;

import comm.huizi.week7.exception.ServiceException;
import comm.huizi.week7.dao.CustomerDao;
import comm.huizi.week7.bean.Customer;

public class CustomerServiceImpl implements ICustomerService 
{
   public CustomerDao theCustomerDao;
   
   /**
   @roseuid 5710D9480357
    */
   public CustomerServiceImpl() 
   {
    
   }
   
   /**
   @param name
   @param password
   @return comm.huizi.week7.bean.Customer
   @roseuid 5710D8E703B7
    */
   public Customer login(String name, String password) 
   {
    return null;
   }
   
   /**
   @param customer
   @roseuid 5710D92801B6
    */
   public void register(Customer customer) 
   {
    
   }
}
