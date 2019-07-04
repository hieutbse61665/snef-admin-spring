package com.hieutb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {


    @GetMapping("/stores")
    public String stores() {
        return "stores";
    }

    @GetMapping("/accounts")
    public String accounts() {
        return "accounts";
    }

    @GetMapping("/foodcategories")
    public String foodcategories() {
        return "foodcategories";
    }

}
