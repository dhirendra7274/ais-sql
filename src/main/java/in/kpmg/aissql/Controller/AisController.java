package in.kpmg.aissql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kpmg.aissql.Model.Ais;
import in.kpmg.aissql.Service.AisService;
import in.kpmg.aissql.customExceptions.BusinessException;
import in.kpmg.aissql.customExceptions.ControllerException;

@RestController
@RequestMapping("/api")
public class AisController {

	
	@Autowired
	private AisService aisService;

	
	
	@PostMapping("/form")
	public ResponseEntity<Ais> saveAiss(@RequestBody Ais ais){
		return new ResponseEntity<Ais>(aisService.saveAis(ais), HttpStatus.CREATED);
	}
	
		
	@PostMapping("/add")                                                           //Save the form data
	public ResponseEntity<?> saveAis(@RequestBody Ais ais){

		try{Ais aiss=aisService.saveAis(ais);
		return new ResponseEntity<Ais>(aiss, HttpStatus.CREATED);}

		catch(BusinessException e) {                                               //catch Service layer exception
			ControllerException ce= new ControllerException(e.getErrorCode(),e.getErrroMessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);}

		catch(Exception e) {
			ControllerException cc= new ControllerException("611","Something wrong in Controller layer");
			return new ResponseEntity<ControllerException>(cc, HttpStatus.BAD_REQUEST);}

		}
		
	}

	
	
