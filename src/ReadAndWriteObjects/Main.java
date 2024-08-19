package ReadAndWriteObjects;

public class Main {
    public static void main(String[] args) {
        // Đường dẫn file để lưu và đọc
        String filePath = "sinhvien.txt";

        // Tạo đối tượng SinhVien
        SinhVien sinhVien1 = new SinhVien("SV001", "Nguyen Van A", 8.5f, 7.0f, 9.0f);
        SinhVien sinhVien2 = new SinhVien("SV002", "Tran Thi B", 6.5f, 8.0f, 7.5f);

        // Lưu thông tin sinh viên vào file
        boolean saveSuccess1 = SinhVienFileOperations.saveSinhVienToFile(sinhVien1, filePath);
        boolean saveSuccess2 = SinhVienFileOperations.saveSinhVienToFile(sinhVien2, filePath);

        System.out.println("Lưu sinh viên 1 thành công: " + saveSuccess1);
        System.out.println("Lưu sinh viên 2 thành công: " + saveSuccess2);

        // Đọc thông tin sinh viên từ file
        SinhVien[] sinhVienArray = SinhVienFileOperations.readSinhVienFromFile(filePath);

        if (sinhVienArray != null) {
            System.out.println("Danh sách sinh viên từ file:");
            for (SinhVien sv : sinhVienArray) {
                System.out.println(sv);
            }
        } else {
            System.out.println("Không có sinh viên nào trong file.");
        }
    }
}
