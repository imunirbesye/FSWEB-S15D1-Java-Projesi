package tr.com.workintech.shoppingList.main;

import tr.com.workintech.shoppingList.model.Pazar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        shoppingListApp();
    }

    public static void shoppingListApp() {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new LinkedList<>();

        while(true) {
            int input = scanner.nextInt();

            if(input == 0){
                break;
            } else if(input == 1) {
                System.out.println("Eklenmesini istediğiniz malzemeleri giriniz:");
                Pazar.addItems(shoppingList);
            } else if(input == 2) {
                System.out.println("Çıkarılmasını istediğiniz malzemeleri giriniz:");
                Pazar.removeItems(shoppingList);
            }
        }
    }
}
