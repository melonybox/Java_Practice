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

public class Vowels {
  public static int getCount(String str) {
    int vowelsCount = 0;
    // Your code here
		str = str.toLowerCase();
    for (int i = 0; i < str.length(); ++i) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowelsCount;
      }
    }
    return vowelsCount;
  }
}

// public class Vowels {
//   public static int getCount(String str) {
//     return str.replaceAll("[^aeiouAEIOU]", "").length();
//   }
// }
