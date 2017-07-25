package tr.org.linux.kamp.email;

public class EmailValidation {

	public static void main(String[] args) {

		System.out.println(isValid("cey@cey.com"));
	}

	public static boolean isValid(String str) {

		if (str.contains(" "))
			return false;

		if (!str.contains("@"))
			return false;

		if (!(str.contains(".")))
			return false;

		if (str.startsWith("@") || str.startsWith("."))
			return false;

		if (str.contains("@."))
			return false;

		if (str.lastIndexOf('.') >= str.length() - 2)
			return false;

		else
			return true;
	}

}
