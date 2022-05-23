package api.coseke.main.runner;

import api.coseke.main.monitor.FolderMonitor;

public class WatchFolder {
	public static void main(String args[]) throws Throwable {	
		 watchFolder();
	}

	public static void watchFolder() throws Throwable {
		FolderMonitor.fileMonitor();	
	}
}
