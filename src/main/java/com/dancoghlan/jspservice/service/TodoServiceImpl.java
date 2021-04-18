package com.dancoghlan.jspservice.service;

import com.dancoghlan.jspservice.entity.Todo;
import com.dancoghlan.jspservice.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> getByUser(String userName) {
        log.info("Retrieving todos for user {}", userName);
        return repository.findAllByUserName(userName);
    }

    @Override
    public void add(Todo todo) {
        log.info("Adding Todo {}", todo);
        repository.save(todo);
    }

    @Override
    public void delete(Long id) {
        log.info("Deleting Todo with id {}", id);
        repository.deleteById(id);
    }

}
