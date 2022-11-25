/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import entity.Pet;
import java.util.ArrayList;
import java.util.Scanner;
import logicHandle.PetHandle;

/**
 *
 * @author LENOVO
 */
public class MainRun {
    static ArrayList<Pet> pets = new ArrayList<>();
    public static void main(String[] args) {
        PetHandle petHandle = new PetHandle();
        System.out.println("=========================== PET MANAGEMENT ===========================");
        petHandle.match(pets);
    }
}
