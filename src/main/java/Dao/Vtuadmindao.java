package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Adminsinupdto;
import Dto.Studentmarkscarddto;

public class Vtuadmindao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Adminsinupdto dto) {
         entityTransaction.begin();
         entityManager.persist(dto);
         entityTransaction.commit();
	}
	
	public Adminsinupdto fetch(int logvtulid) {
		Adminsinupdto d1=entityManager.find(Adminsinupdto.class, logvtulid);
		return d1;
	}
	
	public void insertMarkscardDetails(Studentmarkscarddto dto1) {
        entityTransaction.begin();
        entityManager.persist(dto1);
        entityTransaction.commit();
	}
	
	public Studentmarkscarddto fetchmarksbyusn(String usn) {
		Studentmarkscarddto s1= entityManager.find(Studentmarkscarddto.class, usn);
		return s1;
	}
	
	public List<Studentmarkscarddto> fetchallmarkscard() {
		Query q = entityManager.createQuery("select a from Studentmarkscarddto a");
		List<Studentmarkscarddto> l1=q.getResultList();
		return l1;
	}
	
	public String deletemarksbyusn(String usn) {
		Studentmarkscarddto s1= entityManager.find(Studentmarkscarddto.class, usn);
		   entityTransaction.begin();
	        entityManager.remove(s1);
	        entityTransaction.commit();
	        
	        return "markscard removed";
	}
	
	public String deleteallmarkscard() {
		Query q = entityManager.createQuery("select a from Studentmarkscarddto a");
		List<Studentmarkscarddto> l1=q.getResultList();
		for(Studentmarkscarddto a:l1) {
			entityTransaction.begin();
	        entityManager.remove(a);
	        entityTransaction.commit();
		}
		return "all data removed";
	}

	public void updateMarkscard(Studentmarkscarddto dto1) {
		Studentmarkscarddto s1= entityManager.find(Studentmarkscarddto.class, dto1.getUsn());
		s1.setName(dto1.getName());
		s1.setFathername(dto1.getFathername());
		s1.setCollege(dto1.getCollege());
		s1.setCoursecode1(dto1.getCoursecode1());
		s1.setCoursecode2(dto1.getCoursecode2());
		s1.setCoursecode3(dto1.getCoursecode3());
		s1.setCoursename1(dto1.getCoursename1());
		s1.setCoursename2(dto1.getCoursename2());
		s1.setCoursename3(dto1.getCoursename3());
		s1.setGradepoints1(dto1.getGradepoints1());
		s1.setGradepoints2(dto1.getGradepoints2());
		s1.setGradepoints3(dto1.getGradepoints3());
		
		entityTransaction.begin();
        entityManager.merge(s1);
        entityTransaction.commit();	
	}


}
