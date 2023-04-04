/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudStructure.Controller;

import com.example.CrudStructure.Models.personnel;
import com.example.CrudStructure.Services.personnelService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author hp
 */
@Controller
public class AppController {
  @Autowired
  private  personnelService service;
  @RequestMapping("/")
   public String viewHomePage(Model model){
       List<personnel> listpersonnels=service.listAll();
       model.addAttribute("listpersonnels",listpersonnels);
   return "index";
   }  
   
   @RequestMapping("/new")
   public String ShowNewPersonnelForm(Model model){
   personnel personnel=new personnel();
       model.addAttribute("personnel",personnel);
     return"addFrom";
   }
    @RequestMapping(value="/save",method=RequestMethod.POST)
   public String savePersonnel(@ModelAttribute("personnel") personnel personnel){
   service.save(personnel);
   return "redirect:/";
   }
   @RequestMapping("/edit/{id}")
    public ModelAndView ShowEditPersonnelForm(@PathVariable(name="id") Long id ){
    ModelAndView mav =new ModelAndView("editForm");
    personnel personnel=service.get(id);
    mav.addObject("personnel",personnel);
     return mav;
   }
     @RequestMapping("/delete/{id}")
    public String deletePersonnel(@PathVariable(name="id") Long id ){
    service.delete(id);
       return "redirect:/";
    
    }
}
