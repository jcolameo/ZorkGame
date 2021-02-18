package ch.bbw.zork;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Hier wird ein Timer erstellt
 * @author Jeremy Colameo
 *
 */
public class CountDown {

	public static interface TimerDone {
		public void finish();
	}

	private Timer timer;
	private TimerDone done;

	public CountDown(TimerDone done, long delay) {
		this.timer = new Timer();
		this.timer.schedule(new CountdownTimer(), delay);
		this.done = done;
	}

	class CountdownTimer extends TimerTask {

		public void run() {
			done.finish();
		}
	}
}
