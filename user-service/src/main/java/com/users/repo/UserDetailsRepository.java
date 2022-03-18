package com.users.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.users.domain.UserDetails;

public interface UserDetailsRepository extends MongoRepository<UserDetails, Integer> {

}
