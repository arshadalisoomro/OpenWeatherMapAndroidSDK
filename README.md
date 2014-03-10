OpenWeatherMapAndroidSDK
========================

An Android SK for http://openweathermap.org, makes use of "The OpenWeatherMap service" which provides 
free weather data suitable for any cartographic services like web and smartphones applications (this Service can provide weather information in 17+ languages of world), for futher details please visit http://openweathermap.org/API, page.

####Note:
This SDK only makes use of http://openweathermap.org/API#weather, and format of resonse is in ```JSON```, to parse json data we are using ```Gson``` parsing.

Version
----

1.0


Usage
--------------
There is a demo Application which simply demonstrates how to use this SDK, following are some useful methods of 
```WeatherUtil``` class to get the job done.

```java
getCurrentWeatherByCityName(Context context,String city) // get weather info by city name
getCurrentWeatherByCityID(Context context, String cityId)// get weather info by city ID
getCurrentWeatherByCityLatLon(Context context, String latLon)// get weather info by city Geo Position comma seprated values of lat,lon.
```
there are other three methods with Language parameter.

Developer
----
Arshad Ali Soomro arshadalisoomro7@gmail.com
License
----
Copyright 2014-15 Arshad Ali Soomro,
  http://source-code-android.blogspot.com 
  
  Licensed under the
  Educational Community License, Version 2.0 (the "License"); you may
  not use this file except in compliance with the License. You may
  obtain a copy of the License at
 
 http://www.osedu.org/licenses/ECL-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an "AS IS"
 BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 or implied. See the License for the specific language governing
 permissions and limitations under the License. 
    
