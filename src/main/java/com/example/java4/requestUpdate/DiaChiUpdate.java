package com.example.java4.requestUpdate;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaChiUpdate {
    @NotEmpty
    private String diaChi;
    @NotEmpty
    private String idPhuongXa;
    @NotEmpty
    private String idQuanHuyen;
    @NotEmpty
    private String idTinhThanh;
    @NotEmpty
    private String trangThai;
    @NotEmpty
    private String NgayTao;
}