package kadai_10_1;

public class Kadai_10_1_EvolvedPokemon extends Kadai_10_1_Pokemon {
	
        private String name ="�X�[�p�[�|�P����";
        
        @Override
        public void attack() {
        	super.attack();
        	super.attack();
        }
        
        public void heal() {
        	System.out.println(this.name+"�ɂ͉񕜃��\�b�h���ǉ�����܂���");
        }
}
