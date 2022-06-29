public class App {
    public static void main(String[] args) throws Exception {
        /*
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        for (int i = 0; i < q.num; i++)
            System.out.println(q.poll());

         */

        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        for (int i = 0; i < s.num; i++)
        System.out.println(s.pop());

    }

}
