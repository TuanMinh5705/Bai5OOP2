package ReadAndWriteObjects;
public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    // Phương thức khởi tạo
    public SinhVien(String maSinhVien, String tenSinhVien, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Getter và Setter
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    // Phương thức toString() trả về thông tin đầy đủ
    @Override
    public String toString() {
        return "Mã sinh viên: " + maSinhVien +
                ", Tên sinh viên: " + tenSinhVien +
                ", Điểm Toán: " + diemToan +
                ", Điểm Lý: " + diemLy +
                ", Điểm Hóa: " + diemHoa;
    }
}
