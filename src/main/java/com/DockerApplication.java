package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	static String work(){
		String token = "4a9da3ab-01f2-4cd1-8b85-0a295a71a497";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//headers.set("Authorization", String.format("X-CMC_PRO_API_KEY %s", token));
		headers.set("X-CMC_PRO_API_KEY","Bearer"+ token);

		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://pro-api.coinmarketcap.com/v1/content/posts/top";

		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> result =  restTemplate.exchange(uri, HttpMethod.GET,request,String.class);

		String json = result.getBody();
		System.out.println(json);

		String s = "" ;
		return  s;

	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
		work();
	}

}
