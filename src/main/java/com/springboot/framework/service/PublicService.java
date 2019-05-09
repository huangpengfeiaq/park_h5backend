package com.springboot.framework.service;

import com.springboot.framework.controller.response.PageResponseBean;

public interface PublicService {
    PageResponseBean listSlideshow(Integer pageNum, Integer pageSize, Integer parkId);

    PageResponseBean listEnterprise(Integer pageNum, Integer pageSize, Integer parkId);

    PageResponseBean listHouse(Integer pageNum, Integer pageSize, Integer parkId);
}
