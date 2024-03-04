import java.io.*;

public class Buffer {

    public static void createNewFile(String[] buffer) throws IOException {
        String fileName = buffer[0] + ".txt";
        try {
            File path = new File(fileName);

            if (!path.exists()) {
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path,true));
            String writeStr = String.join(" ", buffer);
            bw.write(writeStr);
            bw.newLine();
            bw.close();


        }catch (IOException e) {
            throw new IOException("Ошибка создания файла");
        }
    }
}
