package com.example.java4.entitiesLv2;

import com.example.java4.entitiesLv2.ChiTietSP;
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
@Table(name = "hinhanh")
public class HinhAnh {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name="IdChiTietSP", referencedColumnName = "Id")
    private ChiTietSP chiTietSP;
    @Column(name ="hinh1")
    private String hinh1;
    @Column(name ="hinh2")
    private String hinh2;
    @Column(name ="hinh3")
    private String hinh3;
    @Column(name ="TrangThai")
    private Integer trangThai;
    @Column(name="NgayTao")
    private Date ngayTao;
}