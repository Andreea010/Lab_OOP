package Lab3;

public class Text {

    static int wordCount(String string)
    {
        int word = 0;
        char ch[] = new char[string.length()];
        for(int i = 0; i < string.length(); i++)
        {
            ch[i] = string.charAt(i);
            if( (( i> 0) && (ch[i] != ' ') && (ch[i-1]==' ')) || ((ch[0] != ' ') && (i == 0)) )
                word++;
        }
        return word;
    }

    static int sentenceCount(String string)
    {
        int sentence = 0;
        String[] sentenceList = string .split("[!?.:]+");
        sentence += sentenceList.length;
        return sentence;
    }

    static int letterCount(String string)
    {
        int letter = 0;
        for (int i = 0; i < string.length(); i++){
            char[] ch = string.toCharArray();
            if(Character.isLetter(ch[i]))
                letter ++ ;
        }
        return letter;
    }

    static void vowelConsonant(String string) {
        int vowels = 0;
        int consonant = 0;
        int specialChar = 0;
        int digit = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
            else if (ch >= '0' && ch <= '9')
                digit++;
            else
                specialChar++;
        }

        System.out.println(vowels + " vowels.");
        System.out.println(consonant + " consonants.");
    }

    public static void main(String[] args) {
        String Paragraph = "There is but one truly serious philosophical problem, and that is suicide. Judging whether life is or is not worth living amounts to answering the fundamental of philosophy. All the rest whether or not the world has three dimensions, whether the mind has nine or twelve categories comes afterwards. These are games, one must first answer. And if it is true, as Nietzsche claims, that a philosopher, to deserve our respect, must preach by example, you can appreciate the importance of that reply, for it will precede the definitive. These are facts the heart can feel, yet they call for careful study before they become to the intellect. If I ask myself how to judge that this question is more urgent than that, I reply that one by the actions it entails. I have never seen anyone die for the ontological argument. Galileo, who held a scientific truth of great importance, abjured it with the greatest ease as it endangered his life. In a certain sense, he did right. That truth was not worth the stake. Whether the earth or the sun revolves around the other is a matter of profound indifference. To tell the truth, it is a futile question. On the other hand, I see many people die because they judge that life is not worth living. I see others paradoxically getting killed for the ideas or illusions that give them a reason for living. I therefore conclude that the meaning of life is the most urgent of questions. How to answer it? On all essential there are probably but two methods of thought the method of La Palisse and the method of Don Quixote. Solely the balance between evidence and lyricism can allow us to achieve simultaneously emotion and lucidity. In a subject at once so humble and so heavy with emotion, the learned and classical dialectic must yield, one can see, to a more modest attitude of mind deriving at one and the same time from common sense and understanding." +
                "\n";

        System.out.println(wordCount(Paragraph) + " words.");
        System.out.println(sentenceCount(Paragraph) + " sentences.");
        System.out.println(letterCount(Paragraph) + " letters.");
        vowelConsonant(Paragraph);
    }
}