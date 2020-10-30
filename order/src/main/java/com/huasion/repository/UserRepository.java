package com.huasion.repository;

import com.huasion.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    public User findById(long id);
}
