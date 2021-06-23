package org.example.factory;

import java.util.Properties;
import org.example.hibernate_crud_demo.model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MySessionFactory {

	private static MySessionFactory mySessionFactory;
	private SessionFactory sessionFactory;

	private Properties properties=null;
	private MySessionFactory() {
		properties=new Properties();
		properties.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.put("hibernate.connection.password", "pass1");
		properties.put("hibernate.connection.url", "jdbc:mysql://localhost: 3306/hr");
		properties.put("hibernate.connection.username","user1");
		properties.put("hibernate.default_schema", "hr");
		//properties.put("hibernate.current_session_context_class", "thread");

	}

	public static MySessionFactory createMySessionFactory() {
		if (mySessionFactory == null) {
			mySessionFactory = new MySessionFactory();
		}
		return mySessionFactory;
	}
	
	public SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().addProperties(properties).addAnnotatedClass(Employee.class).buildSessionFactory();
		return sessionFactory;
	}
	

 
	}
	
	


