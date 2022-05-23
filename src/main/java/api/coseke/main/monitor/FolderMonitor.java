package api.coseke.main.monitor;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import api.coseke.main.reader.FileReaderCompo;

public class FolderMonitor {
public static void fileMonitor() throws Throwable {
		
//		final String FOLDER_NAME = "C:/Users/HERMAN MUHEREZA/Documents/Batch057";
		final String FILE_NAME = "C:/Users/HERMAN MUHEREZA/Documents/Batch057/info";
		
//		Scanner myObj = new Scanner(System.in);
//		String FOLDER_NAME = null;
//		System.out.println("Enter Folder path: "); 
//		FOLDER_NAME = myObj.nextLine();
//		
//		Scanner myObj1 = new Scanner(System.in);
//		String FILE_NAME = null;
//		System.out.println("Enter File path: "); 
//		FILE_NAME = myObj1.nextLine();
//		
        int count = 0;

		
		try {System.out.println("Watching directory for changes in the info file");
			WatchService watchService = FileSystems.getDefault().newWatchService();
			Path directory = Paths.get("");
			WatchKey watchKey = directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);

			while (true) {
				for (WatchEvent<?> event : watchKey.pollEvents()) {
					@SuppressWarnings("unchecked")
					WatchEvent<Path> pathEvent = (WatchEvent<Path>) event;
					Path fileName = pathEvent.context();
					WatchEvent.Kind<?> kind = event.kind();

					if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
						System.out.println("Info file has been created : " + fileName);
						FileReaderCompo fileReaderCompo = new FileReaderCompo();
						fileReaderCompo.readInfoFileData(FILE_NAME);
					}

					if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
						System.out.println("The info file has been deleted: " + fileName);
					}
					
					if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
						System.out.println("The info file has been modified: " + fileName);
						
						if (count%2==0) {
							FileReaderCompo fileReaderCompo2 = new FileReaderCompo();
							fileReaderCompo2.readInfoFileData(FILE_NAME);
						}
					}
				}

				boolean valid = watchKey.reset();
				if (!valid) {
					System.out.println("Key has been unregistered");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
