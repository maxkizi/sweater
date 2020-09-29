package com.examle.sweater.repos;

import com.examle.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
