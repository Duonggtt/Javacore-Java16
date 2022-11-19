package logicHandle;

import entity.Figure;

import java.util.Scanner;

public class FingureHandle {


    public static Figure inputInfo() throws NumberFormatException{
        Figure figure = new Figure();
        System.out.println("Nhập id tướng: ");
        figure.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập tên tướng: ");
        figure.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập vị trí tướng phải đi: ");
        figure.setPosition(new Scanner(System.in).nextLine());
        return figure;
    }
}
