package me.cetjs2.weborg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoList {
//    @Autowired
//    private Todo todo;

    public List<Todo> e = new ArrayList<Todo>();
}
