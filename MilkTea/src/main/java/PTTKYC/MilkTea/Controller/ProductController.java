package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Entity.SanPham;
import PTTKYC.MilkTea.Repository.MenuRepository;
import PTTKYC.MilkTea.Repository.SanPhamRepository;
import PTTKYC.MilkTea.Storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ProductController {
    @Autowired
    private final SanPhamRepository sanPhamRepository;
    private final StorageService storageService;
    private final MenuRepository menuRepository;

    public ProductController(SanPhamRepository sanPhamRepository, StorageService storageService, MenuRepository menuRepository) {
        this.sanPhamRepository = sanPhamRepository;
        this.storageService = storageService;
        this.menuRepository = menuRepository;
    }

   // @GetMapping("/admin/add-entity/add-product")
    @GetMapping("/add-entity/add-product")
    public String viewAddProduct(Model model){
        model.addAttribute("action","/add-entity/add-product");
        return "add/add-product";
    }
    @PostMapping("/add-entity/add-product")
    public String addProduct(@RequestParam("name") String ten,
                             @RequestParam("price") int gia,
                             @RequestParam("tinhtrang") String tinhtrang,
                             @RequestParam("mota") String mota,
                             @RequestParam("hinh") MultipartFile file,
                             HttpServletRequest req,
                             HttpServletResponse resp
                             ) throws IOException {
        storageService.store(file);
        String[] temp = req.getRequestURL().toString().split("//");
        String[] val = temp[1].split("/");
        String mainURL = temp[0] +"//"+ val[0];
        String linkIMG = mainURL+"/files/"+file.getOriginalFilename();
        int tt = -1;
        if(tinhtrang.equals("on"))
            tt = 1;
        else
            tt = 0;

        SanPham sp = new SanPham(ten,gia,mota, tt, linkIMG);
        sp.setMenu(menuRepository.findById(1).get());
        sanPhamRepository.save(sp);

        resp.sendRedirect("/product/"+ sp.getID());
        return "index";
    }
    /*
    @GetMapping("/demo")
    @ResponseBody
    public List<Food> demoRepo(){
        return  (List<Food>) foodRepository.findAll();
    }
     */
}
