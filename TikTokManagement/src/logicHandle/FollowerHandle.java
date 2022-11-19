package logicHandle;

import entity.Followers;

import java.util.Scanner;

public class FollowerHandle {


    public static Followers followerInput() {
        Followers follower = new Followers();
        System.out.println("Nhap id follower: ");
        follower.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhap ten follower: ");
        follower.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap email follower: ");
        follower.setEmail(new Scanner(System.in).nextLine());
        System.out.println("Nhap so like cua follower: ");
        follower.setNumberOfLike(Integer.parseInt(new Scanner(System.in).nextLine()));
        return follower;
    }
}
