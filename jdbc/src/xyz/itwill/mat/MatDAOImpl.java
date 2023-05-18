package xyz.itwill.mat;

import java.util.List;


public class MatDAOImpl extends JdbcDAO implements MatDAO{
	private static MatDAOImpl _dao;
	
	public MatDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new MatDAOImpl();
	}
	
	public static MatDAOImpl getDAO() {
		return _dao;
	}

	
	
	
	@Override
	public int insertMatShop(MatDTO shop) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMatInfo(MatDTO info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMatShop(MatDTO shop) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMatInfo(MatDTO info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMatShop(MatDTO shop) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMatInfo(MatDTO info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MatDTO selectMat(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MatDTO> selectNameshopList(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
