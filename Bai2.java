/**
 * Bài 2: Sinh mã số sinh viên tự động - chương trình chạy thử.
 */
public class Main {
    public static void main(String[] args) {
        Student sv = new Student("Lan", 8, 7.5, 9);
        // Gọi nối tiếp trên một dòng nhờ các phương thức return this
        sv.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");

        System.out.println(sv.getMssv());   // B21DCCN001
        System.out.println("Email: " + sv.getEmail() + " | SĐT: " + sv.getSdt());

        // Tạo thêm sinh viên -> MSSV tăng dần, không trùng
        Student sv2 = new Student("Minh", 7, 8, 6.5);
        Student sv3 = new Student("Hoa",  9, 9, 10);
        System.out.println(sv2.getMssv());  // B21DCCN002
        System.out.println(sv3.getMssv());  // B21DCCN003

        // Gọi static qua TÊN LỚP
        System.out.println("Tổng số sinh viên đã tạo: " + Student.getTotalStudents()); // 3
    }
}
