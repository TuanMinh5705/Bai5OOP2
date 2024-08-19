import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

    // Phương thức để đọc dữ liệu từ file và trả về chuỗi
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return content.toString();
    }

    // Phương thức để ghi dữ liệu vào file và trả về true nếu ghi thành công
    public static boolean writeFile(String filePath, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(data);
            return true;
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
            return false;
        }
    }

    // Hàm main để sử dụng các phương thức trên
    public static void main(String[] args) {
        // Đường dẫn file để đọc và ghi
        String filePath = "example.txt";

        // Ghi dữ liệu vào file
        String dataToWrite = "Đây là một ví dụ về ghi dữ liệu vào file.";
        boolean writeSuccess = writeFile(filePath, dataToWrite);
        if (writeSuccess) {
            System.out.println("Dữ liệu đã được ghi vào file thành công.");
        } else {
            System.out.println("Không thể ghi dữ liệu vào file.");
        }

        // Đọc dữ liệu từ file
        String dataRead = readFile(filePath);
        System.out.println("Nội dung của file:");
        System.out.println(dataRead);
    }
}
