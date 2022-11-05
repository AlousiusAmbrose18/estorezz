package com.jsp.estorezz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.estorezz.Entity.BrandInfo;
import com.jsp.estorezz.Service.BrandService;
import com.jsp.estorezz.util.AppConstants;
import com.jsp.estorezz.util.AppResponse;

@RestController
@RequestMapping(value=AppConstants.FORWORD_SLASH)
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@PostMapping(value=AppConstants.BRAND_INFO_SAVE)
	public @ResponseBody  AppResponse saveBrandInfo(@RequestBody BrandInfo brandInfo)
	{
		return	brandService.saveBrandInfo(brandInfo);
	}
	
	@GetMapping(value=AppConstants.BRAND_FINDALL)
	public @ResponseBody  AppResponse findAllBrand()
	{
		return	brandService.findAllBrand();
	}
	
	
	@GetMapping(value=AppConstants.BRAND_FIND_BY_CEONAME)
	public @ResponseBody  AppResponse findByCeoName(@RequestHeader("ceoName") String ceoName)
	{
		return	brandService.findByCeoName(ceoName);
	}
	
	@GetMapping(value=AppConstants.BRAND_FIND_BY_BRAND_NAME)
	public @ResponseBody  AppResponse findByBrandName(@RequestHeader("brandName") String brandName)
	{
		return	brandService.findByBrandName(brandName);
	}
	
	
	@RequestMapping(value=AppConstants.BRAND_VALUE_UPDATE_BY_NAME)
	public @ResponseBody  AppResponse updateBrandValueByName(@RequestHeader("brandName")String brandName, @RequestHeader("brandValue")  String brandValue)
	{
		return	brandService.updateBrandValueByName(brandName,brandValue);
	}
	
	@RequestMapping(value=AppConstants.DELETE_BRAND_BY_NAME)
	public @ResponseBody  AppResponse deleteBrandByName(@RequestHeader("brandName") String brandName)
	{
		return	brandService.deleteBrandByName(brandName);
	}
	
	
	
	
	
	
}
