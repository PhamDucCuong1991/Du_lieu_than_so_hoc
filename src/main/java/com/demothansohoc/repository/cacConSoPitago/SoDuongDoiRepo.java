package com.demothansohoc.repository.cacConSoPitago;

import com.demothansohoc.model.cacConSoPitago.SoDuongDoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoDuongDoiRepo extends JpaRepository<SoDuongDoi, Long> {
}
