package com.invilliatest.rest.webservices.restfulwebservices.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {

	/*Url Versioning*/
	@GetMapping("/person/v1")
	public Person personV1() {
		return new Person("Fernando Salgueiro");
	}
	
	@GetMapping("/person/v2")
	public Personv2 personV2() {
		return new Personv2(new Name("Fernando","Salgueiro"));
	}
	
	/*Parameter Versioning*/
	@GetMapping(value = "/person/param", params = "version=1")
	public Person personParamV1() {
		return new Person("Fernando Salgueiro");
	}
	
	@GetMapping(value = "/person/param", params = "version=2")
	public Personv2 personParamV2() {
		return new Personv2(new Name("Fernando", "Salgueiro"));
	}
	
	/*Header Versioning*/
	@GetMapping(value = "/person/header", headers = "APPLICATION-VERSION=1")
	public Person personHeadersV1() {	
		return new Person("Fernando Salgueiro");
	}
	
	@GetMapping(value = "/person/header", headers = "APPLICATION-VERSION=2")
	public Personv2 personHeadersV2() {
		return new Personv2(new Name("Fernando", "Salgueiro"));
	}
	
	/*Mime type Versioning*/
	@GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
	public Person producesv1() {
		return new Person("Fernando Salgueiro");
	}
	
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v2+json")
	public Personv2 producesv2() {
		return new Personv2(new Name("Fernando", "Salgueiro"));
	}
}
