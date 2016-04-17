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
    */
   public Customer login(String name, String password) throws ServiceException;
   
   /**
   @param customer
    */
   public void register(Customer customer);
}
