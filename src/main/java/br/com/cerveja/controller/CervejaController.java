package br.com.cerveja.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cerveja.repository.CervejaRepository;
import br.com.cerveja.service.Cerveja;

@RestController
@RequestMapping("/v1/beer")
public class CervejaController {

	@Autowired
	private Cerveja cerveja;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, UUID> ListarCerveja(@RequestBody Cerveja cerveja) {
		
		return CervejaRepository.save();
		
	}

}
