package com.javasampleapproach.restdata.model.validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class GetPlanet {

	public static final MediaType JSON
    = MediaType.parse("application/json; charset=utf-8");

	/*@GET("/users")
    public Call<List<Films>> getUsers();
	*/
	OkHttpClient client = new OkHttpClient();
	
	/*public JSONObject GetAPP(String url) throws IOException {
	  Request request = new Request.Builder()
	      .url(url)
	      .get()
	      .build();
	  Response response = client.newCall(request).execute();
	  return response.body().string();
	}*/
    public static void main(String[] args) {
 
/*        HttpUrl route = HttpUrl.parse("/users");
        Request request = new Request.Builder().url(route).get().build();
        return Unchecked.supplier(() -> {
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    List<User> users = Json.serializer().fromInputStream(response.body().byteStream(), User.listTypeRef());
                    return users;
                }
                throw HttpClient.unknownException(response);
            }
        }).get();
        */
        
        
  	      	OkHttpClient client = new OkHttpClient();

    	Request request = new Request.Builder()
    	  .url("http://swapi.co/api/planets?search=Alderaanw")
    	  .get()
    	  .build();

    	try {
			Response response = client.newCall(request).execute();
			long deco = response.body().string().indexOf("\"count\":0,");
			System.out.println("______"+deco);
			if(deco>0){
				System.out.println("existe");
				
			}else {
				System.out.println("no esiste");
			}
		} catch (IOException e1) {
			System.out.println("ERROR:::"+e1);

			e1.printStackTrace();
		}
    	/*
    	try {
			HttpResponse<JsonNode> response = Unirest.get("http://swapi.co/api/planets?search=Alderaan")
					  .header("cache-control", "no-cache")
					  .header("postman-token", "2bd93029-f29e-3897-5249-390a873bb299")
					  .asJson();
			System.out.println("TTTTT"+response.getBody() );
		} catch (UnirestException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	*/
        URL url;
        try {
            // Creando un objeto URL
            url = new URL("https://swapi.co/api/planets/?format=json&search=Alderaan");
 
            // Realizando la petición GET
            URLConnection con = url.openConnection();
 
            // Leyendo el resultado
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
 
            String linea;
            while ((linea = in.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
 
    }
}