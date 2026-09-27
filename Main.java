/**
 * Bài 3: Xếp loại học lực cho cả lớp - chương trình chạy thử.
 */
public class Main {
    public static void main(String[] args) {
        Classroom lop = new Classroom("D21CQCN01");

        lop.addStudent(new Student("B21DCCN001", "Nguyễn Văn An",  9, 9, 9));    // Giỏi
        lop.addStudent(new Student("B21DCCN002", "Trần Thị Bình",  8, 7, 6.5));  // Khá
        lop.addStudent(new Student("B21DCCN003", "Lê Văn Cường",   5, 5, 5));    // Trung bình
        lop.addStudent(new Student("B21DCCN004", "Phạm Thị Dung",  3, 4, 4));    // Yếu

        // Thử thêm sinh viên trùng MSSV -> bị chặn, không làm dừng chương trình
        System.out.println("--- Thử thêm SV trùng MSSV B21DCCN001 ---");
        try {
            lop.addStudent(new Student("B21DCCN001", "Trùng MSSV", 8, 8, 8));
        } catch (IllegalArgumentException e) {
            System.out.println("Bị chặn: " + e.getMessage());
        }
        System.out.println();

        lop.inBangDiem();
    }
}
