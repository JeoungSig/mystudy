package com.book.customer;

import java.util.List;

import org.hibernate.Session;

import com.book.customer.dto.Customer;
import com.book.util.HibernateUtil;

public class CustomerManager {

	/**
	 * 간단한 하이버네이트 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Session magic = HibernateUtil.getSessionFactory().openSession();
		//
		// magic.beginTransaction();
		//
		// Customer customer = new Customer(27, "Steven Min");
		// magic.save(customer);
		//
		// magic.getTransaction().commit();

		List<Customer> list = magic.createQuery("from Customer").list();

		for (Customer cust : list) {
			System.out.println("ID:" + cust.getId() + ", Customer Name : " + cust.getName() + ", Age : " + cust.getAge());
		}

	}

}
