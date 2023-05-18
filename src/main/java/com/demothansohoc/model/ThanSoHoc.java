package com.demothansohoc.model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "than_so_hoc")
public class ThanSoHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number_name",nullable = false, unique = true)
    private String ten_con_so;
    @Column(columnDefinition = "LONGTEXT")
    private String y_nghia;
}
