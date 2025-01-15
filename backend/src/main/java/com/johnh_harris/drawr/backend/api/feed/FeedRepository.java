package com.johnh_harris.drawr.backend.api.feed;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This handles calling the database for the list of images
 */
@Repository
public interface FeedRepository extends MongoRepository<Feed, String> {


    @Query("{ 'range' : ?0 }")
    List<Feed> findByRange(String range);
}
