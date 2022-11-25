package com.heracules.novelpalace.member;

import com.heracules.novelpalace.member.dto.ProfileDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    Member getMember() {
        return null;
    }

    ProfileDto findProfile() {
        return null;
    }

    ProfileDto updateProfile(ProfileDto profile) {
        return null;
    }

    String addLibrary(String novelId) {
        return null;
    }

    String deleteLibrary(String novelId) {
        return null;
    }

    String addRecommendEpisodes(String novelId) {
        return null;
    }

    String deleteRecommendEpisodes(String novelId) {
        return null;
    }
}