package com.demo.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsResponse {
    private int totalPages;
    private int currentPage;
    private int size;
    private List<Item> items;
}
