package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.entities.concretes.ActivationCode;


@RestController
@RequestMapping
public class ActivationsCodeController{
	 private ActivationCodeService activationCodeService;

	 
	 @Autowired
	public ActivationsCodeController(ActivationCodeService activationCodeService) {
		super();
		this.activationCodeService = activationCodeService;
	}
	 
	 @GetMapping("/getall")
	 public List<ActivationCode> getAll(){
		 return this.activationCodeService.getAll();
	 }

	
	
	
	
	 
}
