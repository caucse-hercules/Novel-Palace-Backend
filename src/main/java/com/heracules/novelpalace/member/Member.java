package com.heracules.novelpalace.member;

import com.heracules.novelpalace.status.AgeLimit;
import com.heracules.novelpalace.status.Role;
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
public class Member {
    @Id
    String id;
    String nickname;
    String picture;
    String email;
    Role role;
    AgeLimit ageLimit;
    ArrayList<String> ownNovels;
    ArrayList<String> library;
    ArrayList<String> recommendEpisodes;

    public Member update(String name, String picture) {
        this.nickname=name;
        this.picture=picture;

        return this;
    }
}
