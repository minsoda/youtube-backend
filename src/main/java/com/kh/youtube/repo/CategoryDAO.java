package com.kh.youtube.repo;

import com.kh.youtube.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, Integer> { // domain 가져오고, pk가 int값이라서 Integer
}
