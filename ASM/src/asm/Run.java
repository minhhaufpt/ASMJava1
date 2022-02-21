/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import static asm.ASM.ANSI_BLACK;
import static asm.ASM.ANSI_BLUE;
import static asm.ASM.ANSI_CYAN;
import static asm.ASM.ANSI_GREEN;
import static asm.ASM.ANSI_PURPLE;
import static asm.ASM.ANSI_RED;
import static asm.ASM.ANSI_RESET;
import static asm.ASM.ANSI_YELLOW;
import static asm.ASM.BLUE_BOLD;
import static asm.ASM.GREEN_BOLD;
import static asm.ASM.PURPLE_BOLD;
import static asm.ASM.RED_BOLD;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Minh Hậu
 */
public class Run {

    Scanner input = new Scanner(System.in);
    ArrayList<Nhanvien> nv = new ArrayList<Nhanvien>();

    public Run() {
    }

    public void bangchon() {

        System.out.println(ANSI_BLUE + "    ▣⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞ⏹▣");
        System.out.println(ANSI_BLUE + "    ▣      ⏹     ▣       " + ANSI_RED + "CHỨC ▣ NĂNG" + ANSI_BLUE + "      ⏹          ⏹▣");
        System.out.println(ANSI_BLUE + "    ▣⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞ⏹▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_BLACK + "⓵  Nhập danh sách nhân viên.             " + ANSI_BLUE + "    ⚛▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_RED + "⓶  Xuất danh sách nhân viên.             " + ANSI_BLUE + "    ⚛▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_GREEN + "⓷  Tìm và hiển thị nhân viên theo mã.    " + ANSI_BLUE + "    ⚛▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_YELLOW + "⓸  Xóa nhân viên theo mã.                " + ANSI_BLUE + "    ⚛▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_PURPLE + "⓹  Cập nhật thông tin nhân viên theo mã. " + ANSI_BLUE + "    ⚛▣");
        System.out.println(ANSI_BLUE + "    ▣⚛   " + ANSI_CYAN + "⓺  Tìm các nhân viên theo khoảng lương.  " + ANSI_BLUE + "    ⚛▣" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "    ▣⚛   " + BLUE_BOLD + "⓻  Sắp xếp nhân viên theo họ và tên.     " + ANSI_RESET + ANSI_BLUE + "    ⚛▣" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "    ▣⚛   " + GREEN_BOLD + "⓼  Sắp xếp nhân viên theo thu nhập.      " + ANSI_RESET + ANSI_BLUE + "    ⚛▣" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "    ▣⚛   " + PURPLE_BOLD + "⓽  Xuất 5 nhân viên có thu nhập cao nhất." + ANSI_RESET + ANSI_BLUE + "    ⚛▣" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "    ▣⚛   " + RED_BOLD + "⓾  Thoát khỏi chương trình.              " + ANSI_RESET + ANSI_BLUE + "    ⚛▣" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "    ▣⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞΞ⏹ΞΞΞΞΞΞΞΞΞΞ⏹▣" + ANSI_RESET);

    }

    public void Nhapnhanvien() {
        boolean flag = false;
        while (true) {
            System.out.printf("Vui lòng chọn chức vụ \n 1. Trưởng phòng\n 2. Nhân viên tiếp thị\n 3. Nhân viên hành chính\n 0. Thoát chức năng\n");
            int luachon;
            while (true) {
                System.out.print("Nhập lựa chọn của bạn : ");
                try {
                    int k = input.nextInt();
                    input.nextLine();
                    if (k >= 0 && k < 4) {
                        luachon = k;
                        if (k != 0) {
                            System.out.println(GREEN_BOLD + "Chọn chức vụ thành công!" + ANSI_RESET);
                        }
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Vui lòng chọn các chức vụ có sẵn!" + ANSI_RESET);
                    }
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println(RED_BOLD + "Vui lòng nhập đúng định dạng!" + ANSI_RESET);
                }
            }

            switch (luachon) {
                case 3: {
                    System.out.print(ANSI_RED + "Nhập số nhân viên hành chính muốn nhập thông tin : " + ANSI_RESET);
                    int sonv1 = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < sonv1; i++) {
                        Nhanvien nv1 = new hanhchinh();
                        nv1.nhaptt();
                        nv.add(nv1);
                        if (i < sonv1 - 1) {
                            System.out.println(">>>Nhập nhân viên tiếp theo<<<");
                        }
                    }
                    if (sonv1 > 1) {
                        System.out.println(">>>Nhập nhân viên tiếp theo<<<");
                    }

                    break;
                }
                case 2: {
                    System.out.print(ANSI_RED + "Nhập số nhân viên tiếp thị muốn nhập thông tin :" + ANSI_RESET);
                    int sonv2 = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < sonv2; i++) {
                        Nhanvien nv2 = new tiepthi();
                        nv2.nhaptt();
                        nv.add(nv2);
                        if (i != sonv2 - 1) {
                            System.out.println(">>>Nhập nhân viên tiếp theo<<<");
                        }
                    }

                    break;
                }
                case 1: {
                    System.out.println(ANSI_GREEN + "Nhập thông tin trưởng phòng" + ANSI_RESET);
                    Nhanvien nv3 = new truongphong();
                    nv3.nhaptt();
                    nv.add(nv3);
                    break;
                }
                case 0: {
                    System.out.println(RED_BOLD + "Đã ngưng chức năng nhập thông tin" + ANSI_RESET);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            System.out.println("Nhấn Enter để tiếp tục");
            input.nextLine();
        }
    }

    public void Xuatnhanvien() {
        System.out.println("Xuất thông tin nhân viên ");
        for (Nhanvien x : nv) {
            System.out.println("");
            if (x instanceof truongphong) {
                x.xuattt();
            } else if (x instanceof tiepthi) {
                x.xuattt();
            } else if (x instanceof hanhchinh) {
                x.xuattt();
            }
        }
    }

    public void Timnhanvien() {
        System.out.print("Nhập mã số nhân viên cần tìm : ");
        String check = input.nextLine();
        boolean flag = true;
        for (Nhanvien x : nv) {
            if (check.equalsIgnoreCase(x.getMaso())) {
                System.out.println("");
                if (x instanceof truongphong) {
                    x.xuattt();
                } else if (x instanceof tiepthi) {
                    x.xuattt();
                } else if (x instanceof hanhchinh) {
                    x.xuattt();
                }
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void Xoanhanvien() {
        System.out.print("Nhập mã số nhân viên cần xóa : ");
        String check = input.nextLine();
        boolean flag = true;
        for (Nhanvien x : nv) {
            if (check.equalsIgnoreCase(x.getMaso())) {
                nv.remove(x);
                System.out.println("Xóa nhân viên thành công!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void Capnhatnhanvien() {
        System.out.print("Nhập mã số nhân viên cần cập nhật : ");
        String check = input.nextLine();
        boolean flag = true;
        for (Nhanvien x : nv) {
            if (check.equalsIgnoreCase(x.getMaso())) {
                System.out.println("");
                x.nhaptt();
                System.out.println("Cập nhật nhân viên thành công!");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void Timnhanvientheoluong() {
        double luongMAX, luongMIN;
        while (true) {
            System.out.print("Nhập khoảng lương ( ngăn cách bởi dấu - ): ");
            String khoanluong = input.nextLine();
            String checkluong = "[^0][0-9]{6,10}-[^0][0-9]{6,10}";
            if (khoanluong.matches(checkluong)) {
                khoanluong.trim();
                String[] kluong = khoanluong.split("-");
                luongMAX = Double.parseDouble(kluong[0]);
                luongMIN = Double.parseDouble(kluong[1]);
                if (luongMAX < luongMIN) {
                    double temp = luongMAX;
                    luongMAX = luongMIN;
                    luongMIN = temp;
                }
                break;
            } else {
                System.out.println("Nhập không đúng định dạng. Vui lòng nhập lại!");
            }
        }
        boolean flag = true;
        for (Nhanvien x : nv) {
            if (x.getThunhap() >= luongMIN && x.getLuong() <= luongMAX) {
                System.out.println("");
                x.xuattt();
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public void Sapxeptheoten() {
        Collections.sort(nv, (nv1, nv2) -> (int) (nv1.getHoten().compareTo(nv2.getHoten())));//tăng dần theo tên
        System.out.println("Sắp xếp danh sách nhân viên theo tên thành công");
    }

    public void Sapxeptheothunhap() {
        Collections.sort(nv, (nv1, nv2) -> (int) (nv2.getThunhap() - nv1.getThunhap()));// giảm dần
        System.out.println("Sắp xếp danh sách nhân viên theo thu nhập thành công");
    }

    public void Top5() {
        Collections.sort(nv, (nv1, nv2) -> (int) (nv2.getThunhap() - nv1.getThunhap()));
        if (nv.size() < 5) {
            System.out.print("Hiện tại danh sách chỉ có "+nv.size()+" nhân viên.\nBạn có muốn xuất danh sách không, nhấn Y để xuất ra màn hình : ");
            String flag = input.nextLine();
            if (flag.equalsIgnoreCase("y")){
                for (Nhanvien x: nv) {
                    System.out.println("");
                    x.xuattt();
                }
            }
        } else {
            System.out.println("Top 5 nhân viên có thu nhập cao nhất");
            for (int i = 0; i < 5; i++) {
                System.out.println("");
                nv.get(i).xuattt();
            }
        }

    }
}
