package com.javasampleapproach.restdata.model.validate;

import java.io.IOException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class FilmsValidate implements ConstraintValidator <Films, String> {

	@Override
	public void initialize(Films constraintAnnotation) {
		// TODO Auto-generated method stub
		//System.out.print("Hello World____"+constraintAnnotation);
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
        if (value == null) return false;
        OkHttpClient client = new OkHttpClient();
    	Request request = new Request.Builder()
    	    	  .url("http://swapi.co/api/planets?search="+value)
    	    	  .get()
    	    	  .build();

    	    	try {
    				Response response = client.newCall(request).execute();
    				String RestString = response.body().string();
    				long deco = RestString.indexOf("\"count\":0,");
    				System.out.println("______"+deco);
    				if(deco>=0){
    					System.out.println("no existe"+RestString);
    					return false;
    				}else {
    					System.out.println("esiste"+RestString);
    					return true;
    				}
    			} catch (IOException e1) {
    				System.out.println("ERROR:::"+e1);

    				e1.printStackTrace();
    			}
				

		return false;
	}


}
