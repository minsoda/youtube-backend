package com.kh.youtube.service;

import com.kh.youtube.domain.Category;
import com.kh.youtube.repo.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService { // 구현해야하니까 class로 만듬

    @Autowired
    private CategoryDAO dao;

    public List<Category> showAll(){
        return dao.findAll(); // 자동으로 만들어짐
    }

    public Category show(int code){ //하나만 가져온다. pk로 가져올거니까 int code로 해줌
        return dao.findById(code).orElse(null); // 반환하고 없으면 null을 하겠다고 해줘야함.
    }

    public Category create(Category category){
        return dao.save(category);
    }

    public Category update(Category category){
        return dao.save(category); // 추가랑 수정은 save 메서드 사용.
    }

    public Category delete(int code){
        Category data = dao.findById(code).orElse(null);
        dao.delete(data); // return 값이 void. 객체로 넘겨야해서 위에 처럼 객체에 담고 넘김.
        return data;
    }
}
