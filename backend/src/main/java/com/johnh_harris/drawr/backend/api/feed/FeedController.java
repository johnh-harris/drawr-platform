package com.johnh_harris.drawr.backend.api.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controls the logic behind grabbing homepage feed,
 * calls on FeedRepository which extends MongoRepository
 * which in turn makes calls to the database asking for a list
 * of Feed objects (images)
 */
@RestController
public class FeedController {

    @Autowired
    FeedRepository feedRepository;

    @GetMapping("/")
    public ResponseEntity<List<Feed>> homePageFeed() {
        System.out.println("Grabbing feed data");
        List<Feed> feed = feedRepository.findByRange("");
        return new ResponseEntity<>(feed, HttpStatus.OK);
    }
}