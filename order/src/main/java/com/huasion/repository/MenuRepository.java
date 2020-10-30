package com.huasion.repository;

import com.huasion.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuRepository {
    public Menu findById(long id);
}
