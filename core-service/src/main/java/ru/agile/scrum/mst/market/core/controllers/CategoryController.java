package ru.agile.scrum.mst.market.core.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.agile.scrum.mst.market.api.ValueWrapper;
import ru.agile.scrum.mst.market.core.services.CategoryService;
import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/titles")
    public ValueWrapper<List<String>> getAllCategory() {
        return new ValueWrapper<>(categoryService.getTitleCategory());
    }
}
