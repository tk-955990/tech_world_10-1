package kadai_10_1;

public class Kadai_10_1_EvolvedPokemon extends Kadai_10_1_Pokemon {
	
        private String name ="�X�[�p�[�|�P����";
        
        @Override
        public void attack() {
        	System.out.println(this.name+"�͂Q��U���o���܂�");
        	System.out.println("�Q����U���o�����ł��I�I");
        }
        
        public void heal() {
        	System.out.println(this.name+"�ɂ͉񕜃��\�b�h���ǉ�����܂���");
        }
}
