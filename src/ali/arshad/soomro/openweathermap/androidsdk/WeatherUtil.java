/** Copyright [2014-15] [Arshad Ali Soomro,
 *  http://source-code-android.blogspot.com/] Licensed under the
 *  Educational Community License, Version 2.0 (the "License"); you may
 *  not use this file except in compliance with the License. You may
 *  obtain a copy of the License at
 *  
 *  http://www.osedu.org/licenses/ECL-2.0
 * 
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License. */
package ali.arshad.soomro.openweathermap.androidsdk;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.google.gson.Gson;

public class WeatherUtil {

	protected final String URL_NAME = "http://api.openweathermap.org/data/2.5/weather?q=";
	protected final String URL_ID = "http://api.openweathermap.org/data/2.5/weather?id=";
	protected final String URL_GEO_CO = "http://api.openweathermap.org/data/2.5/weather?lat=";
	protected final String ICO_URI = "http://openweathermap.org/img/w/";
	protected final String GEO_CO = "&lon=";
	protected final String UNIT = "&units=metric";
	protected final String MODE = "&mode=json";
	protected final String LANG = "&lang=";
	protected JSONObject jsonObject = null;

	public static WeatherUtil newInstance() {

		return new WeatherUtil();
	}

	public WeatherInfo getCurrentWeatherByCityName(Context context,
			String city) {
		WeatherInfo model = new WeatherInfo();
		try {

			Gson gson = new Gson();
			model = gson.fromJson(weatherByCityName(context, city), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public WeatherInfo getCurrentWeatherByCityID(Context context,
			String cityId) {
		WeatherInfo model = new WeatherInfo();
		try {
			Gson gson = new Gson();
			model = gson.fromJson(weatherById(context, cityId), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public WeatherInfo getCurrentWeatherByCityLatLon(Context context,
			String latLon) {
		WeatherInfo model = new WeatherInfo();
		try {
			Gson gson = new Gson();
			model = gson.fromJson(weatherByGeoCo(context, latLon), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public WeatherInfo getCurrentWeatherByCityName(Context context,
			String city, String language) {
		WeatherInfo model = new WeatherInfo();
		try {
			Gson gson = new Gson();
			model = gson.fromJson(weatherByCityName(context, city, language), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public WeatherInfo getCurrentWeatherByCityID(Context context,
			String cityId, String language) {
		WeatherInfo model = new WeatherInfo();
		try {
			Gson gson = new Gson();
			model = gson.fromJson(weatherById(context, cityId, language), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public WeatherInfo getCurrentWeatherByCityLatLon(Context context,
			String latLon, String language) {
		WeatherInfo model = new WeatherInfo();
		try {
			Gson gson = new Gson();
			model = gson.fromJson(weatherByGeoCo(context, latLon, language), WeatherInfo.class);
			return model;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private String weatherByCityName(Context context, String city)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_NAME);
		url.append(city);
		url.append(UNIT);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;

		} else {
			return null;
		}
	}

	private String weatherById(Context context, String id)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_ID);
		url.append(id);
		url.append(UNIT);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;
		} else {
			return null;
		}
	}

	private String weatherByGeoCo(Context context, String latLon)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_GEO_CO);
		String[] latLonValue = latLon.trim().split("\\s*,\\s*");
		url.append(latLonValue[0]);
		url.append(GEO_CO);
		url.append(latLonValue[1]);
		url.append(UNIT);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;
		} else {
			return null;
		}
	}

	private String weatherByCityName(Context context, String city, String language)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_NAME);
		url.append(city);
		url.append(UNIT);
		url.append(LANG);
		url.append(language);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;
		} else {
			return null;
		}
	}

	private String weatherById(Context context, String id, String language)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_ID);
		url.append(id);
		url.append(UNIT);
		url.append(LANG);
		url.append(language);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;
		} else {
			return null;
		}
	}

	private String weatherByGeoCo(Context context, String latLon, String language)
			throws ClientProtocolException, IOException {
		HttpClient httpClient = null;
		StringBuilder url = new StringBuilder(URL_GEO_CO);
		String[] latLonValue = latLon.trim().split("\\s*,\\s*");
		url.append(latLonValue[0]);
		url.append(GEO_CO);
		url.append(latLonValue[1]);
		url.append(UNIT);
		url.append(LANG);
		url.append(language);
		HttpGet httpRequest = new HttpGet(url.toString());
		httpClient = new DefaultHttpClient();
		HttpResponse httpResponse = httpClient.execute(httpRequest);
		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode == 200) {
			HttpEntity httpEntity = httpResponse.getEntity();
			String josnDataString = EntityUtils.toString(httpEntity);
			return josnDataString;
		} else {
			return null;
		}
	}

	public Bitmap getIconBitmap(WeatherInfo uri){
		StringBuilder imgUri = new StringBuilder(ICO_URI);
		imgUri.append(uri.getWeather().get(0).getIcon());
		Bitmap imgIcon = null;

		InputStream in;
		try {
			in = new java.net.URL(imgUri.toString()).openStream();
			imgIcon = BitmapFactory.decodeStream(in);
			return imgIcon;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
}
