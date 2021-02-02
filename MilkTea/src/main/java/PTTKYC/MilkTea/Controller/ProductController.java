package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Entity.Food;
import PTTKYC.MilkTea.Repository.FoodRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private final FoodRepository foodRepository;

    public ProductController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


    @GetMapping("/demo")
    @ResponseBody
    public List<Food> demoRepo(){
        return  (List<Food>) foodRepository.findAll();
    }
}
