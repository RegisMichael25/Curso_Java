package br.com.curso.poo.pokemon;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Pokemon p1 = new Pokemon(100, 14, 1, "Pikachu", "Elétrico");
		p1.level = 1;
		System.out.println(p1);
		
		Pokemon p2 = new Pokemon(100, 14, 1, "Bubasauro", "Planta");
		p2.level = 1;
		System.out.println(p2);
		
		Pokemon primeiro;
		Pokemon segundo;
		
		if(p1.speed > p2.speed) {
			primeiro = p1;
			segundo = p2;
		} else {
			primeiro = p2;
			segundo = p1;
		}
		
		lutar(primeiro, segundo);
		
	}

	private static void lutar(Pokemon primeiro, Pokemon segundo) {
		System.out.println(primeiro.name + "Começa a atacar -----");
		
		while(primeiro.hp > 0 && segundo.hp > 0) {
			segundo.takeDamage(primeiro.atk);
			System.out.println("-------");
			System.out.println(primeiro.name + "atacando");
			System.out.println(primeiro);
			System.out.println(segundo);
			
			if(segundo.hp <= 0) {
				break;
			}
			
			primeiro.takeDamage(segundo.atk);
			System.out.println("-------");
			System.out.println(segundo.name + "atacando");
			System.out.println(primeiro);
			System.out.println(segundo);
			
			if(primeiro.hp <= 0) {
				break;
			}
		}
	
		if(primeiro.hp <= 0) {
			segundo.upXp(primeiro.xp);
		} else {
			primeiro.upXp(segundo.xp);
		}
		
		System.out.println("Final -----");
		
		System.out.println(primeiro);
		System.out.println(segundo);
	}

}
