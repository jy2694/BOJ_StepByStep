package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_17478_재귀함수가뭔가요 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        print(0,N);
        System.out.println(sb);
    }

    private static void print(int i, int target){
        String empty = "";
        for(int j = 0; j < i; j ++) empty += "____";
        sb.append(empty + "\"재귀함수가 뭔가요?\"\n");
        if(i == target){
            sb.append(empty+"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            sb.append(empty+"라고 답변하였지.\n");
        } else {
            sb.append(empty+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
            sb.append(empty+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
            sb.append(empty+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
            print(i+1,target);
            sb.append(empty+"라고 답변하였지.\n");
        }
    }
}
