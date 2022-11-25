package com.heracules.novelpalace.episode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Document
public class Episode {
    @Id
    private String id;
    private String name;
    private String content;
    private String authorComment;
    private Integer recommend;
    private Integer view;
}
