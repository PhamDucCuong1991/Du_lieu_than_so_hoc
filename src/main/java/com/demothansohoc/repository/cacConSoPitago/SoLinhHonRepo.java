package com.demothansohoc.repository.cacConSoPitago;

import com.demothansohoc.model.cacConSoPitago.SoLinhHon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoLinhHonRepo extends JpaRepository<SoLinhHon,Long> {
}
