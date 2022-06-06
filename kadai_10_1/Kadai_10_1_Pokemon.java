package kadai_10_1;

public class Kadai_10_1_Pokemon {
	
	private String name ="ポケモン";
	private int hp = 100;
	private int at = 50;
    private int df = 30;
    
    public void attack() {
    System.out.println(this.name+"の攻撃メソッド");
    }
    public void deffence() {
    System.out.println(this.name+"の防御メソッド");	
    }
}
