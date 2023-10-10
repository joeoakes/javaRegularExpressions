import java.util.regex.*;

/*
http://refiddle.co/refiddles
^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$

^ and $ ensure that the pattern matches the entire string, from start to finish.

[a-zA-Z0-9._%+-]+ matches one or more characters that can be part of the local
part of an email address. This typically includes letters, numbers, dots, underscores,
percent signs, plus signs, and hyphens.

@ matches the literal "@" character.

[a-zA-Z0-9.-]+ matches one or more characters for the domain name.
It allows letters, numbers, dots, and hyphens.

\. matches the literal dot (.) character, which separates the domain name
from the top-level domain (TLD).

[a-zA-Z]{2,} matches two or more letters for the TLD. This ensures that the
TLD is at least two characters long (e.g., "com," "org," "net").
*/

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email = "example@email.com";
        if (isValidEmail(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}

