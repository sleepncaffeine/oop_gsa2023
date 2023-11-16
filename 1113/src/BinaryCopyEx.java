import java.io.*;

public class BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File(
                "C:\\Users\\parkj\\OneDrive\\바탕 화면\\기타\\고 양 이\\elisa-kennemer-U74i4h5Z_U0-unsplash.jpg");
        File dest = new File("copycat.jpg");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
