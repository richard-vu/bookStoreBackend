/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.application.ui.controllers.models.responsives.BookResponsive;

/**
 * @author mx-linux
 *
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

  @GetMapping("/v1/getAll")
  public ResponseEntity<List<BookResponsive>> getBooks(){
    BookResponsive bookRes = BookResponsive.builder().title("This is a title!").build();
    
    List<BookResponsive> books = new ArrayList<>();
    books.add(bookRes);
    return ResponseEntity.ok(books);
    
  }
  
}