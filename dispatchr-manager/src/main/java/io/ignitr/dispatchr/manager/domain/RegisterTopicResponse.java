package io.ignitr.dispatchr.manager.domain;

import io.ignitr.dispatchr.manager.domain.internal.Topic;

public class RegisterTopicResponse {

    public static RegisterTopicResponse from(Topic topic) {
        RegisterTopicResponse response = new RegisterTopicResponse();
        return response;
    }
}
