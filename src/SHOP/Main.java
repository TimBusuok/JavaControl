package SHOP;


import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Main extends Programs{
    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Чтобы выбить игрушку, наберите команду - Выбить. Если хотите посмотреть, сколько у вас игрушек в инвентаре, наберите - Просмотреть. Если хотите посмотреть, какие игрушки есть в автомате, наберите - Посмотреть_игрушки");
            String n = scan.nextLine();

            if (n.equals("Выбить")) {
                Programs.get();
                break;
            }
            if (n.equals("Просмотреть")) {
                Programs.look_inventory();
            }
            if (n.equals("Посмотреть_игрушки")) {
                Programs.toys_inventory();
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
