package kr.co.sinsa.biz.customer.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sinsa.biz.customer.CartVO;
import kr.co.sinsa.biz.customer.ProductVO;
import kr.co.sinsa.biz.user.UserVO;

@Repository
public class CustomerDAO {

	@Autowired
	private SqlSessionTemplate SST;
	

	public List<CartVO> getCartList(UserVO user) {
		
		return SST.selectList("CustomerService.getCartList", user);
	}
	
	
	public List<ProductVO> getCartProductList(List<CartVO> cartList) {
		List<ProductVO> cartProductList = new ArrayList<ProductVO>();
		ProductVO productVO = new ProductVO();
		
	
		if(cartList != null) {
			if(cartList.size() != 0) {
				for(int i=0; i<cartList.size(); i++) {
					productVO.setPRD_NUM(cartList.get(i).getCART_PRDNUM());
					
					cartProductList.add(productVO);
					
				}
			}
			
		}
		
		return cartProductList;
		
	}
}