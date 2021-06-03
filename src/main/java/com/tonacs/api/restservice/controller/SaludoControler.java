package com.tonacs.api.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tonacs.api.restservice.saludo.Saludo;

@RestController
public class SaludoControler {

	private static final String template = "Hola , %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/saludo")
	public Saludo saludo(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return new Saludo(counter.incrementAndGet(), String.format(template, name));
	}
}
