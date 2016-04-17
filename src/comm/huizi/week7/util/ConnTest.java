package comm.huizi.week7.util;
import comm.huizi.week7.bean.Customer;
import comm.huizi.week7.dao.CustomerDao;

public class ConnTest {
   public static void main(String args[]){
	   CustomerDao dao = new CustomerDao();
	   dao.save(new Customer("小辉子 ",22,"2594"));
	   System.out.println("success!");
   }
}
