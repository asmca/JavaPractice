package jdk7notes.chapter14;

import java.util.Scanner;

/**
 * file in jdk7notes.chapter14
 * Created by suse on 15-1-25.
 */
public class MessageDAODemo {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        MessageDAO dao = new MessageDAO("jdbc:mysql://localhost:3306/test", "root","");

        while (true){
            System.out.print("(1) 显示留言  (2) 新增留言 ");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    for (Message message : dao.get()){
                        System.out.printf("%d\t%s\t%s\t%s%n",
                                message.getId(),
                                message.getName(),
                                message.getEmail(),
                                message.getMsg());
                    }
                    break;
                case 2:
                    System.out.print("姓名");
                    String name = scanner.nextLine();
                    System.out.print("邮箱");
                    String email = scanner.nextLine();
                    System.out.print("留言");
                    String msg = scanner.nextLine();
                    dao.add(new Message(name,email, msg));
            }
        }

    }

}
