/*
 * Copyright 2016 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.ignitr.dispatchr.manager.controller;

import io.ignitr.dispatchr.manager.domain.RegisterTopicRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import javax.validation.Valid;

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
     * @param request {@link RegisterTopicRequest} that contains the information of the SNS topic to register
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public DeferredResult<ResponseEntity<?>> register(@Valid @RequestBody RegisterTopicRequest request) {
        final DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

        return deferredResult;
    }
}
