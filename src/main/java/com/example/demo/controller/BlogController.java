package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    @Autowired
   public BlogRepository blogRespository;

    @GetMapping("/findAllBlogs")
    public List<Blog> findAllBlogs(){
        return blogRespository.findAll();
    }

    @PostMapping("/addNewBlog")
     public ResponseEntity<Blog> addBlog(@RequestBody Blog blog)
    {
       System.out.println("BLOG from Request "+blog);
        Blog blogResponse = blogRespository.save(blog);
        return ResponseEntity.ok(blogResponse);
     }
        @DeleteMapping("/deleteAllBlogs")
        public void deleteAllBogs()
        {
            blogRespository.deleteAll();
        }
}
