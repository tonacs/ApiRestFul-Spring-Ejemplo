package com.tonacs.api.restservice.saludo;

public class Saludo {
	private final long id;
	private final String contentido;

	public Saludo(long id, String content) {
		this.id = id;
		this.contentido = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return contentido;
	}
}
