public class Program {
	public static String amazingEdabit(String str) {
		if (str.contains("edabit")) {
			return str;
		}
		String replaceStr = str.replace("is", "is not");
		return replaceStr;
	}
}

// public class Program {
// 	public static String amazingEdabit(String s) {
// 		return s.contains("edabit") ? s : s.replace("is","is not");
// 	}
// }

public class Challenge {
	public static String owofied(String sentence) {
		return sentence.replaceAll("i","wi").replaceAll("e","we") + " owo";
	}
}

// public class Challenge {
// 	public static String owofied(String s) {
// 		return s.replace("i", "wi").replace("e", "we") + " owo";
// 	}
// }