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
public abstract class Nhanvien {

    Scanner s = new Scanner(System.in);

    public Nhanvien() {
    }

    public Nhanvien(String Hoten, String maso, double luong) {
        this.Hoten = Hoten;
        this.maso = maso;
        this.luong = luong;
    }

    private String Hoten;
    private String maso;
    private double luong;

    public String getHoten() {
        return Hoten;
    }


    public double getLuong() {
        return luong;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }


    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void nhaptt() {
        System.out.print("Nhập tên nhân viên :");
        this.Hoten = s.nextLine();
        System.out.print("Nhập mã số nhân viên :");
        this.maso = s.nextLine();
        System.out.print("Nhập lương nhân viên :");
        this.luong = s.nextDouble();
        s.nextLine();
    }

    public void xuattt() {
        System.out.println("Tên nhân viên : " + Hoten);
        System.out.println("Mã số nhân viên : " + maso);
        System.out.println("Lương nhân viên : " + luong);
    }

    public abstract double getThunhap();

    public double thueTN() {
        double thue = 0;
        if (getThunhap() < 9000000) {
            thue = 0;
        } else if (getThunhap() < 15000000 && getThunhap() >= 9000000) {
            thue = getThunhap() * 0.1;
        } else if (getThunhap() >= 15000000) {
            thue = getThunhap() * 0.12;
        }
        return thue;
    }
}
