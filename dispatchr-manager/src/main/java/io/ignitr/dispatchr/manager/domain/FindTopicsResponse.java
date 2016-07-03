package io.ignitr.dispatchr.manager.domain;

import io.ignitr.dispatchr.manager.domain.internal.Topic;

import java.net.URI;
import java.util.List;

public class FindTopicsResponse {
    private List<Result> results;
    private List<Link> links;

    public static FindTopicsResponse from(List<Topic> topicMetadatas) {
        FindTopicsResponse response = new FindTopicsResponse();
        return response;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public static class Result {
        private String name;
        private String arn;
        private List<Link> links;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getArn() {
            return arn;
        }

        public void setArn(String arn) {
            this.arn = arn;
        }

        public List<Link> getLinks() {
            return links;
        }

        public void setLinks(List<Link> links) {
            this.links = links;
        }
    }

    public static class Link {
        private String rel;
        private URI href;

        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        public URI getHref() {
            return href;
        }

        public void setHref(URI href) {
            this.href = href;
        }
    }
}
