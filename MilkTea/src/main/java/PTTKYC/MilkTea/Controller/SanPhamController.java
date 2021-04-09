package PTTKYC.MilkTea.Controller;

import PTTKYC.MilkTea.Storage.StorageService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SanPhamController {
    private final StorageService storageService;

    public SanPhamController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/add-img/{id}")
    public String addImg(@RequestParam("file") MultipartFile file,
                         @PathVariable("id") Long id,
                         Model model,
                         HttpServletRequest req,
                         HttpServletResponse resp) throws IOException {
        /*
        storageService.store(file);
        Optional<> prs = productRepository.findById(id);
        if(prs.isPresent())
        {
            Product pr = prs.get();
            //  return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
            // "attachment; filename=\"" + file.getFilename() + "\"").body(file);
            String[] temp = req.getRequestURL().toString().split("//");
            String[] val = temp[1].split("/");
            String mainURL = temp[0] +"//"+ val[0];
            pr.setLinkImg(mainURL+"/files/"+file.getOriginalFilename());
            productRepository.save(pr);
        }
        resp.sendRedirect("/product/add-category/" + id);
        return "index";

         */
        return null;
    }
}
