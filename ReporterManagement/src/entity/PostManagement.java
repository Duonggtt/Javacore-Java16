package entity;

import java.util.Arrays;

public class PostManagement {

    private Reporter reporter;
    private PostDetail[] postDetails;
    private int totalPost;

    public int getTotalPost() {
        return totalPost;
    }

    public void setTotalPost(int totalPost) {
        this.totalPost = totalPost;
    }

    public PostManagement(Reporter reporter, PostDetail[] postDetails) {
        this.reporter = reporter;
        this.postDetails = postDetails;
    }

    public Reporter getReporter() {
        return reporter;
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public PostDetail[] getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(PostDetail[] postDetails) {
        this.postDetails = postDetails;
    }

    public PostManagement(PostDetail[] postDetails) {
        this.postDetails = postDetails;
    }

    public PostManagement(Reporter reporter, PostDetail[] postDetails, int totalPost) {
        this.reporter = reporter;
        this.postDetails = postDetails;
        this.totalPost = totalPost;
    }

    @Override
    public String toString() {
        return "PostManagement{" +
                "reporter=" + reporter +
                ", postDetails=" + Arrays.toString(postDetails) +
                '}';
    }
}
