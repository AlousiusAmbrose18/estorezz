package com.jsp.estorezz.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.estorezz.Entity.BrandInfo;
import com.jsp.estorezz.Repository.BrandRepo;
import com.jsp.estorezz.util.AppResponse;

import antlr.collections.List;

@Service
public class BrandService {
	
	@Autowired
	private BrandRepo brandRepo;
	
	
	
	
	public AppResponse saveBrandInfo(BrandInfo brandInfo)
	{
		AppResponse appResponse =null;		
		try {
			brandRepo.saveBrandInfo(brandInfo);
			appResponse = new AppResponse("Success","200", null, brandInfo);
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), brandInfo);
		}
		return appResponse;
	}
	
	public AppResponse findAllBrand() {
		AppResponse appResponse =null;		
		try {
		  	ArrayList<BrandInfo> list=brandRepo.findAllBrand();
			appResponse = new AppResponse("Success","200", null, list);	
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), null);
		}
		return appResponse;
	}
	
	public AppResponse findByCeoName(String ceoName) {
		AppResponse appResponse =null;		
		try {
		  	BrandInfo brandInfo =	brandRepo.findByCeoName(ceoName);
			appResponse = new AppResponse("Success","200", null, brandInfo);	
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), null);
		}
		return appResponse;
	}
	
	public AppResponse findByBrandName(String brandName) {
		AppResponse appResponse =null;		
		try {
		  	BrandInfo brandInfo =	brandRepo.findByBrandName(brandName);
			appResponse = new AppResponse("Success","200", null, brandInfo);	
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), null);
		}
		return appResponse;
	}
	
	public AppResponse updateBrandValueByName(String brandName, String brandValue) {
		AppResponse appResponse =null;		
		try {
		  	BrandInfo brandInfo =	brandRepo.updateBrandValueByName(brandName,brandValue);
		  	
			appResponse = new AppResponse("Success","200", null, brandInfo);	
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), null);
		}
		return appResponse;
	}
	
	
	public AppResponse deleteBrandByName(String brandName) {
		AppResponse appResponse =null;		
		try {
		  	brandRepo.deleteBrandByName(brandName);
		  	
			appResponse = new AppResponse("Success","200", null, null);	
		} catch (Exception e) {			
			appResponse = new AppResponse("faild", "400", e.getMessage(), null);
		}
		return appResponse;
	}
	
	
	
	
	
	
	
	

}
