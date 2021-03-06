package fireclient.installer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Constants {

	public static final String MC_LAUNCHER_ICON = " data:image/png;base64,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OmRvY2lkOmdpbXA6MGMzN2M0NDMtNzlmYS00Mzc4LTkxOTQtY2YwMTgyNzVmNGEwIgogICB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOjZmYjIyZTkxLTllYTgtNDE2NC05ZWI4LTVhZmQ2MjdmMTVjYiIKICAgeG1wTU06T3JpZ2luYWxEb2N1bWVudElEPSJ4bXAuZGlkOjNhOWEwMjFhLTk2MzEtNGM5Mi04YjU1LWNmMDYyNDQzNDVlYyIKICAgZGM6Rm9ybWF0PSJpbWFnZS9wbmciCiAgIEdJTVA6QVBJPSIyLjAiCiAgIEdJTVA6UGxhdGZvcm09IkxpbnV4IgogICBHSU1QOlRpbWVTdGFtcD0iMTYzMjQxNjIxMzA3MTAwOCIKICAgR0lNUDpWZXJzaW9uPSIyLjEwLjI0IgogICB0aWZmOk9yaWVudGF0aW9uPSIxIgogICB4bXA6Q3JlYXRvclRvb2w9IkdJTVAgMi4xMCI+CiAgIDx4bXBNTTpIaXN0b3J5PgogICAgPHJkZjpCYWc+CiAgICAgPHJkZjpsaQogICAgICBzdEV2dDphY3Rpb249InNhdmVkIgogICAgICBzdEV2dDpjaGFuZ2VkPSIvIgogICAgICBzdEV2dDppbnN0YW5jZUlEPSJ4bXAuaWlkOjZjOWM3OTNmLTk1YmMtNDkzZS1hZGY3LWJhY2NiMTZiMjQwZSIKICAgICAgc3RFdnQ6c29mdHdhcmVBZ2VudD0iR2ltcCAyLjEwIChMaW51eCkiCiAgICAgIHN0RXZ0OndoZW49IjIwMjEtMDctMTRUMTU6MDU6MjArMDI6MDAiLz4KICAgICA8cmRmOmxpCiAgICAgIHN0RXZ0OmFjdGlvbj0ic2F2ZWQiCiAgICAgIHN0RXZ0OmNoYW5nZWQ9Ii8iCiAgICAgIHN0RXZ0Omluc3RhbmNlSUQ9InhtcC5paWQ6MmFiMTAyZmMtYzYzMC00Y2M4LWFiZWQtYjQ5N2FmYTgyMzNkIgogICAgICBzdEV2dDpzb2Z0d2FyZUFnZW50PSJHaW1wIDIuMTAgKExpbnV4KSIKICAgICAgc3RFdnQ6d2hlbj0iMjAyMS0wOS0yM1QxODo1Njo1MyswMjowMCIvPgogICAgPC9yZGY6QmFnPgogICA8L3htcE1NOkhpc3Rvcnk+CiAgPC9yZGY6RGVzY3JpcHRpb24+CiA8L3JkZjpSREY+CjwveDp4bXBtZXRhPgogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgCjw/eHBhY2tldCBlbmQ9InciPz784nMjAAABhWlDQ1BJQ0MgcHJvZmlsZQAAKJF9kT1Iw0AcxV9Tix9UFCwo4pChOlkQFemoVShChVIrtOpgcukXNGlIUlwcBdeCgx+LVQcXZ10dXAVB8APEzc1J0UVK/F9SaBHjwXE/3t173L0DhHqZqWbHBKBqlpGKx8RMdlXsfEU3BtGPKAISM/W5ZDIBz/F1Dx9f7yI8y/vcn6NXyZkM8InEs0w3LOIN4plNS+e8TxxiRUkhPiceN+iCxI9cl11+41xwWOCZISOdmicOEYuFNpbbmBUNlXiaOKyoGuULGZcVzluc1XKVNe/JXxjMaSvLXKc5gjgWsYQkRMioooQyLERo1UgxkaL9mId/2PEnySWTqwRGjgVUoEJy/OB/8LtbMz816SYFY0DgxbY/RoHOXaBRs+3vY9tunAD+Z+BKa/krdSD6SXqtpYWPgL5t4OK6pcl7wOUOMPSkS4bkSH6aQj4PvJ/RN2WBgVugZ83trbmP0wcgTV0lboCDQ2CsQNnrHu/uau/t3zPN/n4AfWFyq7Ts/DsAAAAGYktHRAAOAD8ANqb+MioAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQflCRcQODUXifZuAAAC/klEQVRYw+2XT2hcVRTGf999bxJdCIYpmUkq1hIXFgU1uBApVl1oqE6kFFHURbsQ7c5VhdIiuBNxJSiK4MKCOweaxIbiQi2KqxjUZYRoY5k/RkIRSmbeu5+LGdMkhgiZ0SDkLC/nnfu755zvnXthz3ZgraWFsOsQ9eNjldqTpWKvcXZ+kvb1XyXN1iaKxd0BcPwBhXtJC5eaxw4M7QKAgzGSxvP26qu7AKBnhQogpHCmXhkd/88AGpX9IujEuqUU+/WdxNJOPqo9VX5M0ucggXNQgp05ax1yttp0mv4xOruS/ysZqB8tFYU+6GwONm8R3UJKVRh8HqXFkAy8Vz9aSvoO0HzmriJJcglpbN3yt4hvOtHSg0rSKxBOEHS2rwD142NpbF+fBcZvCMELWDPAV52+5A6COsmRztUm9z/aF4DGC3fL7dX3yVsPrNch0mvlmasZOIKR4wqFm25HBFCimJ+rPT2ingF8beUYMT+5qWerpAPVTit31/N8njx7WCjpZESPKNf9PQE0KqMp9puS1nY3LNv5y+XqogGiDQjjK4Iz4K7EJDtWegKIjoeBOzdp953ydOO3tSCGrhwPWoxh1iSoJD3SYwl0ZGPmnTvG8xtdhFEicbZbj1N27ADGrLceEO6ewBn4siEiftkEcGsn7QKYiyH5CPRjn2T41w/HX0N4WyFFt/xt+N0HAjuTwksjF5aytZZxjwB2dLeWjnk243Zrgd+bmxolIsAhnC9dWJrrTOtuG4Sw2FsJFKbAoMDIZ/UMx+ccFDcORuaBNo6nNxSvc4Ivt4uf/nMFwhcmmqwlgPLF5vdbTLSf7fhJebrWBKhNDKcS92Ava2BwqjcZpoV5oSroofpEcd+WTln8GPhwLejA4AFLQ5g3hj9dXO4JYKS6aMFpwTWSgRe38inNNpbL07XLN25r2ST2d8jv9mUWDE9d/Sm3Hwe/Up+8bd+2d4UnhlIcH1SeT5Sma1nfpuHoTG2OvHVYSXpoW8fCzSO5fap0sbm894Las/+F/QnFTDdH5JUbRgAAAABJRU5ErkJggg==";
	
	private static final String BASE_URL = "";
	
	private static String versionNumber = null;
	
	public static String getVersionNumber() {
		
		if(versionNumber == null) {
			
			try {
				InputStream stream = FileHelper.getStreamfromURL(BASE_URL + "version.txt");
				InputStreamReader reader = new InputStreamReader(stream);
				BufferedReader buffReader = new BufferedReader(reader);
				versionNumber = buffReader.readLine();
				reader.close();
				buffReader.close();
				stream.close();
			} catch(IOException e) {
				e.printStackTrace();
				Installer.getInstance().die(e);
			}
			
		}
		
		return versionNumber;
	}
	
	public static InputStream getIcon() {
		return ClassLoader.getSystemResourceAsStream("assets/images/icon.png");
	}
	
	public static InputStream getJar() throws MalformedURLException, IOException {
		return FileHelper.getStreamfromURL(BASE_URL + getVersionNumber() + "/" + "Fireclient.jar");
	}
	
	public static InputStream getJSON() throws MalformedURLException, IOException {
		return FileHelper.getStreamfromURL(BASE_URL + getVersionNumber() + "/" + "Fireclient.json");
	}
	
	public static URL getAudio() {
		return ClassLoader.getSystemResource("assets/sounds/audio.mp3");
	}
}
