package tacos.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Ezekiel Eromosei
 * @created: 17 May 2023
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

//    private OrderAdminService adminService;


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/deleteOrders")
    public String deleteAllOrders() {
//        adminService.deleteAllOrders();
        return "redirect:/admin";
    }

}
