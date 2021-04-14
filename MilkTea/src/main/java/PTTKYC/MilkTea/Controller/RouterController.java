package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Entity.SanPham;
import PTTKYC.MilkTea.Repository.SanPhamRepository;
import PTTKYC.MilkTea.Repository.TaiKhoanRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RouterController {
    private final SanPhamRepository sanPhamRepository;
    private final TaiKhoanRepository taiKhoanRepository;

    @GetMapping("/access-denied")
    public String errorPage(Model model){
        return "error";
    }
    public RouterController(SanPhamRepository sanPhamRepository, TaiKhoanRepository taiKhoanRepository) {
        this.sanPhamRepository = sanPhamRepository;
        this.taiKhoanRepository = taiKhoanRepository;
    }

    @GetMapping("/")
    public String indexPage(Model model){
        model.addAttribute("products",sanPhamRepository.findAll(PageRequest.of(0,6)));
        model.addAttribute("others",sanPhamRepository.findAll(PageRequest.of(0,12)));
        return "index";
    }
    @GetMapping("/user")
    public String viewUser(HttpServletResponse response) throws IOException {
        response.sendRedirect("/");
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
        model.addAttribute("products",sanPhamRepository.findAll(PageRequest.of(0,10)));
        return "item_single";
    }

    @GetMapping("/admin/manage/product")
    public String viewPageProduct(Model model){
        model.addAttribute("products",sanPhamRepository.findAllByOrderByIDDesc());
        return "listings";
    }
    @GetMapping("/Menu")
    public String viewMenu(Model model){
        model.addAttribute("products",sanPhamRepository.findAllByTinhTrangOrderByIDDesc(1));
        return "Menu";
    }

    @GetMapping("/admin/edit/product/{id}")
    public String viewEditPr(@PathVariable("id") int id,
                             Model model){

        SanPham pr = sanPhamRepository.findById(id).get();
        boolean tt = true;
        if (pr.getTinhTrang() == 0)
                tt = false;
        model.addAttribute("product",pr);
        model.addAttribute("tinhtrang",tt);
        model.addAttribute("action","/admin/edit/product/"+id);
        return "add/edit";
    }
    @GetMapping("/admin/manage/product/addStatus=true")
    public String viewPageProductAddSuccess(Model model){
        model.addAttribute("message","Thêm sản phẩm thành công");
        model.addAttribute("info",true);
        model.addAttribute("products",sanPhamRepository.findAllByOrderByIDDesc());
        return "listings";
    }
    @GetMapping("/admin/manage/product/deleteStatus=success")
    public String viewPageProductDeleteSuccess(Model model){
        model.addAttribute("products",sanPhamRepository.findAllByOrderByIDDesc());
        model.addAttribute("message","Xóa sản phẩm thành công");
        model.addAttribute("info",true);
        return "listings";
    }
    @GetMapping("/admin/manage/product/editStatus=true")
    public String viewPageProductEditSuccess(Model model){
        model.addAttribute("message","Cập nhật sản phẩm thành công");
        model.addAttribute("info",true);
        model.addAttribute("products",sanPhamRepository.findAllByOrderByIDDesc());
        return "listings";
    }
    @GetMapping("/admin/manage/accounts")
    public String viewAccount(Model model){
        model.addAttribute("accounts",taiKhoanRepository.findAll());
        return "manage_account";
    }
}
