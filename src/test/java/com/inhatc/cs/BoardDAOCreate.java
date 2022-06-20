package com.inhatc.cs;
import javax.inject.Inject;
import javax.swing.border.Border;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOCreate {
    
	@Inject
    private BoardDAO dao;

	
    
    @Test
    public void create() throws Exception{
    	BoardVO board = new BoardVO();
    	board.setContent("°¨»çÇÕ´Ï´Ù");
    	board.setTitle("Å×½ºÆ®1");
    	board.setWriter("±è½Â°â");
    	//System.out.println(dao.create(board));
    	
    }
}