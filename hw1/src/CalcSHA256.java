import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;

/**
 * Created by romag_000 on 15/02/2016.
 */
public class CalcSHA256 {
    public static void main(String[] args) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        Files.lines(Paths.get(args[0])).forEach(curFile -> {
                    try {
                        md.update(Files.readAllBytes(Paths.get(curFile)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (byte el : md.digest()) {
                        System.out.print(String.format("%02X", el));
                    }
                    System.out.println();
                }
        );
    }
}
