
public class AddClass implements Hab {
	@Override
	public void clac(NumVo nc) {
		System.out.println("더하기 연산");
		int num1 = nc.getNum1();
		int num2 = nc.getNum2();
		System.out.println(num1 + "+" + num2 + "=" 
							+ (num1+num2));
	}
}
