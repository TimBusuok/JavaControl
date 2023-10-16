package SHOP;


import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void toys_inventory() throws IOException {
        try {
            File filePath = new File("toys_inventory.txt");
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void look_inventory() throws IOException {
        File filePath = new File("inventory.txt");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void get() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("toys_inventory.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            Random random = new Random();
            int size = line.length();
            int randomIndex = random.nextInt(size);

            String content = line.substring(randomIndex, randomIndex + 1);
            writer.write(content);
        }

        reader.close();
        writer.close();
        System.out.println("Игрушка в вашем инвентаре");
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Чтобы выбить игрушку, наберите команду - Выбить. Если хотите посмотреть, сколько у вас игрушек в инвентаре, наберите - Просмотреть. Если хотите посмотреть, какие игрушки есть в автомате, наберите - Посмотреть_игрушки");
            String n = scan.nextLine();

            if (n.equals("Выбить")) {
                get();
                break;
            }
            if (n.equals("Просмотреть")) {
                look_inventory();
            }
            if (n.equals("Посмотреть_игрушки")) {
                toys_inventory();
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
