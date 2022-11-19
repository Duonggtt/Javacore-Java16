package logicHandle;

import entity.Figure;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamHandle {


    public static Team inputInfo() throws NumberFormatException{
        Team team = new Team();
        System.out.println("Nhập id team: ");
        team.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        ArrayList<Figure> figures = new ArrayList<>();
        System.out.println("Nhap 5 tuong trong team co id " + team.getId());
        for(int i = 0;i<5;i++) {
            System.out.println("Tuong thu " + i+1);
            Figure figure = FingureHandle.inputInfo();
            figures.add(figure);
            team.setFigures(figures);
        }
        return team;
    }
}
