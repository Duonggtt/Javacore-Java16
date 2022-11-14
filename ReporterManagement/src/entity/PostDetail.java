package entity;

public class PostDetail {

    Post post;
    int postQuantity;

    public PostDetail(Post post, int postQuantity) {
        this.post = post;
        this.postQuantity = postQuantity;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public void setPostQuantity(int postQuantity) {
        this.postQuantity = postQuantity;
    }

    @Override
    public String toString() {
        return "PostDetail{" +
                "post=" + post +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
