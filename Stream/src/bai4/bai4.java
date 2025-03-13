package bai4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class bai4 {
    public static void main(String[] args) {
        String filename = "bai4.txt";
        Random random = new Random();

        // Ghi dữ liệu vào file
        try (DataOutputStream op = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 1; i <= 10; i++) {
                int num1 = random.nextInt(100);
                int num2 = random.nextInt(100);
                op.writeInt(num1);
                op.writeInt(num2);
                
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file
        try (DataInputStream ip = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("\nDữ liệu đọc từ tệp:");
            while (ip.available() > 0) { // Kiểm tra còn dữ liệu để đọc
                int num = ip.readInt();
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
