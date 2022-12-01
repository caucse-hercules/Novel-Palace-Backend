package com.heracules.novelpalace.config.auth.dto;

import com.heracules.novelpalace.member.Member;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Member member) {
        this.name = member.getNickname();
        this.email = member.getEmail();
        this.picture = member.getPicture();
    }
}
