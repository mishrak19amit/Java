package HackerRank;

import static java.util.stream.Collectors.joining;

//MissingWord 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



class Result {

    /*
     * Complete the 'missingWords' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static List<String> missingWords(String s, String t) {
    // Write your code here
  List<String> returnarray=new ArrayList<String>();
    String[] ss=s.split(" ");
    String[] tt=t.split(" ");
    
   int p=0;
    int lent=tt.length;
    int lens=ss.length;
    for(int i=0;i<lent;i++)
{
     String check=tt[i];

     for(int k=p;k<lens;k++)
     {
         if(!check.equals(ss[k]))
         {
            returnarray.add(ss[k]);
            break;
         }
               
         p++;
     }

    }
return returnarray;
}
    
}

public class MissingWord {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        List<String> result = Result.missingWords(s, t);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
