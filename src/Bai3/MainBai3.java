/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

public class MainBai3 {

    public static void main(String[] args) {
        // Khoi tao 3 sinh vien
        
        SinhVienIT sv1 = new SinhVienIT(6, 5, 8, "Thanh Nuong", "IT");
        SinhVienBiz sv2 = new SinhVienBiz(9, 8, "Nuong", "Quan Tri");
        
        //in thoong tin sinh vien 
        System.out.println("Thong tin sinh vien IT");
        sv1.xuat();
        System.out.println("\nThong tin sinh  vien Biz");
        sv2.xuat();
    }
    
}
