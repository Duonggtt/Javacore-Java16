/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicHandle;

import constant.PetTypeConstant;
import entity.Pet;
import java.util.ArrayList;
import java.util.Scanner;
import run.MainRun;

/**
 *
 * @author LENOVO
 */
public class PetHandle {
    public Scanner scanner = new Scanner(System.in);
    
    
    public Pet petInfoInput(Scanner scanner){
        Pet pet = new Pet();
        
        while(true){
        try{
            System.out.println("Import pet's id: ");
            pet.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Import pet's name: ");
            pet.setName(scanner.nextLine());
            System.out.println("Import pet's species: ");
            pet.setSpecies(scanner.nextLine());
            System.out.println("Import pet's sex (male: 1; female: 2):  ");
            pet.setSex(Integer.parseInt(scanner.nextLine()));
            System.out.println("Import pet's age: ");
            pet.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Import pet's description: ");
            pet.setDescription(scanner.nextLine());
            System.out.println("1. Dog.");
            System.out.println("2. Cat.");
            System.out.println("Choose pet's type: ");
            int typeTemp;
            do{
                typeTemp = Integer.parseInt(scanner.nextLine());
                if(typeTemp >0 && typeTemp < 3){
                    break;
                }
            System.out.println("Invalid action! Choose again: ");
            }while(true);
            switch(typeTemp){
                case 1:
                    pet.setType(PetTypeConstant.DOG_TYPE.value);
                    break;
                case 2:
                    pet.setType(PetTypeConstant.CAT_TYPE.value);
                    break;
                }
            System.out.println("Import pet's image: ");
            pet.setImage(scanner.nextLine());
            break;
                }catch(Exception e){
                    System.out.println("Invalid input type! Import again: ");
                }
            }
            return pet;
        }
    
    public void petInfoOutput(ArrayList<Pet> pets){
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
    
    public void match(ArrayList<Pet> pets){
        Pet pet = new Pet();
        System.out.println("============ Import pet information! ============");
        System.out.println("Import number of pets u wanna import: ");
        int petNum = 0;
        while(true){
        try{
            petNum = Integer.parseInt(scanner.nextLine());
            break;
        }catch(NumberFormatException e){
            System.out.println("Invalid input type! Import again: ");
        }
        }
        for(int i = 0;i< petNum;i++){
            pet = petInfoInput(scanner);
            pets.add(pet);
        }
        System.out.println("============ Random Pet in list ============");
        int randomIndex = (int) (Math.random() * pets.size());
         System.out.println("Random pet: " + pets.get(randomIndex));
        System.out.println("======================");
        System.out.println("Do u want to find anothor pet ?");
        System.out.println("1. Yes.");
        System.out.println("2. No.");
        System.out.println("Y/N?");
        int choice ;
        do{
            try{
                choice = Integer.parseInt(scanner.nextLine());
            if(choice >0 && choice <3){
                break;
            }
                System.out.println("Please choose valid action!");
            }catch(Exception e){
                System.out.println("Invalid input type! Import again: ");
            }
        }while(true);
        switch(choice){
            case 1:
                boolean isCheck = false;
                for(int i =0; i<pets.size();i++){
                        if(pets.get(i) != pets.get(randomIndex) && pets.get(i).getSex() != pets.get(randomIndex).getSex() && (pets.get(i).getType().equals(pets.get(randomIndex).getType()))){
                            System.out.println("Another pet: " + pets.get(i));
                            isCheck = true;
                            break;
                    }
                }
                if(isCheck){
                    System.out.println("there are no pet valid to match!");
                }
                break;
            case 2:
                System.out.println("exit");
                return;
        }
        
       
        
        
    }
}
