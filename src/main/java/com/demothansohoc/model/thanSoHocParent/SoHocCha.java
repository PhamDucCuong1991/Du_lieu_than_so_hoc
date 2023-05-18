package com.demothansohoc.model.thanSoHocParent;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class SoHocCha {

    private String so1;
    private String so2;
    private String so3;
    private String so4;
    private String so5;
    private String so6;
    private String so7;
    private String so8;
    private String so9;
}
