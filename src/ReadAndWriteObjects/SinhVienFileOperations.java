package ReadAndWriteObjects;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienFileOperations {

    // Phương thức lưu thông tin đối tượng SinhVien vào file
    public static boolean saveSinhVienToFile(SinhVien sinhVien, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(sinhVien.getMaSinhVien() + "," +
                    sinhVien.getTenSinhVien() + "," +
                    sinhVien.getDiemToan() + "," +
                    sinhVien.getDiemLy() + "," +
                    sinhVien.getDiemHoa());
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi thông tin sinh viên vào file: " + e.getMessage());
            return false;
        }
    }

    // Phương thức đọc dữ liệu sinh viên từ file và trả về một mảng đối tượng SinhVien
    public static SinhVien[] readSinhVienFromFile(String filePath) {
        List<SinhVien> sinhVienList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String maSinhVien = parts[0];
                    String tenSinhVien = parts[1];
                    float diemToan = Float.parseFloat(parts[2]);
                    float diemLy = Float.parseFloat(parts[3]);
                    float diemHoa = Float.parseFloat(parts[4]);
                    SinhVien sinhVien = new SinhVien(maSinhVien, tenSinhVien, diemToan, diemLy, diemHoa);
                    sinhVienList.add(sinhVien);
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc thông tin sinh viên từ file: " + e.getMessage());
            return null;
        }
        return sinhVienList.isEmpty() ? null : sinhVienList.toArray(new SinhVien[0]);
    }
}
