package io.ignitr.dispatchr.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Controller used to find and associate SNS topics with Dispatchr.
 */
@RestController
@RequestMapping("/v1/topics")
public class TopicController {
    private static final Logger LOG = LoggerFactory.getLogger(TopicController.class);

    /**
     * Find all available SNS topics within the AWS account and whether or not they are registered with Dispatchr.
     *
     * @param offset index of item to start returning when using pagination
     * @param limit number of items to return when using pagination
     * @param sortDir sort order in which to return items when using pagination
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findAll(@RequestParam(value = "offset", defaultValue = "0") Long offset,
                                                     @RequestParam(value = "limit", defaultValue = "25") Long limit,
                                                     @RequestParam(value = "sort_dir", defaultValue = "asc") String sortDir) {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    /**
     * Find all SNS topics that have been registered with Dispatchr.
     *
     * @param offset index of item to start returning when using pagination
     * @param limit number of items to return when using pagination
     * @param sortDir sort order in which to return items when using pagination
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,
                    value = "/registered",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findRegistered(@RequestParam(value = "offset", defaultValue = "0") Long offset,
                                                            @RequestParam(value = "limit", defaultValue = "25") Long limit,
                                                            @RequestParam(value = "sort_dir", defaultValue = "asc") String sortDir) {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    /**
     * Find all SNS topics that are not registered with Dispatchr.
     *
     * @param offset index of item to start returning when using pagination
     * @param limit number of items to return when using pagination
     * @param sortDir sort order in which to return items when using pagination
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,
                    value = "/unregistered",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> findUnregistered(@RequestParam(value = "offset", defaultValue = "0") Long offset,
                                                              @RequestParam(value = "limit", defaultValue = "25") Long limit,
                                                              @RequestParam(value = "sort_dir", defaultValue = "asc") String sortDir) {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }

    /**
     * Register an SNS topic with Dispatchr.
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> register() {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }
}
