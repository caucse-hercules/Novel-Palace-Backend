package com.heracules.novelpalace.novel;

import com.heracules.novelpalace.novel.dto.NovelDto;
import com.heracules.novelpalace.status.SortBy;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class NovelController {
    ArrayList<NovelDto> findAllNovel(SortBy sortBy) {
        return null;
    }

    ArrayList<NovelDto> findNovelByTitle(String title, SortBy sortBy) {
        return null;
    }

    ArrayList<NovelDto> findNovelByAuthor(String authorName, SortBy sortBy) {
        return null;
    }

    ArrayList<NovelDto> findNovelByTags(ArrayList<String> tags, SortBy sortBy) {
        return null;
    }

    String addNovel(NovelDto novelDto) {
        return null;
    }

    String updateNovel(NovelDto novelDto) {
        return null;
    }

    String deleteNovel(NovelDto novelDto) {
        return null;
    }

    String addLibrary(NovelDto novelDto) {
        return null;
    }
}
