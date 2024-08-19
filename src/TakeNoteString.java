import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TakeNoteString {

    // Phương thức để ghi dữ liệu vào file
    public void writeFile(String filePath, String data) {
        PrintWriter pw = null;
        try {
            // Tạo đối tượng PrintWriter để ghi dữ liệu vào file
            pw = new PrintWriter(new FileWriter(filePath));
            pw.println(data);
            System.out.println("Dữ liệu đã được ghi vào file thành công.");
        } catch (IOException e) {
            // Xử lý lỗi khi ghi file
            System.err.println("Lỗi khi ghi vào file: " + e.getMessage());
        } finally {
            // Đảm bảo đóng PrintWriter
            if (pw != null) {
                pw.close();
            }
        }
    }

    // Hàm main để nhập dữ liệu và đường dẫn file, rồi gọi phương thức ghi file
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn file từ người dùng
        System.out.println("Nhập đường dẫn file: ");
        String filePath = scanner.nextLine();

        // Nhập dữ liệu từ người dùng
        System.out.println("Nhập dữ liệu bạn muốn lưu vào file: ");
        String data = scanner.nextLine();

        // Đóng Scanner
        scanner.close();

        // Tạo đối tượng TakeNoteString và gọi phương thức ghi file
        TakeNoteString takeNoteString = new TakeNoteString();
        takeNoteString.writeFile(filePath, data);
    }
}
