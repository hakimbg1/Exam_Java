package m1.examen_final.tache3;
import java.io.File;
import java.io.FilenameFilter;

public class FileManipulation {

    public static void main(String[] args) {
        File directory = new File("C:/Users/Amyar/Desktop");
        String prefix = "Hakim";

        printFiles(directory, prefix);
        System.out.println("total size des fichiers : " + totalSizeOfFiles(directory));
        System.out.println("fichier recent: " + mostRecentFile(directory));
    }

    public static void printFiles(File directory, String prefix) {
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(prefix);
            }
        };

        File[] files = directory.listFiles(filter);
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
    }

    public static long totalSizeOfFiles(File directory) {
        long totalSize = 0;
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    totalSize += file.length();
                }
            }
        }
        return totalSize;
    }

    public static File mostRecentFile(File directory) {
        File mostRecent = null;
        long lastModified = Long.MIN_VALUE;
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.lastModified() > lastModified) {
                    mostRecent = file;
                    lastModified = file.lastModified();
                }
            }
        }
        return mostRecent;
    }
}
