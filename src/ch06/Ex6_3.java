
public class Ex6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + c1.number + " 이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2은 " + c2.kind + c2.number + " 이며, 크기는 (" + c2.width + "," + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다 = x");
		c1.width = 50;			// Cv 값으로 오해없이 적어서 Card.width = 50 이런식으로 적기
		c1.height = 80;			// 그래서 이문장을 바꿔버리면 Cv가 바뀌여서 전체값이 변한다
		
		System.out.println("c1은 " + c1.kind + c1.number + " 이며, 크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2은 " + c2.kind + c2.number + " 이며, 크기는 (" + c2.width + "," + c2.height + ")");
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}