
public class SubClass implements Hab {
	@Override
	public OpVo clac(NumVo nv) {
		System.out.println("빼기 연산");
		OpVo ov = new OpVo("-");
		nv.setResult(nv.getNum1() - nv.getNum2());
		
		return ov;
	}
}
