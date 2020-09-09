import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
                                                  
public class ParserFromURL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] query = new URL(reader.readLine()).getQuery().split("&");
        String objVar = null;
        reader.close();

        for (String s : query)
        {
            String[] itQu = s.split("=");
            System.out.print(itQu[0] + " ");
            if (itQu[0].equals("obj")) { objVar = itQu[1]; }
        }
        System.out.println();

        if (objVar!=null)
        {
                try { alert(Double.parseDouble(objVar)); }
                catch (NumberFormatException e){ alert(objVar); }
        }
    }
        public static void alert ( double value){
            System.out.println("double: " + value);
        }
        public static void alert (String value){
            System.out.println("String: " + value);
        }

}
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  