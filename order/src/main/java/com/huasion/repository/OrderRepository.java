package com.huasion.repository;

import com.huasion.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(int index, int limit,long uid);
    public int countByUid(long uid);
    public List<Order> findAll(int index,int limit);
    public void updateState(long id);
    public int count();
}
