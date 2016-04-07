package cn.zb.ry.dao.proxy;

import java.util.List;

import cn.zb.ry.dao.IEmpDAO;
import cn.zb.ry.dao.impl.EmpDAOImpl;
import cn.zb.ry.dbc.DatabaseConnection;
import cn.zb.ry.vo.Emp;

public class EmpDAOProxy implements IEmpDAO {
	private DatabaseConnection dbc=null;
	private IEmpDAO dao=null;
	
	public EmpDAOProxy()throws Exception{
		this.dbc=new DatabaseConnection();
		this.dao=new EmpDAOImpl(this.dbc.getConnection());
	}
	
	public boolean doCreate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			if(this.dao.findById(emp.getEmpno())==null){
				flag=this.dao.doCreate(emp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public List<Emp> findAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		List<Emp> all=null;
		try {
			all=this.dao.findAll(keyWord);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.dbc.close();
		}
		return all;
	}

	public Emp findById(int empno) throws Exception {
		// TODO Auto-generated method stub
		Emp emp=null;
		try {
			emp=this.dao.findById(empno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.dbc.close();
		}
		
		return emp;
	}

}
