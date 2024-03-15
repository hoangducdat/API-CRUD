package org.aibles.api.student_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {
    @Autowired
    private SinhVienReponsitory sinhVienReponsitory;

    public List<SinhVien> layDanhSachSinhVien() {
        return sinhVienReponsitory.findAll();
    }


    public SinhVien createSinhVien(SinhVien sinhVien) {
        return sinhVienReponsitory.save(sinhVien);
    }

    public SinhVien updateSinhVien(Long id, SinhVien newSinhVien) {
        SinhVien existingSinhVien = sinhVienReponsitory.findById(id).orElse(null);
        if (existingSinhVien != null) {
            existingSinhVien.setName(newSinhVien.getName());
            existingSinhVien.setDayOfBirth(newSinhVien.getDayOfBirth());
            existingSinhVien.setGender(newSinhVien.getGender());
            existingSinhVien.setAddress(newSinhVien.getAddress());
            return sinhVienReponsitory.save(existingSinhVien);
        }
        return null;
    }

    public void deleteSinhVien(Long id) {
        sinhVienReponsitory.deleteById(id);
    }
}
