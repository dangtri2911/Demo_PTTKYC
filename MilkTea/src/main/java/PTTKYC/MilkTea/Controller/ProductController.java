package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Repository.SanPhamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private final SanPhamRepository sanPhamRepository;

    public ProductController(SanPhamRepository sanPhamRepository) {
        this.sanPhamRepository = sanPhamRepository;
    }

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    /*
    @GetMapping("/demo")
    @ResponseBody
    public List<Food> demoRepo(){
        return  (List<Food>) foodRepository.findAll();
    }
     */
}
