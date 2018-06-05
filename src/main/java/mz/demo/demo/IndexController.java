/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author NGUNGULO
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String pagina(){
    return "index";
    }
}
