package in.kpmg.aissql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kpmg.aissql.Model.Ais;
import in.kpmg.aissql.Repository.AisRepository;
import in.kpmg.aissql.customExceptions.BusinessException;

@Service
public class AisService{
	
	@Autowired
	private AisRepository aisRepository;

	public Ais saveAis(Ais ais) {
		
		
	
	
	try {
		Ais aiss=aisRepository.save(ais);
		return aiss;
	}
	catch(IllegalArgumentException e) {

		throw new BusinessException("602","No Data Provided");
	}
	catch(Exception e) {

		throw new BusinessException("603","Something Wrong in ServiceLayer" + e.getMessage() );
	}

}}

