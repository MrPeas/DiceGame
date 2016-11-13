package dicegame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player human;
        do {
            human = new PlayerHuman(new Scanner(System.in).nextLine());
        }while (human.getName()==null||human.getName().isEmpty());
        Player comp=new PlayerComp("Komputer");

        do{
            human.guess();
            if(human.getNumber()==0)
                break;
            System.out.println(human.getName()+" wybrał :" + human.getNumber());

            comp.guess();
            System.out.println(comp.getName()+" strzelił: " + comp.getNumber());

            if(human.getNumber()==comp.getNumber()){
                System.out.println("BRAWO");
            }else{
                System.out.println("PUDŁO!");
            }

            System.out.println("----------------------------------------");
        }while (human.getNumber()!=comp.getNumber());

    }
}
