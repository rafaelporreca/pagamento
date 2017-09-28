package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Sms;

public interface SmsRepository extends JpaRepository<Sms,Long>{

	List<Sms> findAll();
	
	
	
}
