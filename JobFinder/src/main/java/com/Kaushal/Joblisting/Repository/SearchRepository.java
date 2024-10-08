package com.Kaushal.Joblisting.Repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Kaushal.Joblisting.model.Post;

@Component
public interface SearchRepository 
{
	List<Post> findByText(String text);
}
