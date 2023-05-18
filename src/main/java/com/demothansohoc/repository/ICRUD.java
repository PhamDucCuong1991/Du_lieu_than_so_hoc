package com.demothansohoc.repository;

import java.util.List;

public interface ICRUD<T> {
    List<T> findAll();

    T findOne(Long id);

    boolean save(T t);

    boolean delete(Long id);

}
