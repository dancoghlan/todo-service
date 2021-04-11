package com.dancoghlan.jspservice.service;

import com.dancoghlan.jspservice.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getByUser(String user);

    void add(Todo todo);

    void delete(Long id);
}
