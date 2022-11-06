import java.util.*;

public class TreeSetPractice {
  public static void main(String[] args) {
    TreeSet<Integer> numbers = new TreeSet<>();

    Random random = new Random();
    for (int i = 1; i <= 10; i++) {
      int num = random.nextInt(100) + 1;
      while (numbers.contains(num)) {
        num = random.nextInt(100) + 1;
      }
      numbers.add(num);
      System.out.printf("第%d個整數：%d%n", i, num);
    }
    System.out.println("物件內元素個數為：" + numbers.size());
    System.out.println("物件內元素為的內容：" + numbers);
    System.out.println("第一個元素內容為：" + numbers.first());
    System.out.println("最後一個元素內容：" + numbers.last());
    System.out.println("內容介於30~70者：" + numbers.subSet(30, 70));

  }
}
