/**
 * Bài 3 - Lớp Student (dùng lại từ Bài 1, MSSV truyền vào để có thể kiểm tra trùng).
 */
public class Student {
    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;

    public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
        this.mssv = mssv;
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }

    public String getMssv()  { return mssv; }
    public String getName()  { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }

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

    public double diemTrungBinh() {
        return diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;
    }
}
