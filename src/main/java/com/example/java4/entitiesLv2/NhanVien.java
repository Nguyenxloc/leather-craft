package com.example.java4.entitiesLv2;
import com.example.java4.entitiesLv1.ChucVu;
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
@Table(name="nhanvien")
public class NhanVien {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name ="Ma")
    private String ma;
    @Column(name ="HoTen")
    private String hoTen;
    @Column(name="GioiTinh")
    private String gioiTinh;
    @Column(name="NgaySinh")
    private Date ngaySinh;
    @Column(name="Sdt")
    private String sdt;
    @Column(name="MatKhau")
    private String matKhau;
    @ManyToOne
    @JoinColumn(name="IdCV",referencedColumnName ="Id")
    private ChucVu chucVu;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @Column(name="NgayTao")
    private  Date ngayTao;
    @Column(name="IdPhuongXa")
    private String idPhuongXa;
    @Column(name="IdQuanHuyen")
    private String idQuanHuyen;
    @Column(name="IdTinhThanh")
    private String idTinhThanh;
    @Column(name="phuongXa")
    private String phuongXa;
    @Column(name="quanHuyen")
    private String quanHuyen;
    @Column(name="tinhThanh")
    private String tinhThanh;
}