/**
 * Copyright 2014-15 Arshad Ali Soomro,
 * http://source-code-android.blogspot.com/ Licensed under the Educational
 * Community License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License
 * at
 * 
 * http://www.osedu.org/licenses/ECL-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ali.arshad.soomro.openweathermap.androidsdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherInfo {
	private Coord coord;
	private Sys sys;
	private List<Weather> weather = new ArrayList<Weather>();
	private String base;
	private Main main;
	private Wind wind;
	private Clouds clouds;
	private Integer dt;
	private Integer id;
	private String name;
	private Integer cod;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Integer getDt() {
		return dt;
	}

	public void setDt(Integer dt) {
		this.dt = dt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public class Clouds {

		private Integer all;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Integer getAll() {
		return all;
		}

		public void setAll(Integer all) {
		this.all = all;
		}

		public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		}

		}
	
	public class Coord {

		private Double lon;
		private Double lat;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Double getLon() {
			return lon;
		}

		public void setLon(Double lon) {
			this.lon = lon;
		}

		public Double getLat() {
			return lat;
		}

		public void setLat(Double lat) {
			this.lat = lat;
		}

		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

	public class Main {

		private Double temp;
		private Double temp_min;
		private Double temp_max;
		private Double pressure;
		private Double sea_level;
		private Double grnd_level;
		private Integer humidity;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Double getTemp() {
			return temp;
		}

		public void setTemp(Double temp) {
			this.temp = temp;
		}

		public Double getTemp_min() {
			return temp_min;
		}

		public void setTemp_min(Double temp_min) {
			this.temp_min = temp_min;
		}

		public Double getTemp_max() {
			return temp_max;
		}

		public void setTemp_max(Double temp_max) {
			this.temp_max = temp_max;
		}

		public Double getPressure() {
			return pressure;
		}

		public void setPressure(Double pressure) {
			this.pressure = pressure;
		}

		public Double getSea_level() {
			return sea_level;
		}

		public void setSea_level(Double sea_level) {
			this.sea_level = sea_level;
		}

		public Double getGrnd_level() {
			return grnd_level;
		}

		public void setGrnd_level(Double grnd_level) {
			this.grnd_level = grnd_level;
		}

		public Integer getHumidity() {
			return humidity;
		}

		public void setHumidity(Integer humidity) {
			this.humidity = humidity;
		}

		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

	public class Sys {

		private Double message;
		private String country;
		private Integer sunrise;
		private Integer sunset;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Double getMessage() {
			return message;
		}

		public void setMessage(Double message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Integer getSunrise() {
			return sunrise;
		}

		public void setSunrise(Integer sunrise) {
			this.sunrise = sunrise;
		}

		public Integer getSunset() {
			return sunset;
		}

		public void setSunset(Integer sunset) {
			this.sunset = sunset;
		}

		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

	public class Weather {

		private Integer id;
		private String main;
		private String description;
		private String icon;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

	public class Wind {

		private Double speed;
		private Double deg;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		public Double getSpeed() {
			return speed;
		}

		public void setSpeed(Double speed) {
			this.speed = speed;
		}

		public Double getDeg() {
			return deg;
		}

		public void setDeg(Double deg) {
			this.deg = deg;
		}

		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

	}

}
