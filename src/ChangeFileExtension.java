import java.io.File;

public class ChangeFileExtension {

	public static void main(String[] args) {
		String folderPath = "C:\\Users\\";
		File directory = new File(folderPath);
		File files[] = directory.listFiles();
		for(File temp : files)
		{
			String fileName = temp.getName();
			if(fileName.endsWith(".txt"))
			{
				fileName=fileName.replaceFirst("[.][^.]+$", ".srt");

				temp.renameTo(new File(temp.getParent()+"/"+fileName));
			}
		}
	}
}
