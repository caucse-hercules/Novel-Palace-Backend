package com.heracules.novelpalace.novel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NovelRepository extends MongoRepository<Novel, String> {

}
