package xq.ren.genshinapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xq.ren.genshinapi.model.FontaineData;
import xq.ren.genshinapi.service.FontaineService;


import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/fontaine")
public class FontaineController {

    @Autowired
    FontaineService fontaineService;

    @GetMapping("/{Name}")
    public Optional<FontaineData> getSpecificFontaineCharacter(@PathVariable String name) throws InterruptedException, ExecutionException {
        return fontaineService.getFontaineCharacter(name);
    }

    @GetMapping
    public List<FontaineData> getListOfAllFontaineCharacters() throws InterruptedException, ExecutionException {
        return fontaineService.getAllFontaineCharacters();
    }
}
