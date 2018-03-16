package strings;

/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static util.Print.print;

public class TheReplacements {
    public static void main(String[] args) throws Exception {
        String s = TextFile.read("TheReplacements.java");
        Matcher mInput =
                Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find())
            s = mInput.group(1);
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^ +", "");
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        m.appendTail(sbuf);
        print(sbuf);
    }
}
