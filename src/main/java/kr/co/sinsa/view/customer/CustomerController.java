package kr.co.sinsa.view.customer;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sinsa.biz.customer.CartVO;
import kr.co.sinsa.biz.customer.CustomerService;
import kr.co.sinsa.biz.customer.ProductVO;
import kr.co.sinsa.biz.user.UserVO;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@SuppressWarnings("null")
	@RequestMapping("/cart.do")
	public String getCartList(Model model, HttpSession session) {
		
		UserVO user = (UserVO)session.getAttribute("user");
		
		System.out.println(user);
		
		List<CartVO> cartList = customerService.getCartList(user);
		model.addAttribute("cartList", cartList);
		
		
		System.out.println("456");
		
		
		List<ProductVO> productList = customerService.getCartProductList(cartList);
		System.out.println("789");
		
		model.addAttribute("productList", productList);
		
		
		return "cart";
	}
}
