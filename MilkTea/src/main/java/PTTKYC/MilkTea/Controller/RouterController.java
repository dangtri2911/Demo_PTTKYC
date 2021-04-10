package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Repository.SanPhamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RouterController {
    private final SanPhamRepository sanPhamRepository;

    public RouterController(SanPhamRepository sanPhamRepository) {
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

    @GetMapping("/product/{id}")
    public String viewSingleProduct(Model model,
                                    @PathVariable("id") int id){
        model.addAttribute("product",sanPhamRepository.findById(id).get());
        return "item_single";
    }
}
