package com.example.be_java_hisp_w19_g2.dtos;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.example.be_java_hisp_w19_g2.entities.Post;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class FollowedPostsDTO {
    Integer userId;
    List<PostDTO> posts = new ArrayList<>();
}
