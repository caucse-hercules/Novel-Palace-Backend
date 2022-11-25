package com.heracules.novelpalace.member;

import com.heracules.novelpalace.member.dto.ProfileDto;
import com.heracules.novelpalace.novel.dto.NovelDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MemberController {

    ProfileDto findProfile() {
        return null;
    }

    ProfileDto updateProfile(ProfileDto profile) {
        return null;
    }

    ArrayList<NovelDto> findLibrary() {
        return null;
    }

    String deleteLibrary() {
        return null;
    }
}
