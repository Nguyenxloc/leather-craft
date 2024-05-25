package com.example.java4.RestControllers;
import com.example.java4.Request.KhachHangReq;
import com.example.java4.entities.KhachHang;
import com.example.java4.repositories.KhachHangRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    //    @RequestMapping(name="login", method = RequestMethod.POST)
    @Autowired
    KhachHangRepository khRepo;
    public KhachHangController() {

    }
    @CrossOrigin
    @GetMapping("/index")
    public ResponseEntity<List<KhachHang>> index(Model model) {
        return ResponseEntity.ok(khRepo.findAll()) ;
    }


    @CrossOrigin
    @GetMapping("/detail/{id}")
    public ResponseEntity<KhachHang> getDetail(@PathVariable(value = "id") KhachHang khachHang){
            return ResponseEntity.ok(khachHang);
    }
    @PostMapping("/update/{id}")
    public KhachHang doUpdate(@Valid @RequestBody KhachHangReq newKH,
                           BindingResult result, @PathVariable(value = "id") KhachHang kh) {
        KhachHang value = new KhachHang();
        if (result.hasErrors()) {
            System.out.println("temp error: "+result);
            return null;
        } else {
            kh.setMa(newKH.getMa());
            kh.setTen(newKH.getTen());
            kh.setTenDem(newKH.getTenDem());
            kh.setHo(newKH.getHo());
            kh.setNgaySinh(newKH.getNgaySinh());
            kh.setSdt(newKH.getSdt());
            kh.setDiaChi(newKH.getDiaChi());
            kh.setThanhPho(newKH.getThanhPho());
            kh.setQuocGia(newKH.getQuocGia());
            kh.setMatKhau(newKH.getMatKhau());
            kh.setNgayTao(Date.valueOf(newKH.getNgayTao()));
            kh.setIndx(Integer.valueOf(newKH.getIndx()));
            kh.setTrangThai(Integer.valueOf(newKH.getTrangThai()));
            value=khRepo.save(kh);////call procedure
        }
        return value;
    }

    @GetMapping("/delete/{id}")
    public void delete(Model model, @PathVariable(value = "id") KhachHang kh) {
        khRepo.delete(kh);
        System.out.println("delete succesfully !");
    }

    @PostMapping("save")
    public KhachHang save(
            @RequestBody @Valid KhachHangReq newKH,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            System.out.println("error temp: "+result);
            return null;
        } else {
            KhachHang kh = new KhachHang();
            kh.setMa(newKH.getMa());
            kh.setTen(newKH.getTen());
            kh.setTenDem(newKH.getTenDem());
            kh.setHo(newKH.getHo());
            kh.setNgaySinh(newKH.getNgaySinh());
            kh.setSdt(newKH.getSdt());
            kh.setDiaChi(newKH.getDiaChi());
            kh.setThanhPho(newKH.getThanhPho());
            kh.setQuocGia(newKH.getQuocGia());
            kh.setMatKhau(newKH.getMatKhau());
            kh.setNgayTao(Date.valueOf(newKH.getNgayTao()));
            kh.setIndx(Integer.valueOf(newKH.getIndx()));
            kh.setTrangThai(Integer.valueOf(newKH.getTrangThai()));
            return kh;
        }
    }
}