package com.inhatc.cs;
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
public class BoardDAOUpdate {
    
	@Inject
    private BoardDAO dao;

	
    
    @Test
    public void update() throws Exception{
    	BoardVO board = new BoardVO();
    	board.setBno(5);
    	board.setContent("update감사합니다");
    	board.setTitle("update테스트1");
    	board.setWriter("update김승겸");
//		try {
//			if(dao.update(board) >0) System.out.println("데이터 변경을 완료했습니다.");
//			else System.out.println("일치하는 게시물이 없습니다.");
//		}catch (Exception e) {
//			System.out.println("DBMS문제가 발생했습니다"+e);
//		}
    }
}