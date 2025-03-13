package bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bai3 {	
    public static void main(String[] args) {
        int lineCount = 0;

        // Sử dụng try-with-resources để đảm bảo tự động đóng file
        try (BufferedReader inputFile = new BufferedReader(new FileReader("input.txt"))) {
            while (inputFile.readLine() != null) {
                lineCount++;
            }
            System.out.println("Số dòng: " + lineCount);
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
