package com.example.books.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "title", types = { Book.class })
public interface BookProjection {
	public String getTitleBook();
}