package iut.tdd;

public class Convert {

	public static String zero2twenty(String input) {

		switch (input) {
		case "0":
			return "zéro";
		case "1":
			return "un";
		case "2":
			return "deux";
		case "3":
			return "trois";
		case "4":
			return "quatre";
		case "5":
			return "cinq";
		case "6":
			return "six";
		case "7":
			return "sept";
		case "8":
			return "huit";
		case "9":
			return "neuf";
		case "11":
			return "onze";
		case "12":
			return "douze";
		case "13":
			return "treize";
		case "14":
			return "quatorze";
		case "15":
			return "quinze";
		case "16":
			return "seize";

		}
		return null;

	}

	public static String Dizaine(String input) {
		switch (input) {
		case "10":
			return "dix";
		case "20":
			return "vingt";
		case "30":
			return "trente";
		case "40":
			return "quarante";
		case "50":
			return "cinquante";
		case "60":
			return "soixante";
		case "70":
			return "soixante-dix";
		case "80":
			return "quatre-vingt";
		case "90":
			return "quatre-vingt-dix";

		}
		return null;

	}

	public static String num2virgule(String input) {
		int length = input.length();
		if (input.charAt(1) == '.') {
			return zero2twenty("" + input.charAt(0)) + " virgule "
					+ zero2twenty("" + input.charAt(2));
		}

		return null;

	}

	public static String num2text(String input) {
		int length = input.length();
		if (zero2twenty(input) == null) {
			if (num2virgule(input) == null) {
				switch (length) {
				case 2:
					if (input.charAt(1) == '1') {
						switch (input.charAt(0)) {
						case '1':
							return Dizaine("10") + " et " + zero2twenty("1");
						case '2':
							return Dizaine("20") + " et " + zero2twenty("1");
						case '3':
							return Dizaine("30") + " et " + zero2twenty("1");
						case '4':
							return Dizaine("40") + " et " + zero2twenty("1");
						case '5':
							return Dizaine("50") + " et " + zero2twenty("1");
						case '6':
							return Dizaine("60") + " et " + zero2twenty("1");
						case '7':
							return Dizaine("60") + " et " + zero2twenty("11");
						case '8':
							return Dizaine("80") + "-" + zero2twenty("1");
						case '9':
							return Dizaine("90")  + "-" + zero2twenty("11");
						}
					}

					else if (input.charAt(1) == '0') {
						switch (input.charAt(0)) {
						case '1':
							return Dizaine("10");
						case '2':
							return Dizaine("20");
						case '3':
							return Dizaine("30");
						case '4':
							return Dizaine("40");
						case '5':
							return Dizaine("50");
						case '6':
							return Dizaine("60");
						case '7':
							return Dizaine("70");
						case '8':
							return Dizaine("80");
						case '9':
							return Dizaine("90");

						}

					} else {
						switch (input.charAt(0)) {
						case '1':
							return Dizaine("10") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '2':
							return Dizaine("20") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '3':
							return Dizaine("30") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '4':
							return Dizaine("40") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '5':
							return Dizaine("50") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '6':
							return Dizaine("60") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '7':
							return Dizaine("70") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '8':
							return Dizaine("80") + "-"
									+ zero2twenty("" + input.charAt(1));
						case '9':
							return Dizaine("90") + "-"
									+ zero2twenty("" + input.charAt(1));
						}
					}
				}
			} else {
				return num2virgule(input);
			}
		}

		else {
			return zero2twenty(input);
		}

		return null;
	}

	public static String text2num(String input) {
		return null;
	}
}