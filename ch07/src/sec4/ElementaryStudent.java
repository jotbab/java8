package sec4;

public class ElementaryStudent extends Student{

	@Override
	int computeTot(int jum1, int jum2, int jum3) {
		return jum1 + jum2 + jum3;
	}

	@Override
	double computeAvg(int jum1, int jum2, int jum3) {
		return (float) (jum1+jum2+jum3)/3;
	}

	@Override
	public String computeHak(int jum1, int jum2, int jum3) {
		// TODO Auto-generated method stub
		return super.computeHak(jum1, jum2, jum3);
	}
	
}
