import java.util.Scanner;

public class OperClass {
//	int num1;
//	int num2;
//	AddClass ac;
//	SubClass ac;   // 변해야 되는
	Hab ac;
	
	NumVo nc;   // 고정
	
	// 생성자
	public OperClass() {
		System.out.println("계산기 프로그램");
		ac = new SubClass();
		nc = new NumVo();
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		nc.setNum1(sc.nextInt());
		System.out.print("두번째 숫자 입력: ");
		nc.setNum2(sc.nextInt());
	}
	
	public void printResult() {
		ac.clac(nc);
	}
}
