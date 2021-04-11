package com.dancoghlan.jspservice.controller;

import com.dancoghlan.jspservice.entity.Todo;
import com.dancoghlan.jspservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/get/{userName}")
    public List<Todo> getTodos(@PathVariable String userName) {
        return todoService.getByUser(userName);
    }

    @PostMapping(value = "/add")
    public void add(@RequestBody Todo todo) {
        todoService.add(todo);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        todoService.delete(id);
    }

}
