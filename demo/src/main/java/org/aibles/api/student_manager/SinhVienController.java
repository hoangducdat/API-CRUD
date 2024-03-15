package org.aibles.api.student_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/sinhvien")
public class SinhVienController {

    private static final Logger LOGGER = Logger.getLogger(SinhVienController.class.getName());
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/list")
    public ResponseEntity<List<SinhVien>> layDanhSachSinhVien() {
        LOGGER.info("(layDanhSachSinhVien)");
        List<SinhVien> danhSachSinhVien = sinhVienService.layDanhSachSinhVien();
        return new ResponseEntity<>(danhSachSinhVien, HttpStatus.OK);
    }
    @PostMapping
    public SinhVien createSinhVien(@RequestBody SinhVien sinhVien) {
        SinhVien sv1 = new SinhVien();
        sv1.setId(1L);
        sv1.setName("Dat");
        sv1.setDayOfBirth("2005/02/01");
        sv1.setGender("Nam");
        sv1.setAddress("Ha Noi");
        return sinhVienService.createSinhVien(sinhVien);
    }
    @PutMapping("/{id}")
    public SinhVien updateSinhVien(@PathVariable Long id, @RequestBody SinhVien newSinhVien) {
        LOGGER.info("updateSinhVien");
        return sinhVienService.updateSinhVien(id, newSinhVien);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSinhVien(@PathVariable Long id) {
        sinhVienService.deleteSinhVien(id);
        return new ResponseEntity<>("Sinh viên đã được xóa khỏi hệ thống", HttpStatus.OK);
    }
}
