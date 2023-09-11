package xyz.itwill.dto;

import java.sql.Date;

import lombok.Data;

/*
create table security_board(idx number primary key, writer varchar2(100)
    , subject varchar2(1000), content varchar2(4000), regdate date);
    
create sequence security_board_seq;  
*/

@Data
public class SecurityBoard {
	private int idx;         //게시글 번호
	private String writer;   //작성자
	private String subject;  //제목
	private String content;  //내용
	private Date regdate;    //작성일
}
