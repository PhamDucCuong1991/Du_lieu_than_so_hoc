package com.demothansohoc.model.cacConSoPitago;

import com.demothansohoc.model.thanSoHocParent.SoHocCha;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class SoDuongDoi extends SoHocCha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
