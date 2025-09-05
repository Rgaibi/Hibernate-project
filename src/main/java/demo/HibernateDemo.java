package demo;

import org.hibernate.Session;

import dao.HibernateUtil;

public class HibernateDemo {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Mysql connected");
		


	}

}
