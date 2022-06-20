package com.inhatc.cs;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOListAll {
    
	@Inject
    private BoardDAO dao;

	
    @Test
    public void listAll() throws Exception{
		List<BoardVO> boardList = dao.listAll();
		for(BoardVO board :boardList) {
			String strData = "번호 : "+board.getBno() + "\n";
			strData += "제목 : "+board.getTitle() +"\n";
			strData += "내용 : "+board.getContent() +"\n";
			strData += "작성자 : "+board.getWriter() +"\n";
			strData += "등록날짜 : "+board.getRegdate() +"\n";
			strData += "죄회수 : "+board.getViewcnt() +"\n";
			System.out.println(strData);
		}
    }
    
}