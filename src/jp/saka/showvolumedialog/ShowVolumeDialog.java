package jp.saka.showvolumedialog;

import android.app.Activity;
import android.os.Bundle;
import android.media.AudioManager;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class ShowVolumeDialog extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button b = (Button)findViewById(R.id.ShowVolumeDialogButton);
		b.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
				audio.adjustStreamVolume(AudioManager.STREAM_VOICE_CALL, AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI);
			}
		});
	}
}
