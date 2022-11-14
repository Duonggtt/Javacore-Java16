package LogicHandle;

import com.sun.tools.javac.Main;
import entity.Post;
import entity.PostDetail;
import entity.PostManagement;
import entity.Reporter;
import run.MainRun;

import java.util.Scanner;

public class PostManagementLogic {

    public static void addNewPostManagement() {
        System.out.println("Nhập số lượng phóng viên muốn tính công :");
        int reporterNum;
        do {
            reporterNum = new Scanner(System.in).nextInt();
            if(reporterNum > 0 && reporterNum <=5 && reporterNum <= MainRun.postCount) {
                break;
            }
            System.out.println("Số bài viết không được vượt quá 5!! Vui lòng nhập lại!");
        }while(true);
        for(int i=0;i<reporterNum;i++) {
            System.out.println("Nhập thông tin phóng viên thứ " + (i+1) + " : ");
            System.out.println("Nhập mã phóng viên: ");
            Reporter reporter = null;
            int reporterId;
            do {
                reporterId = new Scanner(System.in).nextInt();
                reporter = ReporterLogic.findReporterById(reporterId);
                if(reporter != null) {
                    break;
                }
                System.out.println("Mã phóng viên không chính xác ! Vui lòng nhập lại");
            }while(true);
            System.out.println("Nhập số lượng loại bài viết mà phóng viên này đã viết: ");
            int postNum = new Scanner(System.in).nextInt();
            Post post = null;
            int count = 0;
            int total = 0;
            PostDetail[] detail = new PostDetail[postNum];
            for(int j=0;j<postNum;j++) {
                System.out.println("Nhập thông tin thể loại bài viết: ");
                System.out.println("Nhập id bài viết: ");
                int postId;
                    do {
                        postId = new Scanner(System.in).nextInt();
                        post = PostLogic.findPostById(postId);
                        if(post == null) {
                            System.out.println("Mã bài viết không tồn tại! Vui lòng nhập lại!");
                            continue;
                        }
                        boolean flag = false;
                        for(int k = 0;k<count;k++) {
                            if(detail[k].getPost().getId() == postId) {
                                flag = true;
                                break;
                            }
                        }if(!flag) {
                            break;
                        }
                        System.out.println("Không nhập 1 thể loại 2 lần, Nhập lại!");
                    }while(true);
                System.out.println("Nhập số lần viết của thể loại này: ");
                int postQuantity = new Scanner(System.in).nextInt();
                detail[count] = new PostDetail(post,postQuantity);
                total += postQuantity;
                count++;
            }
            PostManagement postManagement = new PostManagement(reporter,detail);
            postManagement.setTotalPost(total);
            savePostManagement(postManagement);
        }
    }


    private static void savePostManagement(PostManagement postManagement) {
        for(int i=0;i< MainRun.postManagements.length;i++) {
            if(MainRun.postManagements[i] == null) {
                MainRun.postManagements[i] = postManagement;
                break;
            }
        }
    }

    public static void showPostManagement() {
    for(int i=0;i< MainRun.postManagements.length;i++) {
        if(MainRun.postManagements[i] != null) {
            System.out.println(MainRun.postManagements[i]);
        }
    }
}
    public static void sortByName() {
        for(int i=0;i<MainRun.postManagements.length - 1;i++) {
            for(int j=i+1;j<MainRun.postManagements.length ; j++) {
                PostManagement post1 = MainRun.postManagements[i];
                PostManagement post2 = MainRun.postManagements[j];
                if(post1.getReporter().getName().compareTo(post1.getReporter().getName()) > 0) {
                    PostManagement temp = post1;
                    post1 = post2;
                    post2 = temp;
                }
            }
        }
    }


    public static void sortByPostNum() {
        for(int i=0;i<MainRun.postManagements.length - 1;i++) {
            for(int j=i+1;j<MainRun.postManagements.length ; j++) {
                PostManagement post1 = MainRun.postManagements[i];
                PostManagement post2 = MainRun.postManagements[j];
                if(post1.getTotalPost() < post2.getTotalPost()) {
                    PostManagement temp = post1;
                    post1 = post2;
                    post2 = temp;
                }
            }
        }
    }

    public static void caculateSalary() {
        for (int i = 0; i < MainRun.postManagements.length; i++) {
            double salary = 0;
            PostDetail[] postDetails = MainRun.postManagements[i].getPostDetails();
            for(int j=0;j<postDetails.length;j++) {
                salary += postDetails[j].getPostQuantity() * postDetails[j].getPost().getPrice();
            }
            System.out.println("Lương nhân viên tên " + MainRun.reporters[i].getName() + " là : " + salary);
        }
    }
}
