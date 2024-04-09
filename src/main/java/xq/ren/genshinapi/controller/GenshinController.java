package xq.ren.genshinapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xq.ren.genshinapi.model.ElementData;
import xq.ren.genshinapi.model.UserData;
import xq.ren.genshinapi.service.UserService;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/")
public class GenshinController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<ElementData> getAllElements() throws InterruptedException, ExecutionException {
        return userService.getAllElements();
    }

}
