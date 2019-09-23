package me.cetjs2.weborg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TodoController {
    @Autowired
    private TodoList todoList;

    @GetMapping
    public String get(Model model) {
        model.addAllAttributes(todoList.e);
        return "index";
    }
}
