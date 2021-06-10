package com.prasad.Dao;

import com.prasad.Entity.StudentEntity;

public interface StudentDao {
	void savestudent(StudentEntity stuen);
	 boolean updateStudent(StudentEntity stuenobj);
	 boolean deleteEmployee(StudentEntity stuenobj);
}
