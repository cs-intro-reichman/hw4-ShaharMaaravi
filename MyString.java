public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String result = str.toLowerCase();
        return result;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
            if(str2.isEmpty()) return true;
            char test = str2.charAt(0);

            if(str1.indexOf(test) < 0) { 
                return false; 
            } else {
                int i = str1.indexOf(test)+1;
                int k = 1; 
                while (k < str2.length()) {
                    if(str1.charAt(i) != str2.charAt(k)){
                        return false; 
                    }
                    i++; 
                    k++;
                }
                return true;
            }
        
       }
    }

