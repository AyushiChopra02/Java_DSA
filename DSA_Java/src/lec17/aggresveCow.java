package lec17;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	class Cow {
	    private String name;
	    private int aggressionLevel; // Range from 1 to 10
	    private int weight; // In kilograms
	    private int health; // In percentage (100 for healthy, 0 for dead)

	    public Cow(String name, int aggressionLevel, int weight) {
	        this.name = name;
	        this.aggressionLevel = aggressionLevel;
	        this.weight = weight;
	        this.health = 100; // Start with full health
	    }

	    public void attack(Cow target) {
	        // Calculate damage based on the attacker's aggression level and weight
	        int damage = (aggressionLevel * weight) / 10;
	        target.takeDamage(damage);
	        System.out.println(name + " attacks " + target.getName() + " with damage " + damage);
	    }

	    public void takeDamage(int damage) {
	        health -= damage;
	        if (health <= 0) {
	            health = 0;
	            System.out.println(name + " is dead.");
	        }
	    }

	    public boolean isAlive() {
	        return health > 0;
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Farm {
	    private List<Cow> cows;

	    public Farm() {
	        this.cows = new ArrayList<>();
	    }

	    public void addCow(Cow cow) {
	        cows.add(cow);
	    }

	    public void simulateCowFights() {
	        Random random = new Random();
	        for (Cow cow : cows) {
	            if (cow.isAlive()) {
	                int targetIndex = random.nextInt(cows.size());
	                Cow target = cows.get(targetIndex);
	                while (target == cow || !target.isAlive()) {
	                    // Select another target if the current one is the same cow or dead
	                    targetIndex = random.nextInt(cows.size());
	                    target = cows.get(targetIndex);
	                }
	                cow.attack(target);
	            }
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Farm farm = new Farm();
	        farm.addCow(new Cow("Cow1", 5, 300));
	        farm.addCow(new Cow("Cow2", 7, 250));
	        farm.addCow(new Cow("Cow3", 8, 400));

	        for (int i = 0; i < 5; i++) {
	            System.out.println("Round " + (i + 1));
	            farm.simulateCowFights();
	            System.out.println();
	        }
	    }
	}

}
