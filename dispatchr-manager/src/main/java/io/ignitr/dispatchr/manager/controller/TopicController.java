package io.ignitr.dispatchr.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping("/v1/topics")
public class TopicController {
    private static final Logger LOG = LoggerFactory.getLogger(TopicController.class);

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findAll() {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    @RequestMapping(method = RequestMethod.GET,
            value = "/registered",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findRegistered() {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    @RequestMapping(method = RequestMethod.GET,
                    value = "/unregistered",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findUnregistered() {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }
}
