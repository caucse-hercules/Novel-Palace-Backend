package com.heracules.novelpalace.episode;

import com.heracules.novelpalace.episode.dto.EpisodeDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EpisodeController {
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
