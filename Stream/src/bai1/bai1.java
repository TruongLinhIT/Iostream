package bai1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bai1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("input.txt");
		FileOutputStream out = new FileOutputStream("output.txt");
		
		try {
            
            int c;

            while ((c = in.read()) != -1) {
            	System.out.println(c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
	}
}
