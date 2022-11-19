package logicHandle;

import entity.Songs;

import java.util.Scanner;

public class SongsHandle {


    public static Songs songsInput() {
        Songs song = new Songs();
        System.out.println("Nhap id song: ");
        song.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhap ten song: ");
        song.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap ca si: ");
        song.setSinger(new Scanner(System.in).nextLine());
        return song;
    }
}
