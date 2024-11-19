import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double totalCredit = 0.0;
        double totalGrade = 0.0;
       for(int i = 0; i < 20; i ++){
           StringTokenizer st = new StringTokenizer(br.readLine(), " ");
           st.nextToken();
           double credit = Double.parseDouble(st.nextToken());
           String grade = st.nextToken();
           if(grade.equalsIgnoreCase("p")) continue;
           totalCredit += credit;
           double gradeScore = 0.0;
           switch (grade.toLowerCase()){
               case "a+":
                   gradeScore = 4.5;
                   break;
               case "a0":
                   gradeScore = 4.0;
                   break;
               case "b+":
                   gradeScore = 3.5;
                   break;
               case "b0":
                   gradeScore = 3.0;
                   break;
               case "c+":
                   gradeScore = 2.5;
                   break;
               case "c0":
                   gradeScore = 2.0;
                   break;
               case "d+":
                   gradeScore = 1.5;
                   break;
               case "d0":
                   gradeScore = 1.0;
                   break;
               case "f":
                   gradeScore = 0.0;
                   break;
           }
           totalGrade += credit * gradeScore;
       }
       System.out.println(totalGrade / totalCredit);
    }
}