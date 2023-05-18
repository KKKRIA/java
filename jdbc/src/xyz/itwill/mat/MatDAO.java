package xyz.itwill.mat;

import java.util.List;

public interface MatDAO {
	
	int insertMatShop(MatDTO shop); //삽입
	int insertMatInfo(MatDTO info);
	
	int updateMatShop(MatDTO shop); //변경
	int updateMatInfo(MatDTO info); //변경
	
	
	int deleteMatShop(MatDTO shop); //삭제
	int deleteMatInfo(MatDTO info); //삭제
	
	MatDTO selectMat(String name); 
	
	List<MatDTO> selectNameshopList(String name);

	
	
	
}
