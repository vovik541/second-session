package files.modules;

import java.nio.file.Paths;

public class FilePathManager {
    public static String getFilePath(String fileName) {
        return getProjectPath() + "\\src\\resources\\" + fileName;
    }

    public static String getProjectPath() {
        return Paths.get("").toAbsolutePath().toString();
    }
}
