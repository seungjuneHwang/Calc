
public class AddClass implements Hab {
	@Override
	public OpVo clac(NumVo nv) {
		System.out.println("더하기 연산");
		OpVo ov = new OpVo("+");
		nv.setResult(nv.getNum1() + nv.getNum2());
		
		return ov;
	}
}
