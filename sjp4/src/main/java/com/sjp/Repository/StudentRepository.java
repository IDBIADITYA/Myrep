package com.sjp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjp.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
