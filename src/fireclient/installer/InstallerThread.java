package fireclient.installer;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class InstallerThread extends Thread {

	private final Installer installer;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);

	public InstallerThread(Installer installer) {
		this.installer = installer;
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

		final File mcDir = new File(OSHelper.getOS().getMC());
		if (!mcDir.exists()) {
			mcDir.mkdir();
		}
	}

	@Override
	public void run() {

		final String mc = OSHelper.getOS().getMC();

		try {

			File userDir = new File("Fireclient/");
			FileHelper.deleteDirectory(userDir);
			
			File verDir = new File("versions/Fireclient/");
			FileHelper.deleteDirectory(verDir);
			verDir.mkdirs();
			
			final String installDate = sdf.format(new Date());
			
			final JsonObject newProfile = new JsonObject();
			newProfile.addProperty("name", "Fireclient v" + Constants.getVersionNumber());
			newProfile.addProperty("created", installDate);
			newProfile.addProperty("lastUsed", installDate);
			newProfile.addProperty("icon", Constants.MC_LAUNCHER_ICON);
			newProfile.addProperty("lastVersionId", "Fireclient");
			
			final File launcherProfileFile = new File(mc, "/launcher_profiles.json");
			JsonObject launcherProfile = new JsonObject();
			if(launcherProfileFile.exists()) {
				launcherProfile = new JsonParser().parse(FileHelper.readFile(launcherProfileFile)).getAsJsonObject();
			} else {
				launcherProfile.add("profiles", new JsonObject());
			}

			launcherProfile.get("profiles").getAsJsonObject().add("Fireclient", newProfile);
			launcherProfile.addProperty("selectedProfile", "Fireclient");
			String jsonToWrite = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create().toJson(launcherProfile);

			FileHelper.writeFile(jsonToWrite, launcherProfileFile);

			FileHelper.writeFile(Constants.getJSON(), new File(verDir, "/Fireclient.json"));
			installer.moveForward();

			FileHelper.writeFile(Constants.getJSON(), new File(verDir, "/Fireclient.json"));
			installer.moveForward();

		} catch (Exception e) {
			System.err.println("Failed to download Fireclient ... Shutting Down.");
			installer.die(e);
		}

	}
}
