/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Minh Hậu
 */
public class tiepthi extends Nhanvien {

    private double luongkd, hoahong;

    public tiepthi() {
    }

    public tiepthi(String Hoten, String maso, double luong, double luongkd, double hoahong) {
        super(Hoten, maso, luong);
        this.luongkd = luongkd;
        this.hoahong = hoahong;
    }

    public double getLuongkd() {
        return luongkd;
    }

    public double getHoahong() {
        return hoahong;
    }

    public void setLuongkd(double luongkd) {
        this.luongkd = luongkd;
    }

    public void setHoahong(double hoahong) {
        this.hoahong = hoahong;
    }

    @Override
    public void nhaptt() {
        super.nhaptt();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập Lương kinh doanh :");
        luongkd = s.nextDouble();
        s.nextLine();
        System.out.print("Nhập hoa hồng :");
        hoahong = s.nextDouble();
        s.nextLine();
    }

    @Override
    public void xuattt() {
        super.xuattt();
        System.out.println("Lương kinh doanh :" + luongkd);
        System.out.println("Hoa hồng :" + hoahong);
        System.out.println("Chức vụ : Nhân viên tiếp thị");
        System.out.println("Tổng lương :"+ ( getThunhap()-thueTN()) );
    }

    @Override
    public double getThunhap() {
        return super.getLuong() + luongkd + hoahong ;
    }

}
