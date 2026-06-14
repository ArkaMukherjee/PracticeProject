package com.example.libraryeventproducer.com.example.libraryeventproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibraryEvent {

    private Integer libraryId;
    private Book book;
}
