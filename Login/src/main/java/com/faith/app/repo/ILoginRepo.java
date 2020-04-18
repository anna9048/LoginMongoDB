package com.faith.app.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.faith.app.model.Login;

public interface ILoginRepo extends MongoRepository<Login, Integer>{

	// Query to get user
		@Query(value="{'username':?0,'password':?1}")
		Login findByUser(String username, String password);
}
