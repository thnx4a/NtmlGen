import com.suhorukov.titov.HtmlGenerator.HtmlGenerator;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
       if(args.length==0){
           System.out.println("Usage: <DIR>");
           return;
       }
//        System.out.println(String.format("<tr><td>%s</td></tr>", 11));

        try(Writer writer = new OutputStreamWriter(new FileOutputStream("index.html"))){
            HtmlGenerator generator = new HtmlGenerator();
            writer.write(generator.indexHtml(args[0]));
        }
    }
}
