/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Nguyễn Minh Hậu
 */
public class hanhchinh extends Nhanvien {

    public hanhchinh() {
    }
    public hanhchinh(String Hoten,String maso, double luong){
        super(Hoten,maso,luong);
    }
    public void xuattt() {
        super.xuattt();
        System.out.println("Chức vụ : Nhân viên hành chính");
        System.out.println("Tổng lương : "+( getThunhap()-thueTN()) );
    }
    public double getThunhap(){
        return super.getLuong();
    }
            
    
}
