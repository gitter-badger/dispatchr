package io.ignitr.dispatchr.manager.service;

import io.ignitr.dispatchr.manager.domain.RegisterTopicRequest;
import io.ignitr.dispatchr.manager.domain.internal.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import rx.Observable;

import java.util.List;

@Component
public class TopicService {
    private static final Logger LOG = LoggerFactory.getLogger(TopicService.class);

    public Observable<List<Topic>> findAll(long offset, long limit, String sortDir) {
        return null;
    }

    public Observable<List<Topic>> findRegistered(long offset, long limit, String sortDir) {
        return null;
    }

    public Observable<List<Topic>> findUnregistered(long offset, long limit, String sortDir) {
        return null;
    }

    public Observable<Topic> register(RegisterTopicRequest request) {
        return null;
    }
}
