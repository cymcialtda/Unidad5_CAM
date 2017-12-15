package com.lds.soap;

import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.lds.soap.GlobalWeatherStub.GetCitiesByCountry;
import com.lds.soap.GlobalWeatherStub.GetCitiesByCountryResponse;
import com.lds.soap.GlobalWeatherStub.GetWeather;
import com.lds.soap.GlobalWeatherStub.GetWeatherResponse;

@Path("servlet")
public class Endpoint {
	@GET
	@Path("/ciudad/{ciudad}")
	@Produces("text/plain")
	public String servlet3(@PathParam("ciudad") String identificador) throws RemoteException {
		
		GlobalWeatherStub globalWeatherStub = new GlobalWeatherStub();
		GetCitiesByCountry getCitiesByCountry = new GetCitiesByCountry();
		getCitiesByCountry.setCountryName(identificador);
		GetCitiesByCountryResponse getCitiesByCountryResponse = globalWeatherStub.getCitiesByCountry(getCitiesByCountry);
		//System.out.println(getCitiesByCountryResponse.getGetCitiesByCountryResult());

		return getCitiesByCountryResponse.getGetCitiesByCountryResult();
		
		/*GetWeather getWeather = new GetWeather();
		getWeather.setCityName("Medellin");
		getWeather.setCountryName("Colombia");
		
		GetWeatherResponse getWeatherResponse = globalWeatherStub.getWeather(getWeather);
		System.out.println(getWeatherResponse.getGetWeatherResult());
		
		
		return "hola servlet 3 + " + identificador;*/
	}
}
