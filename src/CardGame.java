import java.util.*;
import java.util.stream.Collectors;

public class CardGame {
    public static int player1 = 0;
    public static int player2 = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hand1 = scanner.nextLine();
        String hand2 = scanner.nextLine();

        Queue<Integer> hand1Queue = Arrays.stream(hand1.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));
        Queue<Integer> hand2Queue = Arrays.stream(hand2.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedList::new));

        while(hand1Queue.peek() != null && hand2Queue.peek() != null){
            if(hand1Queue.peek() > hand2Queue.peek()){
                player1 += hand1Queue.peek() + hand2Queue.peek();
                hand1Queue.add(hand1Queue.poll());
                hand1Queue.add(hand2Queue.poll());
            }
            else if(hand1Queue.peek() < hand2Queue.peek()){
                player2 += hand1Queue.peek() + hand2Queue.peek();
                hand2Queue.add(hand2Queue.poll());
                hand2Queue.add(hand1Queue.poll());
            }
            else{
                hand1Queue.poll();
                hand2Queue.poll();
            }
        }
      if(player1 > player2){
            player1 = 0;
            while(hand1Queue.peek() != null){
                player1 += hand1Queue.poll();
            }
          System.out.println("First player wins! Sum: " + player1);
      }
      else{
            player2 = 0;
          while(hand2Queue.peek() != null){
              player2 += hand2Queue.poll();
          }
            System.out.println("Second player wins! Sum: " + player2);
      }
    }
}

