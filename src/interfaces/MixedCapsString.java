package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String input) {
		// TODO Auto-generated method stub
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if(i%2==1) {
				input = input.substring(0, i) + Character.toUpperCase(input.charAt(i)) + input.substring(i+1);
			}
		}
		return input;
	}

}
