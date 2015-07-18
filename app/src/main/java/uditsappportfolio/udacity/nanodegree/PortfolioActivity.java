package uditsappportfolio.udacity.nanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import uditsappportfolio.udacity.nanodegree.R;

public class PortfolioActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_portfolio);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_portfolio, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void onClickCapstoneMyOwnApp(View view) {
		showToast(getResources().getString(R.string.capstone_my_own_app));
	}

	public void onClickBuildItBigger(View view) {
		showToast(getResources().getString(R.string.build_it_bigger));
	}

	public void onClickLibraryApp(View view) {
		showToast(getResources().getString(R.string.library_app));
	}

	public void onClickScoresApp(View view) {
		showToast(getResources().getString(R.string.scores_app));
	}

	public void onClickSpotifySteamer(View view) {
		showToast(getResources().getString(R.string.spotify_steamer));
	}

	public void onClickXYZReader(View view) {
		showToast(getResources().getString(R.string.xyz_reader));
	}

	public void showToast(String displayMessage) {
		Toast.makeText(this, getResources().getString(R.string.portfolio_toast_message_TEMPLATE, displayMessage),
			Toast.LENGTH_SHORT).show();
	}
}
