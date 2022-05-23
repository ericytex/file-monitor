package api.coseke.main;

import java.util.concurrent.Callable;
import api.coseke.main.runner.WatchFolder;

public class WatchCallable implements Callable<Void> {

	@Override
	public Void call() throws Exception {

		WatchFolder wf = new WatchFolder();
		try {
			wf.watchFolder();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return null;
	}

}

