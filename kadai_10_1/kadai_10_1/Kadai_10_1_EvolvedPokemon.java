package kadai_10_1;

public class Kadai_10_1_EvolvedPokemon extends Kadai_10_1_Pokemon {
	
        private String name ="スーパーポケモン";
        
        @Override
        public void attack() {
        	super.attack();
        	super.attack();
        }
        
        public void heal() {
        	System.out.println(this.name+"には回復メソッドが追加されました");
        }
}
