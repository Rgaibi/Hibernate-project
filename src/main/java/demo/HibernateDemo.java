package demo;

import org.hibernate.Session;

import dao.HibernateUtil;

public class HibernateDemo {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		System.out.println("Mysql connected");
		


	}

}
