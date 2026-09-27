/**
 * Bài 2: Sinh mã số sinh viên tự động.
 * MSSV tự tăng, có capNhatEmail / capNhatSdt (viết nối chuỗi), và đếm tổng SV.
 */
public class Student {
    // Biến static dùng chung cho cả lớp Student
    private static int counter = 0;                 // đếm số sinh viên đã tạo
    private static final String PREFIX = "B21DCCN"; // tiền tố MSSV

    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;
    private String email;
    private String sdt;

    // Constructor KHÔNG nhận mssv - mssv sinh tự động
    public Student(String name, double diemCC, double diemGK, double diemCK) {
        counter++;                                       // tăng khi tạo SV mới
        this.mssv = PREFIX + String.format("%03d", counter); // B21DCCN001, 002...
        this.name = name;
        setDiemCC(diemCC);
        setDiemGK(diemGK);
        setDiemCK(diemCK);
    }

    // ------- Getter -------
    public String getMssv()  { return mssv; }
    public String getName()  { return name; }
    public double getDiemCC() { return diemCC; }
    public double getDiemGK() { return diemGK; }
    public double getDiemCK() { return diemCK; }
    public String getEmail() { return email; }
    public String getSdt()   { return sdt; }

    // ------- Setter kiểm tra 0..10 -------
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

    // Trả về this để gọi nối tiếp trên một dòng
    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }
    public Student capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }

    // Gọi qua tên lớp: Student.getTotalStudents()
    public static int getTotalStudents() {
        return counter;
    }

    public double diemTrungBinh() {
        return diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;
    }
}
