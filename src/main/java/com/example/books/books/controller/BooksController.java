package com.example.books.books.controller;

import com.example.books.books.model.books;
import com.example.books.books.service.booksservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {
    private final booksservice booksservice;

    public BooksController(com.example.books.books.service.booksservice booksservice) {
        this.booksservice = booksservice;
    }
    @GetMapping("/libros")
    public String libros( ModelMap interfazConPantalla){
        List<books> booksList = booksservice.listabooks();
        interfazConPantalla.addAttribute("lista",booksList);
        return "libros";
    }
    @GetMapping("/")
    public String vistaHome( ModelMap interfazConPantalla){
        return "index";
    }

    @GetMapping("/perritos")
    public String vistaerritos( ModelMap interfazConPantalla){
        return "perritos";
    }

    @GetMapping("/login")
    public String vistalogin( ModelMap interfazConPantalla){
        return "login";
    }
}
