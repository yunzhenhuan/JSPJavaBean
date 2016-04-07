package cn.zb.ry.dao.test;

import java.util.*;

import cn.zb.ry.factory.DAOFactory;
import cn.zb.ry.vo.Emp;

public class TestDAOSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        List<Emp> all=DAOFactory.getIEmpDAOInstance().findAll("уехЩ-1");
        Iterator<Emp> iter=all.iterator();
        while(iter.hasNext()){
        	Emp emp=iter.next();
        	System.out.println(emp.getEmpno()+","+emp.getEname());
        }
	}

}
