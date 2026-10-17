
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String s = br.readLine();

        LinkedList<Character> list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> it = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;

                case "R":
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;

                case "D":
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    break;

                case "P":
                    char c = st.nextToken().charAt(0);
                    it.add(c);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
