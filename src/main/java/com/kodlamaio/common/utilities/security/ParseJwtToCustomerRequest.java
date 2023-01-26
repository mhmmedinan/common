package com.kodlamaio.common.utilities.security;

import org.springframework.security.oauth2.jwt.Jwt;

import com.kodlamaio.common.utilities.dto.CustomerRequest;

public class ParseJwtToCustomerRequest {

	public static CustomerRequest getCustomerInformation(Jwt jwt) {
		CustomerRequest customerRequest = new CustomerRequest();
        customerRequest.setCustomerId(jwt.getClaimAsString("sub"));
        customerRequest.setCustomerUserName(jwt.getClaimAsString("preferred_username"));
        customerRequest.setCustomerFirstName(jwt.getClaimAsString("given_name"));
        customerRequest.setCustomerLastName(jwt.getClaimAsString("family_name"));
        customerRequest.setCustomerEmail(jwt.getClaimAsString("email"));
        return customerRequest;
	}
}
