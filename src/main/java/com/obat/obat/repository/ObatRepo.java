package com.obat.obat.repository;

import com.obat.obat.entity.Obat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObatRepo extends JpaRepository <Obat, Integer> {
}
