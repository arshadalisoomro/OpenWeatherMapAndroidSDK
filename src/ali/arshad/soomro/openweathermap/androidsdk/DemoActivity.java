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

import ali.arshad.soomro.openweathermapandroidsdk.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DemoActivity extends Activity {

	protected Button button = null;
	protected EditText editText = null;
	protected TextView textView = null;
	protected ImageView imageView = null;
	protected WeatherUtil mapUtil = null;
	protected ProgressDialog progressDialog = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		editText = (EditText) findViewById(R.id.editText1);
		textView = (TextView) findViewById(R.id.textView1);
		imageView = (ImageView) findViewById(R.id.imageView1);
		mapUtil = WeatherUtil.newInstance();
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new AsyncTask<String, Void, WeatherInfo>() {
					@Override
					protected void onPreExecute() {
						progressDialog = new ProgressDialog(DemoActivity.this);
						progressDialog.setTitle("Wait...");
						progressDialog.setMessage("Data is being loaded...");
						progressDialog.show();
					}

					@Override
					protected WeatherInfo doInBackground(String... params) {

						return mapUtil.getCurrentWeatherByCityName(
								DemoActivity.this, editText.getText()
										.toString());
					}

					@Override
					protected void onPostExecute(WeatherInfo result) {

						textView.setText(result.getName() + "\n"
								+ result.getWeather().get(0).getDescription()
								+ "\n" + result.getWeather().get(0).getIcon()
								+ "\n" + result.getMain().getHumidity());
						imageView.setImageBitmap(mapUtil.getIconBitmap(result));
						progressDialog.dismiss();
					}
				}.execute(null, null, null);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
