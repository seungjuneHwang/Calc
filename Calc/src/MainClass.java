/*
 * 계산기 만들기
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 더하기를 클래스를 생성을 해서 넣으면 더하기
		// 빼기 클래스를 생성을 해서 넣으면 빼기

		Hab hb = new SubClass();
		
		OperClass oc = new OperClass();
		oc.setOp(hb);
		oc.printResult();
	}

}
