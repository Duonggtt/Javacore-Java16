package logicHandle;

import entity.Followers;
import entity.Idols;
import entity.Songs;
import entity.TikTok;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class inputOutputHandle {


    public static ArrayList<Idols> idols = new ArrayList<>();
    public static ArrayList<Songs> songs = new ArrayList<>();
    public static ArrayList<Followers> followers = new ArrayList<>();
    public static TikTok infoInput() throws ParseException {
        System.out.println("Nhap vao thong tin TIKTOK cua ban");
        System.out.println("Nhap so luong idols ban muon them: ");
        int idolsNum = new Scanner(System.in).nextInt();
        for(int i = 0 ;i< idolsNum;i++) {
            System.out.println("Idol thu " + (i+1));
            Idols idol = IdolsHandle.idolsInput();
            idols.add(idol);
        }
        System.out.println("Nhap vao so bai hat: ");
        int songsNum = new Scanner(System.in).nextInt();
        for(int  i =0; i < songsNum;i++) {
            System.out.println("Song thu " + (i+1));
            Songs song = SongsHandle.songsInput();
            songs.add(song);
        }
        TikTok tikTok = new TikTok(idols,songs);
        return tikTok;
    }

    public static void outputInfo(TikTok tikTok) {
        System.out.println(tikTok);
    }
}
