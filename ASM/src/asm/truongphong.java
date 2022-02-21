/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Minh Hậu
 */
public class truongphong extends Nhanvien {

    private double luongTN;
    Scanner s = new Scanner(System.in);

    public truongphong() {
    }

    public truongphong(double luongTN, String Hoten, String maso, double luong) {
        super(Hoten, maso, luong);
        this.luongTN = luongTN;
    }

    @Override
    public void nhaptt() {
        super.nhaptt();
        System.out.print("Lương trách nhiệm :");
        luongTN = s.nextDouble();
        s.nextLine();
    }

    @Override
    public void xuattt() {
        super.xuattt();
        System.out.println("Lương trách nhiệm :" + luongTN);
        System.out.println("Chức vụ : Trưởng phòng");
        System.out.println("Tổng lương :" + ( getThunhap()-thueTN()) );
    }

    @Override
    public double getThunhap() {
        return getLuong() + luongTN ;
    }

}
