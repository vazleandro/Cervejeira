package br.com.cerveja.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CervejaRepository {
	
	
	public static Map<String, UUID> save() {
		 Map<String, UUID> cervejaId = new HashMap<String, UUID>();
		 
		cervejaId.put("id", UUID.randomUUID());
		
		return cervejaId;

	}
	
}
