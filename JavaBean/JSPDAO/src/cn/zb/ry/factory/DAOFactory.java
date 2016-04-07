package cn.zb.ry.factory;

import cn.zb.ry.dao.IEmpDAO;
import cn.zb.ry.dao.proxy.EmpDAOProxy;

public class DAOFactory {
    public static IEmpDAO getIEmpDAOInstance()throws Exception{
    	return new EmpDAOProxy();
    }
}
