package bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclEntry;

public class bai2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("output.txt");
			
			System.out.println("Nhập dữ liệu (nhấn 'exit' để dừng):");
			
			String line;
            
            // Đọc từng dòng từ bàn phím và ghi vào tệp
            while (true) {
                line = br.readLine();  // Đọc một dòng từ bàn phím
                
                if ("exit".equalsIgnoreCase(line)) {  // Dừng khi người dùng nhập "exit"
                    break;
                }
                
                fw.write(line + "\n");  // Ghi dòng vào tệp
            }
            
            System.out.println("Dữ liệu đã được lưu vào file 'output.txt'");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
	        try {
	            if (br != null) {
	            	br.close();  // Đóng BufferedReader
	            }
	            if (fw != null) {
	            	fw.close();  // Đóng FileWriter
	            }
	        } catch (IOException e) {
	            e.printStackTrace();  // Xử lý lỗi khi đóng các đối tượng
	        }

	}
	}
}
