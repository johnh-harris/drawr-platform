package com.johnh_harris.drawr.backend.api.feed;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Feed {

    @Id
    private String id;

    private Byte[] image;
    private String name;
}