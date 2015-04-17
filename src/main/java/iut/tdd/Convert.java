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
		case "10":
			return "dix";
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

		case "17":
			return "dix-sept";
		case "18":
			return "dix-huit";
		case "19":
			return "dix-neuf";
		case "20":
			return "vingt";
		}
		return null;

	}
	
	public static  String num2virgule(String input){
		int length = input.length();
	 if(input.charAt(1)== '.'){
			return zero2twenty("" + input.charAt(0)) + " virgule " + zero2twenty("" + input.charAt(2));
		}
		
		return null;
		
	}

	public static String num2text(String input) {
		int length = input.length();
		if(zero2twenty(input)==null){
			if(num2virgule(input)==null){
		switch(length){
		case 2: switch(input.charAt(0)){
		case '2' :  return "vingt-" + num2text("" + input.charAt(1));
		case '3' : return "trente-" + num2text("" + input.charAt(1));
		case '4' : return "quarante-" + num2text ("" + input.charAt(1));
		case '5' : return "cinquante-" + num2text ("" + input.charAt(1));
		case '6' : return "soixante-" + num2text ("" + input.charAt(1));
		case '8' : return "quatre-vingt-" + num2text ("" + input.charAt(1));
		}
		}
		}
			else{ return num2virgule(input);}
		}

		else{ return zero2twenty(input);}
		
		

		return null;
	}

	public static String text2num(String input) {
		return null;
	}
}