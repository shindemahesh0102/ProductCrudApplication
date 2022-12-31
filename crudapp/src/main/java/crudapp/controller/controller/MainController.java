package crudapp.controller.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import crudapp.controller.dao.ProductDao;
import crudapp.controller.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products=productDao.getProducts();
		//add the product to model mapss
	//m.addAttribute("product"+products);
	m.addAttribute("products", products);
		return "index";
		
	}
	//show add product from
	@RequestMapping("/addproduct")
	public String addProduct(Model m ) {
		//passed the value to add product Product CRUD app replace
		m.addAttribute("title" , "Add Product");
	
		return "addProductfrom";
	
		
	}

	 //handled add product from
	 
	 @RequestMapping(value="/handleproduct", method= RequestMethod.POST) public
	 RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest
	  request ) {
		 System.out.println(product); 
		 productDao.createProduct(product);
	  
	  RedirectView redirectView=new
	 RedirectView(); redirectView.setUrl(request.getContextPath()+"/");
	  
	 return redirectView; }
	 //delete handler
	 @RequestMapping( "/delete/{productId}")
	 public RedirectView deleteProduct( @PathVariable("productId") int productId,HttpServletRequest request)
	 {
		 this.productDao.deleteProduct(productId);
		 RedirectView redirectView=new
				 RedirectView(); redirectView.setUrl(request.getContextPath()+"/");
				  
				 return redirectView;
	 }
	 @RequestMapping("/update/{productId}")
	 public String updateForm(@PathVariable("productId") int pid,Model model )
	 {
		Product product= this.productDao.getProduct(pid);
		model.addAttribute("product", product);
		 return "update_form";
	 }
	 
	 
	 
	 
	

}
