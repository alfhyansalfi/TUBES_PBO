package com.obat.obat.repository;

import com.obat.obat.entity.MyObatList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyObatRepo extends JpaRepository<MyObatList,Integer> {
}
