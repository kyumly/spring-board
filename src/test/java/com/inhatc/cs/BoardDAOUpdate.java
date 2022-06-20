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
    	board.setContent("update�����մϴ�");
    	board.setTitle("update�׽�Ʈ1");
    	board.setWriter("update��°�");
//		try {
//			if(dao.update(board) >0) System.out.println("������ ������ �Ϸ��߽��ϴ�.");
//			else System.out.println("��ġ�ϴ� �Խù��� �����ϴ�.");
//		}catch (Exception e) {
//			System.out.println("DBMS������ �߻��߽��ϴ�"+e);
//		}
    }
}