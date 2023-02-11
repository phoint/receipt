package phoint.spring5mvc.receipt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import phoint.spring5mvc.receipt.domain.Category;
import phoint.spring5mvc.receipt.domain.UnitOfMeasure;
import phoint.spring5mvc.receipt.repository.CategoryRepository;
import phoint.spring5mvc.receipt.repository.UnitOfMeasureRepository;
import phoint.spring5mvc.receipt.service.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {
    @Autowired
    RecipeService recipeService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes", recipeService.getReceipt());
        return "index";
    }
}
