import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            BufferedReader br = null;
            try {
                File reader = new File("D:\\Code\\Java\\Lession17\\Onclass2\\src\\contries.csv");
                br = new BufferedReader(new FileReader(reader));
                String line;
                while ((line=br.readLine())!=null){
                    printCountry(parseCsvLine(line));
                }
            }  catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(br!=null){
                        br.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        public static List<String> parseCsvLine(String csvLine){
            List<String> country = new ArrayList<>();
            if(csvLine!=null){
                String [] splitData = csvLine.split(",");
                for (int i = 0; i < splitData.length; i++) {
                    country.add(splitData[i]);
                }
            }
            return country;
        }
        public static void printCountry(List<String>country){
            System.out.println(
                    "Country [id= "
                            + country.get(0)
                            + ", code= " + country.get(1)
                            + " , name=" + country.get(2)
                            + "]");
        }
    }

}
