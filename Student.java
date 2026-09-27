/**
 * Bài 1: Quản lý điểm sinh viên
 * Lớp Student - đóng gói thông tin và điểm của một sinh viên.
 */
public class Student {
    // Tất cả thuộc tính đều private (đóng gói)
    private String mssv;
    private String name;
    private double diemCC;   // chuyên cần
    private double diemGK;   // giữa kỳ
    private double diemCK;   // cuối kỳ

    // Constructor nhận đủ 5 giá trị
    public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
        this.mssv = mssv;
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }

    // ------- Getter cho từng thuộc tính -------
    public String getMssv()  { return mssv; }
    public String getName()  { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }

    // ------- Setter riêng cho từng cột điểm, kiểm tra 0..10 -------
    public void setDiemCC(double diem) {
        if (diem >= 0 && diem <= 10) this.diemCC = diem;
        else System.out.println("Điểm CC không hợp lệ (0-10): " + diem);
    }
    public void setDiemGK(double diem) {
        if (diem >= 0 && diem <= 10) this.diemGK = diem;
        else System.out.println("Điểm GK không hợp lệ (0-10): " + diem);
    }
    public void setDiemCK(double diem) {
        if (diem >= 0 && diem <= 10) this.diemCK = diem;
        else System.out.println("Điểm CK không hợp lệ (0-10): " + diem);
    }

    // Điểm trung bình: chuyên cần 10% + giữa kỳ 30% + cuối kỳ 60%
    public double diemTrungBinh() {
        return diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;
    }
}
