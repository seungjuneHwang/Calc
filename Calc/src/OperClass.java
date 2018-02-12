import java.util.Scanner;

public class OperClass {
	private Hab hb;
	
	// 생성자
	public OperClass() {
		System.out.println("계산기 프로그램");
	}
	
	public void setOp(Hab hb) {
		this.hb = hb;
	}
	
	public void inputNumber(NumVo nv) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력: ");
		nv.setNum1(sc.nextInt());
		System.out.print("두번째 숫자 입력: ");
		nv.setNum2(sc.nextInt());
	}
	
	public void printResult() {
		NumVo nv = new NumVo();
		inputNumber(nv);
		OpVo ov = hb.clac(nv);
		System.out.println(nv.getNum1() + ov.getOp()  
				+ nv.getNum2() + "=" + nv.getResult());
	}
}
