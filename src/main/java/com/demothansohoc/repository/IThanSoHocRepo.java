package com.demothansohoc.repository;

import com.demothansohoc.model.ThanSoHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThanSoHocRepo extends JpaRepository<ThanSoHoc, Long> {
}
