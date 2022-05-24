import org.junit.jupiter.api.Test;

public class RevWordTest {

    @Test
    public void revWordsInSentenceTest1()
    {
        RevWordMain.revWord("I AM GOOD");
    }

    @Test
    public void recWordsInSentenceTest2(){
        RevWordMain.revWord("YOU ARE BAD");
    }
}