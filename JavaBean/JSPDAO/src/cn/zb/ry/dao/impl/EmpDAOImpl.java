package cn.zb.ry.dao.impl;

import java.sql.*;
import java.util.*;

import cn.zb.ry.dao.IEmpDAO;
import cn.zb.ry.vo.Emp;

public class EmpDAOImpl implements IEmpDAO {
    private Connection conn=null;
    private PreparedStatement pstmt=null;
    
    public EmpDAOImpl(Connection conn){
    	this.conn=conn;
    }
    
	public boolean doCreate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		boolean flag=false;
		String sql="insert into emp1 values(?,?,?,?,?);";
		this.pstmt=this.conn.prepareStatement(sql);
		pstmt.setInt(1, emp.getEmpno());
		pstmt.setString(2, emp.getEname());
		pstmt.setString(3,emp.getJob());
		pstmt.setDate(4,new java.sql.Date(emp.getHiredate().getTime()));
		pstmt.setFloat(5, emp.getSal());
		if(pstmt.executeUpdate()>0){
			flag=true;
		}
		this.pstmt.close();
		return flag;
	}

	public List<Emp> findAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		List<Emp> all=new ArrayList<Emp>();
		Emp emp=null;
		String sql="select * from emp1 where ename like ? or job like ?";
		this.pstmt=this.conn.prepareStatement(sql);
		pstmt.setString(1,"%"+keyWord+"%");
		pstmt.setString(2,"%"+keyWord+"%");
		ResultSet rs=this.pstmt.executeQuery();
		while(rs.next()){
			emp=new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
			all.add(emp);
		}
		this.pstmt.close();
		return all;
	}

	public Emp findById(int empno) throws Exception {
		// TODO Auto-generated method stub
		Emp emp=null;
		String sql="select * from emp1 where empno=?";
		this.pstmt=this.conn.prepareStatement(sql);
		pstmt.setInt(1,empno);
		ResultSet rs=this.pstmt.executeQuery();
		while(rs.next()){
			emp=new Emp();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setHiredate(rs.getDate(4));
			emp.setSal(rs.getFloat(5));
		}
		this.pstmt.close();
		return emp;
	}

}
