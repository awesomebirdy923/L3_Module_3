package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String input) {
		// TODO Auto-generated method stub
		String backwardsText = "";
		for (int i = 0; i < input.length(); i++) {
			backwardsText = input.charAt(i) + backwardsText;
		}
		return backwardsText;
	}

}
