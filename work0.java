package week02.homework;

import java.util.*;

public class work0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("저장할 자료구조명을 입력해주세요. (List / Set / Map)");
        String listType = sc.nextLine();

//        System.out.println("레시피를 입력해 주세요.");
//        ArrayList<String> strList = new ArrayList<>();
        int num = 0;
        String inputText = "";

        switch (listType) {
            case "List": {
                System.out.println("요리 제목을 입력해주세요.");
                String title = sc.nextLine();

                System.out.println("레시피를 입력해 주세요.");
                ArrayList<String> strList = new ArrayList<>();

                do {
                    System.out.print("입 력 : ");
                    inputText = sc.nextLine();

                    if(inputText.equals("끝")) break;

                    strList.add(inputText);
                } while(true);

                System.out.println("입력받은 레시피를 모두 출력합니다.");

                System.out.println("-------------------------------");

                System.out.println("[" + listType + "으로 저장된 " + title + "]");
                for (int i = 0; i < strList.size() ; i++) {
                    System.out.println(++num + ". " + strList.get(i));
                }
                break;
            }
            case "Set": {
                System.out.println("요리 제목을 입력해주세요.");
                String title = sc.nextLine();

                System.out.println("레시피를 입력해 주세요.");
                Set<String> strSet = new LinkedHashSet<>();  //LinkedHashSet 은 .add() 한 순서대로 값이 저장된다

                do {
                    System.out.print("입 력 : ");
                    inputText = sc.nextLine();

                    if(inputText.equals("끝")) break;
                    strSet.add(inputText);
                } while(true);

                System.out.println("입력받은 레시피를 모두 출력합니다.");

                System.out.println("-------------------------------");

                System.out.println("[" + listType + "으로 저장된 " + title + "]");

                Iterator<String> iter = strSet.iterator();
                while (iter.hasNext()){
                    System.out.println(++num + ". " + iter.next());
                }
                break;
            }
            case "Map": {
                System.out.println("요리 제목을 입력해주세요.");
                String title = sc.nextLine();

                System.out.println("레시피를 입력해 주세요.");
                ArrayList<String> strList = new ArrayList<>();

                Map<String, String> strMap = new LinkedHashMap<>();

                System.out.println("Key-레시피를 입력하세요.");
                System.out.println("레시피를 다 적었으면 끝 입력.");

                String input = "";
                while (!input.equals("끝")) {
                    System.out.print("Key: ");
                    String key = sc.nextLine();

                    System.out.print("레시피: ");
                    String value = sc.nextLine();

                    System.out.println("더 입력하면 enter, 끝내려면 '끝' 을 입력해주세요.");
                    strMap.put(key, value);

                    input = sc.nextLine();
                }
                System.out.println("입력받은 레시피를 모두 출력합니다.");

                System.out.println("-------------------------------");

                System.out.println("[" + listType + "으로 저장된 " + title + "]");

                for (String key : strMap.values()) {
                    System.out.println(++num + ". " +key);
                }
                sc.close();
                break;
            }
            default : System.out.println("잘못된 리스트 타입입니다.");
        }

// sc.nextLine(); 스캐너에서 받아온 현재 cursor 다음 줄을 읽어옵니다. (enter -> [ "\n" or "\r\n" ] 1줄) 오늘 밥 잘 먹었습니다.\n
    }
}