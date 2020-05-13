/**
 * 
 * @author Andrea<h3> De Luca</h3> <u> 4Ai </u> <em>13/5/2020</em>
 *
 *
 */
public class DeLucaClass {
	private int b,e;
/**
 * 
 * @param b
 * @param e
 * @return
 */
	public float DeLucaMet(int b, int e) {
		int val1=1;
		for (int i=1;i<=b;i++) {//nel for bisogna inserire "e" al posto di "b" 
								//inoltre bisogna inserire i<e e non i<=e
			val1=val1*b;
		}
		return val1;
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
