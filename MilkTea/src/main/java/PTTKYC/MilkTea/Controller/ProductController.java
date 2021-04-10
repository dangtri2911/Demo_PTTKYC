package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private final SanPhamRepository sanPhamRepository;

    public ProductController(SanPhamRepository sanPhamRepository) {
        this.sanPhamRepository = sanPhamRepository;
    }


    /*
    @GetMapping("/demo")
    @ResponseBody
    public List<Food> demoRepo(){
        return  (List<Food>) foodRepository.findAll();
    }
     */
}
