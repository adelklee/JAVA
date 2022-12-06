package week_9_hw_1;

import java.util.Scanner;

public interface Run {

    default void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean roof = true;
        
        while (roof) {
            System.out.println("메뉴를 선택하세요.\n1) 입력, 2) 검색, 3) 명단, 4) 종료");

            switch(scanner.nextInt()) {
            case 1: {
                String name = "";
                    
                while (true) {
                    name = scanner.next();
                        
                    if (name.equals("stop")) break;

                    insertMember(name, scanner.nextInt()); 
                }
            }
            break;

            case 2: {
                String name = "";
                    
                while (true) {
                    name = scanner.next();
                        
                    if (name.equals("stop")) break;

                    searchMember(name); 
                }
            }
            break;
                
            case 3: {
                showMember();
            }
            break;

            case 4:{
                roof = false;
            }
            break;
            }
        }

        scanner.close();
    }

    abstract void run();

    abstract void insertMember(String name, int point);
    abstract void searchMember(String name);
    abstract void showMember();

}