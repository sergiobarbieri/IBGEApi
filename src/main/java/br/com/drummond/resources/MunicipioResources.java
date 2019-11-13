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

import br.com.drummond.domain.Municipio;
import br.com.drummond.domain.Uf;
import br.com.drummond.repository.MunicipioRepository;
import br.com.drummond.repository.UfRepository;

@RestController
@CrossOrigin
public class MunicipioResources {
	
	@Autowired
	UfRepository ufRepository;
	
	@Autowired
	MunicipioRepository municipioRepository;

	@RequestMapping(value = "/ufs", method = RequestMethod.GET)
	public ResponseEntity<List<Uf>> obterUf() {
		// trocar domain
		List<Uf> ufs; 
		

		ufs = ufRepository.findByOrderByUfDescricao();
		if (ufs.isEmpty())
			return new ResponseEntity<List<Uf>>(ufs, HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Uf>>(ufs, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/municipios/{ufSigla}", method = RequestMethod.GET)
	public ResponseEntity<List<Municipio>> obterMunicipio(@PathVariable("ufSigla") String ufSigla ) {
		
		List<Municipio> municipios; 
		
		municipios = municipioRepository.findByUfSiglaOrderByNome(ufSigla);
		if (municipios.isEmpty())
			return new ResponseEntity<List<Municipio>>(municipios, HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Municipio>>(municipios, HttpStatus.OK);
	}
}
