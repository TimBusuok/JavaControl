package SHOP;

import java.io.*;
import java.util.Random;

public class Programs{
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
}
