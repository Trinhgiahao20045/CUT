/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDAO{
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public TaiKhoan checklogin(String username, String password){
        TaiKhoan tk = null;
        conn=DbContext.getConnection();
        try{
            ps= conn.prepareStatement("select* from taikhoan where tentaikhoan=? and matkhau=?");
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs=ps.executeQuery();
            if(rs.next())
            {
                tk = new TaiKhoan(rs.getString(1),rs.getString(2));
            }
        }catch(Exception ex){
            System.out.println("loi"+ ex.toString());
        }
        return tk;
    }
    public boolean changepass (TaiKhoan tk)
    {
        conn=DbContext.getConnection();
        String sql ="update TaiKhoan set matkhau=? where tentaikhoan=?";
        try{
            ps=conn.prepareStatement(sql);
            ps.setString(1, tk.getMatkhau());
            ps.setString(2,tk.getTendangnhap() );
            int kq=ps.executeUpdate();
            if(kq>0)
                return true;
        }catch(Exception ex){
            System.out.println("loi"+ex.toString());
        }
        return false;
    }
    
}