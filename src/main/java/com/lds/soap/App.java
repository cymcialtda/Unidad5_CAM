package com.lds.soap;

import java.rmi.RemoteException;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.lds.soap.GlobalWeatherStub.GetCitiesByCountry;
import com.lds.soap.GlobalWeatherStub.GetCitiesByCountryResponse;
import com.lds.soap.GlobalWeatherStub.GetWeather;
import com.lds.soap.GlobalWeatherStub.GetWeatherResponse;

@ApplicationPath("/rest")
public class App extends Application {

//	public static void main(String[] args) throws RemoteException {
//
//		GlobalWeatherStub globalWeatherStub = new GlobalWeatherStub();
//		GetCitiesByCountry getCitiesByCountry = new GetCitiesByCountry();
//		getCitiesByCountry.setCountryName("Colombia");
//		GetCitiesByCountryResponse getCitiesByCountryResponse = globalWeatherStub.getCitiesByCountry(getCitiesByCountry);
//		System.out.println(getCitiesByCountryResponse.getGetCitiesByCountryResult());
//
//		GetWeather getWeather = new GetWeather();
//		getWeather.setCityName("Medellin");
//		getWeather.setCountryName("Colombia");
//		
//		GetWeatherResponse getWeatherResponse = globalWeatherStub.getWeather(getWeather);
//		System.out.println(getWeatherResponse.getGetWeatherResult());
//	}
}
