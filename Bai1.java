/**
 * Bài 1: Quản lý điểm sinh viên - chương trình chạy thử.
 */
public class Main {
    public static void main(String[] args) {
        // Tạo 3 sinh viên với điểm khác nhau
        Student sv1 = new Student("B21DCCN001", "Nguyễn Văn An",  9, 9, 9);
        Student sv2 = new Student("B21DCCN002", "Trần Thị Bình", 10, 6.5, 8);
        Student sv3 = new Student("B21DCCN003", "Lê Văn Cường",   7, 9, 6);

        Student[] danhSach = { sv1, sv2, sv3 };

        System.out.println("MSSV         Họ tên            ĐTB");
        for (Student sv : danhSach) {
            System.out.printf("%-12s %-16s %.2f%n",
                    sv.getMssv(), sv.getName(), sv.diemTrungBinh());
        }

        // Kiểm tra setter chặn điểm sai
        System.out.println("\n--- Thử đặt điểm không hợp lệ cho sv1 ---");
        double truoc = sv1.getDiemGK();
        sv1.setDiemGK(-1);   // bị chặn
        sv1.setDiemGK(11);   // bị chặn
        System.out.printf("Điểm GK của sv1 giữ nguyên: %.1f (trước đó %.1f)%n",
                sv1.getDiemGK(), truoc);
    }
}
