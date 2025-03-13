package bai5;

import java.io.File;

public class bai5 {
	public static void main(String[] args) {
        // Thay đổi đường dẫn thư mục tại đây
        String directoryPath = "D:\\SteamLibrary"; 

        // Tạo đối tượng File trỏ đến thư mục
        File directory = new File(directoryPath);

        // Kiểm tra xem thư mục có tồn tại không
        if (directory.exists() && directory.isDirectory()) {
            // Lấy danh sách các file và thư mục con
            File[] files = directory.listFiles();

            // Kiểm tra nếu thư mục rỗng
            if (files != null && files.length > 0) {
                System.out.println("Danh sách file trong thư mục: " + directoryPath);
                for (File file : files) {
                    if (file.isFile()) { // Chỉ hiển thị file, bỏ qua thư mục con
                        System.out.println("📄 " + file.getName());
                    }
                }
            } else {
                System.out.println("Thư mục trống!");
            }
        } else {
            System.out.println("Thư mục không tồn tại hoặc không hợp lệ!");
        }
    }
}
