import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord)
    {
        String sen = "";
        String[] words = sentence.split(" ");
        int n = words.length;
        for (int i=0 ; i<n ; i++) {
            if (i != 0) {
                sen += " ";
            }
            if (Arrays.asList(words[i]).contains(word))
            {
                words[i] = newWord;
                sen+= newWord;
            }
            else
            {
                sen+=words[i];
            }
        }
        return sen;
    }


    public String normalizingName(String firstName, String lastName)
    {
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        char[] firsta = firstName.toCharArray();
        char[] lasta = lastName.toCharArray();
        firsta[0] -= 32;
        lasta[0] -= 32;
        int n1 = firsta.length;
        int n2 = lasta.length;
        char[] fulla= new char[n1+n2+1];
        for (int i = 0 ; i<n1 ; i++)
        {
            fulla[i]=firsta[i];
        }
        fulla[n1]=' ';
        for (int i = 0 ; i<n2 ; i++)
        {
            fulla[i+n1+1]=lasta[i];
        }
        String Fullname = "";
        if (lastName != " ")
        {
            for (int i=0 ; i<n1+n2+1 ; i++)
            {
                if (fulla != null)
                {
                    Fullname = Fullname +fulla[i];
                }
            }
        }
        else
        {
            for (int i=0 ; i<n1+n2-1 ; i++)
            {
                if (fulla != null)
                {
                    Fullname = Fullname +fulla[i];
                }
            }
        }

        return Fullname;
    }


    public String doubleChar(String word)
    {
        String[] words = word.split(" ");
        String word1 = "";
        String word2 ="";
        int m = words.length, l=0, j=0,k=0;
        char arr[] ;
        char arr1[] ;
        for (k=0 ; k<m ; k++)
        {
            l = words[k].length();
            arr = words[k].toCharArray();
               for (int i=0 ; i<l ; i++)
               {
                   if ((i==0)||(arr[i-1] != arr[i]))
                   {
                     word1 +=arr[i];
                     j++;
                   }
               }
            if(word2=="")
            {
                word2+=word1;
            }
            else
            {
                word2 = word2 + " " + word1;
            }
            word1="";
        }
        return word2;
    }
}


