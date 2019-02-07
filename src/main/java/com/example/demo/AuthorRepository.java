package com.example.demo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

    List<Author> findByEmailLikeOrderByEmailAsc(@Param("email") String email);

}
