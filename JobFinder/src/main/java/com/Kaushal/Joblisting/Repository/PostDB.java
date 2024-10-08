package com.Kaushal.Joblisting.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Kaushal.Joblisting.model.Post;

@Repository
public interface PostDB extends MongoRepository<Post, String> {

}
