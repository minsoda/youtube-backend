package com.kh.youtube.service;

import com.kh.youtube.repo.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService { // 구현해야하니까 class로 만듬

    @Autowired
    private CategoryDAO dao;

}
