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
			String strData = "��ȣ : "+board.getBno() + "\n";
			strData += "���� : "+board.getTitle() +"\n";
			strData += "���� : "+board.getContent() +"\n";
			strData += "�ۼ��� : "+board.getWriter() +"\n";
			strData += "��ϳ�¥ : "+board.getRegdate() +"\n";
			strData += "��ȸ�� : "+board.getViewcnt() +"\n";
			System.out.println(strData);
		}
    }
    
}