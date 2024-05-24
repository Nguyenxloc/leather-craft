package com.example.java4.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="NhanVien")
public class NhanVien {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name ="Ma")
    private String ma;
    @Column(name ="Ten")
    private String ten;
    @Column(name ="TenDem")
    private String tenDem;
    @Column(name="Ho")
    private String ho;
    @Column(name="GioiTinh")
    private String gioiTinh;
    @Column(name="NgaySinh")
    private Date ngaySinh;
    @Column(name="DiaChi")
    private String diaChi;
    @Column(name="Sdt")
    private String sdt;
    @Column(name="MatKhau")
    private String matKhau;
    @Column(name="IdCV")
    private String idCV;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @Column(name="NgayTao")
    private  Date ngayTao;
    @Column(name="indx")
    private Integer indx;
}