package com.huasion.repository;

import com.huasion.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminRepository {
    public Admin login(String username,String password);
}
