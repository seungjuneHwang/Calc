/*
 * 계산기 만들기
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 더하기를 클래스를 생성을 해서 넣으면 더하기
		// 빼기 클래스를 생성을 해서 넣으면 빼기
		
		OperClass oc = new OperClass();
		oc.inputNumber();  // 두개의 숫자를 입력
		oc.printResult();
	}

}
