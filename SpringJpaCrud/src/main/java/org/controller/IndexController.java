package org.controller;

import java.util.List;

import org.pojo.Idiot;
import org.service.IdiotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController 
{
	@Autowired
	private IdiotService idiotService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model)
	{
 		model.addAttribute("idiot", new Idiot());
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register (@ModelAttribute("idiot") Idiot idiot)
	{
		
		idiotService.addIdiot(idiot);
		
		return "redirect:/listIdiots";
	}
	
	@RequestMapping("listIdiots")
	public ModelAndView listIdiots(ModelAndView mv)
	{
		List<Idiot> listidiots = idiotService.getAllIdiots();
		mv.addObject("listidiots",listidiots);
		mv.setViewName("AllIdiots.jsp");
		return mv;
	}
	
	@RequestMapping("/editById/{id}")
	public ModelAndView findIdiotById(@PathVariable("id") int id)
	{ 
		ModelAndView mv = new ModelAndView();
		
		Idiot idiot = idiotService.getIdiotById(id);
		
		mv.addObject("idiot",idiot);
		mv.setViewName("/editById.jsp");
		//mv.setViewName("/index.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="updateIdiot", method=RequestMethod.POST)
	public String updateIdiot(@ModelAttribute("idiot") Idiot idiot)
	{
		idiotService.updateIdiot(idiot);
		return "redirect:/listIdiots";
	}
	
	@RequestMapping("/deleteById/{id}")
	public String  deleteById(@PathVariable("id") int id)
	{
		System.out.println("In in delete");
		idiotService.deleteById(id);
		System.out.println("Delete Done");
		return "redirect:/listIdiots";
	}
	
	public void setIdiotservice(IdiotService idiotService) {
		this.idiotService = idiotService;
	}
	
}
