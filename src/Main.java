import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sales= new ArrayList<>();
        while (true) {
            System.out.println("Выберете операции: \n1) Добавить \n2) Показать \n3) Удалить");
            String operation = scanner.next();
            switch(operation){
                case "1":{
                    System.out.println("Какую покупку хотите добавить?");
                    sales.add(scanner.next());
                    break;
                }
                case "2":{
                    Showlist(sales);
                    break;
                }
                case "3":{
                    Showlist(sales);
                    System.out.println("Какую покупку хотите удалить?(введите номер или название)");
                    String nameornumb = scanner.next();
                    try {
                        int index = Integer.parseInt(nameornumb)-1;
                        sales.remove(index);
                    } catch (Exception e) {
                        sales.remove(nameornumb);
                    }
                }
                default:{
                    System.out.println("Неизвестная команда. Ошибка!");
                }
            }
        }

    }

    private static void Showlist(List<String> sales) {
        System.out.println("Список покупок: ");
        for(int i = 0; i < sales.size(); i++) {
            int count = i+1;
            System.out.println(count + ". " +  sales.get(i));
        }
    }
}