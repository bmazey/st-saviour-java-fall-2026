import java.util.Random;

public class SPITCardGame {
public static void main(String[] args) {
Random random = new Random();

// 1. Generate random card values from 0 to 51
int playerCardRaw = random.nextInt(52);
int dealerCardRaw = random.nextInt(52);

// 2. Determine the card ranks from 0 to 12
int playerRank = playerCardRaw % 13;
int dealerRank = dealerCardRaw % 13;

System.out.println("Player drew card rank: " + playerRank);
System.out.println("Dealer drew card rank: " + dealerRank);

// 3. Determine the winner
if (playerRank > dealerRank) {
System.out.println("Outcome: Player wins!");
} else if (playerRank < dealerRank) {
System.out.println("Outcome: Dealer wins!");
} else {
System.out.println("Outcome: It's a tie!");
}
}
}

