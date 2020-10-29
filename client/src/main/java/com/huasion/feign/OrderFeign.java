package com.huasion.feign;

import com.huasion.entity.MenuVO;
import com.huasion.entity.Order;
import com.huasion.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;

@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
    public void save(@RequestBody Order order);

    @GetMapping("/order/findAllByUId/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index,@PathVariable("limit") int limit,@PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    public OrderVO findAll(@PathVariable("index") int index,@PathVariable("limit") int limit);

    @GetMapping("/order/updateState/{id}")
    public void updateState(@PathVariable("id") long id);
}
