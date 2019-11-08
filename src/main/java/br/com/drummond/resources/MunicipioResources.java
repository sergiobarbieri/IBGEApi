package br.com.drummond.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.drummond.domain.Uf;

import br.com.drummond.repository.UfRepository;

@RestController
@CrossOrigin
public class MunicipioResources {
	
	@Autowired
	UfRepository ufRepository;

	@RequestMapping(value = "/ufs", method = RequestMethod.GET)
	public ResponseEntity<List<Uf>> obterUf() {
		// trocar domain
		List<Uf> ufs; 
		

		ufs = ufRepository.findAll();
		if (ufs.isEmpty())
			return new ResponseEntity<List<Uf>>(ufs, HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Uf>>(ufs, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/municipios/{uf}", method = RequestMethod.GET)
	public ResponseEntity<List<Uf>> obterMunicipio(@PathVariable("uf") String uf ) {
		
		List<Uf> ufs; 
		
		ufs = ufRepository.findAll();
		if (ufs.isEmpty())
			return new ResponseEntity<List<Uf>>(ufs, HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Uf>>(ufs, HttpStatus.OK);
	}
}
