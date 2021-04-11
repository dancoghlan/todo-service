package com.dancoghlan.jspservice.service;

import com.dancoghlan.jspservice.entity.Todo;
import com.dancoghlan.jspservice.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> getByUser(String userName) {
        return repository.findAllByUserName(userName);
    }

    @Override
    public void add(Todo todo) {
        repository.save(todo);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
