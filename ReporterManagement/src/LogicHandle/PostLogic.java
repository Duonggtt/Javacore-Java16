package LogicHandle;

import entity.Post;
import run.MainRun;

import java.util.Scanner;

public class PostLogic {

    public static void postOutput() {
        for(int i = 0; i< MainRun.posts.length; i++) {
            if(MainRun.posts[i] != null) {
                System.out.println(MainRun.posts[i]);
            }
        }
    }

    public static void postInput() {
        int postNum = new Scanner(System.in).nextInt();
        for(int i=0;i<postNum;i++) {
            System.out.println("Nhập vào bài viết thứ " + (i+1) + " : ");
            Post post = new Post();
            post.InfoInput();
            for(int j=0;j<MainRun.posts.length;j++) {
                if(MainRun.posts[i] == null) {
                    MainRun.posts[i] = post;
                    break;
                }
            }
            MainRun.postCount += postNum;
        }
    }

    public static Post findPostById(int postId) {
        Post post = null;
        for(int k=0;k<MainRun.posts.length;k++) {
            if(MainRun.posts[k] != null && MainRun.posts[k].getId() == postId) {
                post = MainRun.posts[k];
                break;
            }
        }
        return post;
    }
}
