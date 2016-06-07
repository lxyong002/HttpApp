package org.lxy.vo;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.lxy.util.HibernateUtil;

public class UserTest {

	/*@Test
	public void testAdd() {
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		
		User u = new User();
		u.setUserName("admin");
		u.setPassWord("123");
		u.setNickName("超级管理员");
		u.setEmail("zs@163.com");
		
		session.save(u);
		Assert.assertTrue(u.getId()>0);
		
		session.getTransaction().commit();
	}*/
	
	@Test
	public void testLoad() {
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		
		User u = (User)session.get(User.class, 1);
		
		Assert.assertEquals(1,u.getId());
		
		session.getTransaction().commit();
	}

}
