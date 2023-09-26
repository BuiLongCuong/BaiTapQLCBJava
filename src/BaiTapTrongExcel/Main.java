package BaiTapTrongExcel;

import java.util.Scanner;

public class Main {
    static Scanner inputInt = new Scanner(System.in);
    static Scanner inputString = new Scanner(System.in);

    public static void main(String[] args) {

        QLCB clazz = new QLCB();
        KySu kySu = new KySu("An", 25, "Nam", "BD", "Xây dựng");
        CongNhan congNhan = new CongNhan("Nam", 19, "Nam", "DN", 5);
        NhanVien nhanVien = new NhanVien("Lâm", 23, "Nam", "SG", "Thư kí");
        clazz.add(kySu);
        clazz.add(congNhan);
        clazz.add(nhanVien);
        clazz.showAll();
        Scanner input = new Scanner(System.in);
        int choiceMenu;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("QUẢN LÍ CÁN BỘ");
            System.out.println("1.Thêm mới cán bộ.");
            System.out.println("2.Tìm kiếm theo tên.");
            System.out.println("3.Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4.Thoát khỏi chương trình.");
            choiceMenu = input.nextInt();
            switch (choiceMenu) {
                case 1:
                    int choiceAdd;
                    System.out.println("Bạn muốn thêm loại các bộ nào?");
                    System.out.println("1.Thêm kỹ sư.");
                    System.out.println("2.Thêm công nhân.");
                    System.out.println("3.Thêm nhân viên");
                    choiceAdd = input.nextInt();
                    switch (choiceAdd) {
                        case 1:
                            addKySu(clazz);
                            break;
                        case 2:
                            addCongNhan(clazz);
                            break;
                        case 3:
                            addNhanVien(clazz);
                            break;
                    }
                    break;
                case 2:
                    findCanBoByName(input, clazz);
                    break;
                case 3:
                    clazz.showAll();
                    break;
            }
        } while (choiceMenu != 4);

    }

    private static void findCanBoByName(Scanner input, QLCB clazz) {
        input.nextLine();
        System.out.println("Nhập tên muốn tìm:");
        String nameSearch = input.nextLine();
        if(clazz.findByName(nameSearch).isEmpty()){
            System.out.println("Không có cán bộ nào.");
        }else {
            System.out.println(clazz.findByName(nameSearch));
        }
    }

    public static void addKySu(QLCB person) {
        System.out.println("Nhập tên của kỹ sư mới :");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi của kỹ sư mới :");
        int age = inputInt.nextInt();
        System.out.println("Nhập giới tính của kỹ sư mới :");
        String sex = inputString.nextLine();
        System.out.println("Nhập địa chỉ của kỹ sư mới :");
        String address = inputString.nextLine();
        System.out.println("Nhập ngành đào tạo của kỹ sư mới :");
        String nganhDaoTao = inputString.nextLine();
        KySu kySuMoi = new KySu(name, age, sex, address, nganhDaoTao);
        person.add(kySuMoi);
        System.out.println("Thêm kỹ sư mới thành công!!");
    }

    public static void addCongNhan(QLCB person) {
        System.out.println("Nhập tên của công nhân mới :");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi của công nhân mới :");
        int age = inputInt.nextInt();
        System.out.println("Nhập giới tính của công nhân mới :");
        String sex = inputString.nextLine();
        System.out.println("Nhập địa chỉ của công nhân mới:");
        String address = inputString.nextLine();
        System.out.println("Nhập bậc của công nhân mới:");
        int bac = inputString.nextInt();
        CongNhan congNhanMoi = new CongNhan(name, age, sex, address, bac);
        person.add(congNhanMoi);
        System.out.println("Thêm công nhân mới thành công!!");
    }
    public static void addNhanVien(QLCB person) {
        System.out.println("Nhập tên của nhân viên mới:");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi của nhân viên mới:");
        int age = inputInt.nextInt();
        System.out.println("Nhập giới tính của nhân viên mới:");
        String sex = inputString.nextLine();
        System.out.println("Nhập địa chỉ của nhân viên mới:");
        String address = inputString.nextLine();
        System.out.println("Nhập công việc của nhân viên mới:");
        String job = inputString.nextLine();
        NhanVien nhanVienMoi = new NhanVien(name, age, sex, address, job);
        person.add(nhanVienMoi);
        System.out.println("Thêm nhân viên mới thành công!!");
    }
}
