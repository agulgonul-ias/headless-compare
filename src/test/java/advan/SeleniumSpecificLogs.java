package advan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SeleniumSpecificLogs {

    //add Log.txt file to the project and copy the name of the file here as file1.
    static String file1 = "manual-chrome-getGlobalLogs.txt";
    //checking the selenium specific logs with underscore
    //write the file name above and check if the file constain any selenium specific logs
    public static void main(String[] args) throws IOException {

        File Logs = new File(file1);
        BufferedReader logsBuffered = new BufferedReader(new FileReader(Logs));

        List<String> logsListed = Arrays.asList(logsBuffered.readLine().split(","));

        for (int i = 0; i < logsListed.size() ; i++) {
            if(logsListed.get(i).contains("_")){
               System.out.println(logsListed.get(i));
           }
        }

        /*
        file 1 & file 2 has the same selenium
            cdc_adoQpoasnfa76pfcZLmcfl_Array
            cdc_adoQpoasnfa76pfcZLmcfl_Promise
            cdc_adoQpoasnfa76pfcZLmcfl_Symbol

       todo:
       "(function () {"
                "window.cdc_adoQpoasnfa76pfcZLmcfl_Array = window.Array;"
                "window.cdc_adoQpoasnfa76pfcZLmcfl_Promise = window.Promise;"
                "window.cdc_adoQpoasnfa76pfcZLmcfl_Symbol = window.Symbol;"
        "}) ();";

        also
        todo:
        https://huge-dom.vanilla-cms.org/en/browser
        https://huge-dom.vanilla-cms.org/window.cdc_adoQpoasnfa76pfcZLmcfl_Array.from.length
         */
    }
}
