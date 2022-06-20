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
public class BoardDAODelete {
    
	@Inject
    private BoardDAO dao;

	
    @Test
	public void delete() throws Exception{
		int bno = 6;
//		//if(dao.delete(bno) > 0) {
//			System.out.println("삭제를 완료했습니다.");
//		}else System.out.println("해당 게시물이 없습니다.");
	}
    
}