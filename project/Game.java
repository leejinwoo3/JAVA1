package project;

public class Game {
	int attack = 10;// 휘발유의 양
	int defend = 10;
	int hp = 10;

//	hp
	void hp(int hp) {
		this.hp += hp;
	}

	boolean isLefthp() {
		if (hp == 0) {
			System.out.println("죽었습니다. 다시시작하세요"+hp);
			return false;
		}
		System.out.println("hp가 있습니다.");
		return true;
	}

// attack
	void attack(int attack) {
		this.attack += attack;
	}

	boolean isLeftattack() {
		if (attack ==10) {
			System.out.println("공격준비하세요");
			return false;
		}
		System.out.println("방어준비하세요.");
		return true;
	}

//defend
	void defend(int defend) {
		this.defend += defend;
	}

	boolean isLeftdefend() {
	if(defend ==10) {
		System.out.println("hp가 0남았습니다.");
		return false;
	}System.out.println("회복준비하세요");
		return true;
	}
	
//result
	void run() {
		while (true) {
			if (hp >= 1) {
				System.out.println("시작합니다. hp잔량:" + hp);
				hp -= 1;
			}
				
			
			else if (hp == 1) {
				System.out.println("회복준비하세요");
				hp -= 1;
			} else {
				return;

			}
		}
	}

	void recovery() {
		while (true) {
			if (hp < 11) {
				System.out.println("회복합니다. hp잔량:" + hp);
				hp += 1;

			} else  {
				return;
			}
		}
	}
}
