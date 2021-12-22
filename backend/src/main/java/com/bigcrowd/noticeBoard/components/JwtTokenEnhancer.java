package com.bigcrowd.noticeBoard.components;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;

@Component
public class JwtTokenEnhancer implements TokenEnhancer {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Person person = personRepository.findByName(authentication.getName());
		
		System.out.println(person.getName());
		
		Map<String, Object> map = new HashMap<>();
		map.put("userName", person.getName());
		map.put("userId", person.getId());
		
		DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) accessToken;
		token.setAdditionalInformation(map);
		
		return accessToken;
	}

}
