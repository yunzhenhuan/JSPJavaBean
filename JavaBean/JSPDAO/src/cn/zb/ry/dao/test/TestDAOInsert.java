package cn.zb.ry.dao.test;

import cn.zb.ry.factory.DAOFactory;
import cn.zb.ry.vo.Emp;

public class TestDAOInsert {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Emp emp=null;
       for(int x=10;x<12;x++){
    	   emp=new Emp();
    	   emp.setEmpno(1000+x);
    	   emp.setEname("张三-"+x);
    	   emp.setJob("程序员-"+x);
    	   emp.setHiredate(new java.util.Date());
    	   emp.setSal(500*x);
    	   DAOFactory.getIEmpDAOInstance().doCreate(emp);
       }
	}

}
