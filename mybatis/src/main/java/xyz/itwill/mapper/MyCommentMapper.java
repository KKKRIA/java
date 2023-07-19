package xyz.itwill.mapper;

import java.util.List;

import xyz.itwill.dto.MyComment1;
import xyz.itwill.dto.MyComment2;
import xyz.itwill.dto.MyComment3;

public interface MyCommentMapper {
	int insertComment1(MyComment1 comment);
	int insertComment2(MyComment1 comment);
	List<MyComment1> selectCommentList1();
	List<MyComment2> selectCommentList2();
	List<MyComment3> selectCommentList3();
}