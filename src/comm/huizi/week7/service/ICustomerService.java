//Source file: E:\\uml\\rose code\\comm\\huizi\\week7\\service\\ICustomerService.java

package comm.huizi.week7.service;

import comm.huizi.week7.bean.Customer;
import comm.huizi.week7.exception.ServiceException;

public interface ICustomerService 
{
   
   /**
   @param name
   @param password
   @return comm.huizi.week7.bean.Customer
   @throws comm.huizi.week7.exception.ServiceException
   @roseuid 5710D82300C1
    */
   public Customer login(String name, String password) throws ServiceException;
   
   /**
   @param customer
   @roseuid 5710D86000CC
    */
   public void register(Customer customer);
}
