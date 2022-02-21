package asm;

import java.util.Scanner;

public class ASM {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Run run = new Run();
        while (true) {
            run.bangchon();
            int luachon;
            while (true) {
                System.out.print("Nhập lựa chọn của bạn : ");
                try {
                    int k = input.nextInt();
                    input.nextLine();
                    if (k > 0 && k < 11) {
                        luachon = k;
                        System.out.println(GREEN_BOLD + "Chọn chức năng thành công!" + ANSI_RESET);
                        break;
                    } else {
                        System.out.println(ANSI_RED + "Vui lòng chọn các chức năng có trong menu!" + ANSI_RESET);
                    }
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println(RED_BOLD + "Vui lòng nhập đúng định dạng!" + ANSI_RESET);
                }
            }

            switch (luachon) {
                case 1: {
                    System.out.println(ANSI_BLACK + "Thực hiện chức năng số 1" + ANSI_RESET);
                    run.Nhapnhanvien();
                    break;
                }
                case 2: {
                    System.out.println(ANSI_RED + "Thực hiện chức năng số 2" + ANSI_RESET);
                    run.Xuatnhanvien();
                    break;
                }
                case 3: {
                    System.out.println(ANSI_GREEN + "Thực hiện chức năng số 3" + ANSI_RESET);
                    run.Timnhanvien();
                    break;
                }
                case 4: {

                    System.out.println(ANSI_YELLOW + "Thực hiện chức năng số 4" + ANSI_RESET);
                    run.Xoanhanvien();
                    break;
                }
                case 5: {
                    //
                    System.out.println(ANSI_PURPLE + "Thực hiện chức năng số 5" + ANSI_RESET);
                    run.Capnhatnhanvien();
                    break;
                }
                case 6: {
                    //
                    System.out.println(ANSI_CYAN + "Thực hiện chức năng số 6" + ANSI_RESET);
                    run.Timnhanvientheoluong();
                    break;
                }
                case 7: {
                    //
                    System.out.println(BLUE_BOLD + "Thực hiện chức năng số 7" + ANSI_RESET);
                    run.Sapxeptheoten();
                    break;
                }
                case 8: {
                    //
                    System.out.println(GREEN_BOLD + "Thực hiện chức năng số 8" + ANSI_RESET);
                    run.Sapxeptheothunhap();
                    break;
                }
                case 9: {
                    //
                    System.out.println(PURPLE_BOLD + "Thực hiện chức năng số 9" + ANSI_RESET);
                    run.Top5();
                    break;
                }
                case 10: {
                    System.out.println(RED_BOLD + "Thực hiện chức năng số 10 : Thoát khỏi chương trình" + ANSI_RESET);
                    System.exit(0);
                }
            }
            System.out.println("Ấn Enter để tiếp tục ↺");
            input.nextLine();
        }
    }
}
