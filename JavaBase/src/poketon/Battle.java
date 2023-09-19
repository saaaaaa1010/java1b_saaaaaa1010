package poketon;

public class Battle {
	String hono = "ほのお";
	String kusa = "くさ";
	String jimen = "じめん";
	String water = "みず";

	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		if (hono == poke1.type) {
			if (hono == poke2.type) {
			}
			if (kusa == poke2.type) {
				poke1.power = poke1.power * 2;
			}
			if (jimen == poke2.type) {
				poke1.power = poke1.power * 2;
			}
			if (water == poke2.type) {
				poke1.power = poke1.power * 2;
			}
		}
		if (kusa == poke1.type) {
			if (kusa == poke2.type) {
			}
			if (jimen == poke2.type) {
				poke1.power = poke1.power * 2;
			}
			if (water == poke2.type) {
				poke1.power = poke1.power * 2;
			}
		}
		if (jimen == poke1.type) {
			if (jimen == poke2.type) {
			}
			if (water == poke2.type) {
				poke1.power = poke1.power * 2;
			}
		}

		if (hono == poke2.type) {
			if (hono == poke2.type) {
			}
			if (kusa == poke1.type) {
				poke2.power = poke2.power * 2;
			}
			if (jimen == poke1.type) {
				poke2.power = poke2.power * 2;
			}
			if (water == poke1.type) {
				poke2.power = poke2.power * 2;
			}
		}
		if (kusa == poke2.type) {
			if (kusa == poke1.type) {
			}
			if (jimen == poke1.type) {
				poke2.power = poke2.power * 2;
			}
			if (water == poke1.type) {
				poke2.power = poke2.power * 2;
			}
		}
		if (jimen == poke2.type) {
			if (jimen == poke1.type) {
			}
			if (water == poke1.type) {
				poke2.power = poke2.power * 2;
			}
		}

		//バトル
		if (poke1.power >= poke2.power) {
			winner = poke1.name;
		} else {
			winner = poke2.name;
		}
		System.out.println(winner + "のかち！");
		return winner;
	}
}