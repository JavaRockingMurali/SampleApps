/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeWorkouts;

import java.util.StringTokenizer;

/**
 *
 * @author MURALI
 */
public class StringToknizerExample {
    public static void main(String[] args) {
        String msg="The string tokenizer class allows an application to break a string into tokens. The tokenization method is much simpler than the one used by the StreamTokenizer class. The StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments. The set of delimiters (the characters that separate tokens) may be specified either at creation time or on a per-token basis. - See more at: http://www.java2novice.com/stringtokenizer/tokens-by-delimiters/#sthash.7Nx49VO9.dpuf";
        StringTokenizer tok=new StringTokenizer(msg," ");
        while(tok.hasMoreElements()){
            System.out.println("Elements:"+tok.nextToken());
            System.out.println("Count:"+tok.countTokens());
        }
    }
    
}
