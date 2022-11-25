package com.heracules.novelpalace.novel;

import com.heracules.novelpalace.status.AgeLimit;
import com.heracules.novelpalace.status.Genre;
import com.heracules.novelpalace.status.PublishStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Document
public class Novel {
    @Id
    private String id;
    private String title;
    private String thumbnail;
    private String description;
    private String authorId;
    private String authorNickName;
    private PublishStatus publishStatus;
    private Genre genre;
    private AgeLimit ageLimit;
    private Integer interest;
    private ArrayList<String> tags;
    private ArrayList<String> episodes;
}
