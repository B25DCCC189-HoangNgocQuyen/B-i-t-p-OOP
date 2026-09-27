import java.util.ArrayList;

/**
 * Bài 3: Xếp loại học lực cho cả lớp.
 * Quản lý danh sách sinh viên, chặn trùng MSSV, xếp loại và in bảng điểm.
 */
public class Classroom {
    private String tenLop;
    private ArrayList<Student> dsSinhVien;

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        this.dsSinhVien = new ArrayList<>();
    }

    // Từ chối thêm nếu MSSV đã tồn tại -> ném IllegalArgumentException
    public void addStudent(Student s) {
        for (Student sv : dsSinhVien) {
            if (sv.getMssv().equals(s.getMssv())) {
                throw new IllegalArgumentException("MSSV đã tồn tại: " + s.getMssv());
            }
        }
        dsSinhVien.add(s);
    }

    // Xếp loại dựa trên điểm trung bình
    public String xepLoai(Student s) {
        double dtb = s.diemTrungBinh();
        if (dtb >= 8)   return "Giỏi";
        if (dtb >= 6.5) return "Khá";
        if (dtb >= 5)   return "Trung bình";
        return "Yếu";
    }

    // In toàn bộ bảng điểm kèm xếp loại và sĩ số
    public void inBangDiem() {
        System.out.println("===== BẢNG ĐIỂM LỚP " + tenLop + " =====");
        System.out.printf("%-12s %-18s %-6s %-12s%n", "MSSV", "Họ tên", "ĐTB", "Xếp loại");
        for (Student sv : dsSinhVien) {
            System.out.printf("%-12s %-18s %-6.2f %-12s%n",
                    sv.getMssv(), sv.getName(), sv.diemTrungBinh(), xepLoai(sv));
        }
        System.out.println("-------------------------------------------");
        System.out.println("Sĩ số: " + dsSinhVien.size());
    }
}
