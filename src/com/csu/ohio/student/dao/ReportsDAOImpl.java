package com.csu.ohio.student.dao;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.csu.ohio.student.bean.SemesterBean;

@Repository
public class ReportsDAOImpl implements ReportsDAO {
	

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	
	@Override
	public List<SemesterBean> getSemesterWiseFeePaidReport(Date from, Date to, String semester) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/*
		 * String q =
		 * "select m.purchase_id, m.transaction_id, m.vendor_name, m.material_category_id, m.material_type_id,m.brandname, "
		 * +
		 * "m.unit_id, m.quantity, m.purchase_amount, m.purchase_date, m.status from Purchase as m where m.vendor_name = ?1"
		 * ;
		 */
		
		String q = "select studentId, studentName, semester, transactionId, feePaidAmount, "
				+ "status from semester where studentName = ?1";
	
		if (from != null) {
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			String fromDate=sdf1.format(from);
			q = q.concat(" and  s.paid_date >= '" + fromDate + "'");
		}
		if (to != null) {
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			String toDate=sdf2.format(to);
			q = q.concat(" and  s.paid_date <= '" + toDate + "'");
		}
		Query query = entityManager.createNativeQuery(q);
		query.setParameter(1, semester);
		List<Object[]> resultList = query.getResultList();
		List<SemesterBean> semesterWiseFeePaidBeanList = new ArrayList<>();
		for (Object[] row : resultList) {
			SemesterBean bean=new SemesterBean();
			bean.setStudentId(row[0] != null ? (Integer)row[0] : 0);
			bean.setStudentName((String)row[1]);
			bean.setSemester((String)row[2]);
			bean.setTransactionId((String)row[3]);
			bean.setFeePaidAmount((Double)row[4]);
			Date date = (Date) row[5];		
			//bean.setPurchaseDate(date.toString());
			bean.setPaidDate(date);
			bean.setStatus((String)row[6]);
			System.out.println(bean);
			semesterWiseFeePaidBeanList.add(bean);
		}
		
		return semesterWiseFeePaidBeanList;
	}


	
}
