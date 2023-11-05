
package data_sale_web.data_sale_web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import javax.swing.JOptionPane;

import lombok.var;
import lombok.extern.slf4j.Slf4j;
import scala.annotation.varargs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
    
@Controller
@Slf4j
public class Controller_initial {
    
/**
 * @param model
 * @return
 */
@GetMapping("/")
public String Initial(Model model) {
var person =new form();
var person2 =new form();



   


    return"index";
}


}
