import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadString {

    // Phương thức để đọc dữ liệu từ file
    public void readFile(String filePath) {
        BufferedReader br = null;
        try {
            // Tạo đối tượng File từ đường dẫn file
            File file = new File(filePath);

            // Kiểm tra xem file có tồn tại không
            if (!file.exists()) {
                System.err.println("File không tồn tại!");
                return;
            }

            // Khởi tạo BufferedReader để đọc file
            br = new BufferedReader(new FileReader(file));
            String line;

            // Đọc từng dòng và hiển thị ra màn hình
            System.out.println("Nội dung của file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Xử lý lỗi khi đọc file
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        } finally {
            // Đảm bảo đóng BufferedReader
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                System.err.println("Lỗi khi đóng file: " + ex.getMessage());
            }
        }
    }

    // Hàm main để nhập đường dẫn file và gọi phương thức đọc file
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn file từ người dùng
        System.out.println("Nhập đường dẫn file: ");
        String filePath = scanner.nextLine();

        // Đóng Scanner
        scanner.close();

        // Tạo đối tượng ReadFromFileExample và gọi phương thức đọc file
        ReadString readFromFileExample = new ReadString();
        readFromFileExample.readFile(filePath);
    }
}
