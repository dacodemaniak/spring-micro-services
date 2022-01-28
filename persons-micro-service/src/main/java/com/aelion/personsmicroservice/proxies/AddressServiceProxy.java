package com.aelion.personsmicroservice.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aelion.personsmicroservice.dto.AddressDto;

@FeignClient(name="address-service")
public interface AddressServiceProxy {
	@GetMapping("/api/address/{id}")
	public AddressDto retrieveAdress(
		@PathVariable("id") String id
	);
}
