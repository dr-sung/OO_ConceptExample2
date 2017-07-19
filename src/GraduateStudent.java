/**
 * @author Hong
 */

public class GraduateStudent extends Student {

	public GraduateStudent(String name, String nextClass) {
		super(name, nextClass);
	}

	@Override
	public String goToNextClass() {
		return "***** Take care of course evaluations!" + "\n"
			+ super.goToNextClass();
	}
	
}
