package com.heracules.novelpalace.episode;

import com.heracules.novelpalace.episode.dto.EpisodeDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class EpisodeService {
    private final EpisodeRepository novelRepository;

    ArrayList<EpisodeDto> findAllEpisode() {
        return null;
    }

    EpisodeDto findEpisodeById(String id) {
        return null;
    }

    String addEpisode(String novelId, EpisodeDto episodeDto) {
        return null;
    }

    String updateEpisode(String novelId, EpisodeDto episodeDto) {
        return null;
    }

    String deleteNovel(String novelId, EpisodeDto episodeDto) {
        return null;
    }
}