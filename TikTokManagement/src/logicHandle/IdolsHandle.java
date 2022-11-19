package logicHandle;

import entity.Followers;
import entity.Idols;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolsHandle {


    public static Idols idolsInput() {
        Idols idol = new Idols();
        System.out.println("Nhap id idol: ");
        idol.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhap ten idol: ");
        idol.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap email idol: ");
        idol.setEmail(new Scanner(System.in).nextLine());
        System.out.println("Nhap group idol: ");
        idol.setGroup(new Scanner(System.in).nextLine());
        ArrayList<Followers> followers = new ArrayList<>();
        System.out.println("Nhap vao so luong nguoi theo doi: ");
        int followersNum = new Scanner(System.in).nextInt();
        for(int  j =0; j < followersNum;j++) {
            System.out.println("follower thu " + (j+1));
            Followers follower= FollowerHandle.followerInput();
            idol.setFollowers(followers);
            followers.add(follower);
        }
        return idol;
    }
}
