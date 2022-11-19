package logicHandle;

import entity.SummonRift;
import entity.Team;

import java.util.ArrayList;

public class InputOutputHandle {

    public static ArrayList<Team> teams = new ArrayList<>();
    public static SummonRift inputInfo() {
        System.out.println("Thông tin 2 đội SKT và G2 !");
        System.out.println("Nhập vào thông tin đội SKT: ");
        Team SKT = TeamHandle.inputInfo();
        Team G2 = TeamHandle.inputInfo();
        teams.add(SKT);
        teams.add(G2);
        SummonRift summonRift = new SummonRift(teams);
        return summonRift;
    }

    public static void outputInfo(SummonRift summonRift) {
        System.out.println(summonRift);
    }
}
