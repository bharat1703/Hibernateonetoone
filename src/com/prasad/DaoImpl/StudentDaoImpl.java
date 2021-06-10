package com.prasad.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.prasad.Utility.HibernateUtility;
import com.prasad.Dao.StudentDao;
import com.prasad.Entity.StudentEntity;
import com.prasad.Utility.HibernateUtility;

public class StudentDaoImpl implements StudentDao {

	public void savestudent(StudentEntity stuen) {
		Session session = HibernateUtility.getSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(stuen);
			tx.commit();

		} catch (HibernateException he) {
			he.printStackTrace();
			if (tx.getStatus() != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}

	public StudentEntity getStudentDetails(String firstName, String lastName) {
		Session session = HibernateUtility.getSession();
		StudentEntity studentresult = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(StudentEntity.class);
			criteria.add(Restrictions.eq("firstName", firstName));
			criteria.add(Restrictions.eq("lastName", lastName));
			List<StudentEntity> obj = criteria.list();
			for (StudentEntity studentEntity : obj) {
				if (studentEntity.getFirstName().equalsIgnoreCase(firstName)
						&& studentEntity.getLastName().equalsIgnoreCase(lastName)) {
					studentresult = studentEntity;
				}

			}
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			if (tx.getStatus() != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return studentresult;
	}

	public boolean updateStudent(StudentEntity stuenobj) {
		System.out.println("inside updateEmployee() of EmployeeDaoImpl");
		Session session = HibernateUtility.getSession();

		boolean recordUpdated = false;
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			session.saveOrUpdate(stuenobj);
			tx.commit();
			recordUpdated = true;
		} catch (HibernateException he) {
			if (tx.getStatus() != null) {
				tx.rollback();
				recordUpdated = false;
			}
		} finally {
			session.close();
		}

		return recordUpdated;
	}

	public boolean deleteEmployee(StudentEntity stuenobj) {
		System.out.println("inside deleteEmployee() of EmployeeDaoImpl");
		Session session = HibernateUtility.getSession();
		boolean recordUpdated = false;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(stuenobj);
			tx.commit();
			recordUpdated = true;
		} catch (HibernateException he) {
			if (tx.getStatus() != null) {
				tx.rollback();
				recordUpdated = false;
			}
		} finally {
			session.close();
		}

		return recordUpdated;
	}

}
