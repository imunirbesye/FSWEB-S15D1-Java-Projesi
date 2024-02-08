package tr.com.workintech.shoppingList.model;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pazar {
    public static boolean checkItemIsInList(List<String> list, String itemName) {
        return list.contains(itemName);
    }

    public static void printSorted(List<String> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void addItems(List<String> list){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.contains(",")){
            String[] items = input.split(",");
            for(String element: items){
                element = element.trim();
                if(!checkItemIsInList(list, element))
                    list.add(element);
                else
                    System.out.println(element + " var");
            }
        } else {
            if(!checkItemIsInList(list, input.trim()))
                list.add(input.trim());
            else
                System.out.println(input.trim() + " zaten var");
        }
        printSorted(list);
    }

    public static void removeItems(List<String> list){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.contains(",")){
            String[] items = input.split(",");
            for(String element: items){
                element = element.trim();
                if(checkItemIsInList(list, element))
                    list.remove(element);
                else
                    System.out.println(element + " yok");
            }
        } else {
            if(checkItemIsInList(list, input.trim()))
                list.remove(input.trim());
            else
                System.out.println(input.trim() + " zaten yok");
        }
        printSorted(list);
    }
}
