package com.kh.youtube.controller;

import com.kh.youtube.domain.Category;
import com.kh.youtube.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// RestfulAPI : 전체 조회, 상세 조회, 추가, 수정, 삭제
@RestController
@RequestMapping("/api/*")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> showAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.showAll());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // 400 에러. build() = body(null)
        }
    }

    @GetMapping("/category/{id}") // 상대조회는 뒤에 저렇게 붙는당
    public ResponseEntity<Category> show(@PathVariable int id){ // 경로에서 가져와서 pathvariable. id를 가져오니까 int id
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.show(id));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/category")
    public ResponseEntity<Category> create(@RequestBody Category category){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.create(category));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/category")
    public ResponseEntity<Category> update(@RequestBody Category category){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(category));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<Category> delete(@PathVariable int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
