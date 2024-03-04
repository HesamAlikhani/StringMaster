import java.util.Scanner;

public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number)
    {
        String[] words = sentence.split(" ");
        if (number < words.length)
        {
            return words[number-1];
        }
        else
        {
            return " Number = " + number + " is out Of Bound";
        }
    }


    public int oddEvenCounter(String number, boolean searchForEven)
    {
        char array[] = number.toCharArray();
        int n = array.length, e = 0, o = 0;
        for (int i=0 ; i<n ; i++)
        {
            if (array[i] % 2 == 0)
            {
                e++;
            } else
            {
                o++;
            }
        }
        if (searchForEven == true)
        {
            return e;
        }
        else
        {
            return o;
        }
    }


    public String firstWord(String wordA, String wordB)
    {
        char name1[] = wordA.toCharArray();
        char name2[] = wordB.toCharArray();
        int n1 = wordA.length();
        int n2 = wordB.length();
        int min = 0;
        String word="";
        if (n2<n1)
        {
            min = n2;
        }
        else
        {
            min = n1;
        }
        for (int i=0 ; i<min ; i++)
        {
            if (name1[i] > name2[i])
            {
                word= wordB;
                break;
            }
            if (name1[i] < name2[i])
            {
                word= wordA;
                break;
            }
            if (i+1==min)
            {
                if (n2<n1)
                {
                    word= wordB;
                }
                else
                {
                    word= wordA;
                }
            }
        }
        return word;
    }
}
