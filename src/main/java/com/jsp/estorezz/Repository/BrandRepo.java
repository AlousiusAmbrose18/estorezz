package com.jsp.estorezz.Repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.estorezz.Entity.BrandInfo;;

@Repository
public class BrandRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveBrandInfo(BrandInfo brandInfo) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(brandInfo);
		transaction.commit();

	}

	public ArrayList<BrandInfo> findAllBrand() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from BrandInfo");
		return (ArrayList<BrandInfo>) query.list();

	}

	public BrandInfo findByCeoName(String ceoName) {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from BrandInfo where ceoName=:cName");
		query.setParameter("cName", ceoName);
		return (BrandInfo) query.uniqueResult();
	}

	public BrandInfo findByBrandName(String brandName) {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from BrandInfo where brandName=:bName");
		query.setParameter("bName", brandName);
		return (BrandInfo) query.uniqueResult();
	}
	
	public BrandInfo updateBrandValueByName( String brandName, String brandValue) {

		BrandInfo brandInfo = findByBrandName(brandName);
		brandInfo.setBrandValue(brandValue);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(brandInfo);
		transaction.commit();
		
		return brandInfo;
		
	}
	
	public void deleteBrandByName(String brandName) {

		BrandInfo brandInfo = findByBrandName(brandName);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(brandInfo);
		transaction.commit();
		
	}
	
	
	
	

}
