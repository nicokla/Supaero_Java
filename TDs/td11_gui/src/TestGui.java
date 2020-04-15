
public class TestGui {
	public static void main(String[] args){
		Chat c = new Chat();
		VueChat v = new VueChat(c);
		c.inscrire(v);
	}
}
