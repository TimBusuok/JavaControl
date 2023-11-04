package SHOP;

import java.io.*;
import java.util.Random;

public class Programs{
    public static void toys_inventory() throws IOException {
        try {
            File path = new File("C:\\Users\\Тимофей\\Desktop\\Работы\\КР\\ShopToy\\src\\SHOP\\toys_inventory");
            BufferedReader reader = new BufferedReader(new FileReader(path));
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
        File filePath = new File("C:\\Users\\Тимофей\\Desktop\\Работы\\КР\\ShopToy\\src\\SHOP\\inventory");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void get() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Тимофей\\Desktop\\Работы\\КР\\ShopToy\\src\\SHOP\\toys_inventory"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Тимофей\\Desktop\\Работы\\КР\\ShopToy\\src\\SHOP\\inventory"));

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
