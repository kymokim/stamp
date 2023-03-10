package com.example.stamp.코드참고후삭제.dto;

import com.example.stamp.코드참고후삭제.entity.Article;
import lombok.*;

@AllArgsConstructor
@ToString
@Setter

public class ArticleDTO {
    private Long id;
    private String title;
    private String content;
    private String username;

    private String categories;

    private Long price;
    public Article toEntity() {
        return new Article(id,title,content,username,categories,price);
    }



}
