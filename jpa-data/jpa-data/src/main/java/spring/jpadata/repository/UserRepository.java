package spring.jpadata.repository;

import org.springframework.data.repository.CrudRepository;

import spring.jpadata.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
	
}