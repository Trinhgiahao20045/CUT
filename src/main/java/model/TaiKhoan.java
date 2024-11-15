/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan{
    private String tentaikhoan;
    private String matkhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String tentaikhoan, String matkhau) {
        this.tentaikhoan = tentaikhoan;
        this.matkhau = matkhau;
    }

    public String getTendangnhap() {
        return tentaikhoan;
    }

    public void setTendangnhap(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "tentaikhoan=" + tentaikhoan + ", matkhau=" + matkhau + '}';
    }
    
}