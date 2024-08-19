import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateUseFile {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn file từ người dùng
        System.out.println("Nhập đường dẫn file bạn muốn tạo: ");
        String filePath = scanner.nextLine();

        // Đóng Scanner
        scanner.close();

        // Tạo đối tượng File với đường dẫn đã nhập
        File file = new File(filePath);

        // Kiểm tra nếu file đã tồn tại
        if (file.exists()) {
            System.out.println("File đã tồn tại.");
        } else {
            try {
                // Tạo file mới
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File đã được tạo thành công.");
                } else {
                    System.out.println("Không thể tạo file.");
                }
            } catch (IOException e) {
                // Xử lý lỗi khi tạo file
                System.err.println("Lỗi khi tạo file: " + e.getMessage());
            }
        }

        // Kiểm tra nếu file là thư mục
        if (file.isDirectory()) {
            System.out.println("Đây là một thư mục.");
        } else {
            System.out.println("Đây không phải là một thư mục.");
        }

        // Hiển thị đường dẫn của file
        System.out.println("Đường dẫn file: " + file.getAbsolutePath());
    }
}
