import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {
    Attendant attendant;
    Manager manager;
    Owner owner;

    @BeforeEach
    void setUp(){
        owner = new Owner(null);
        manager = new Manager(owner);
        attendant = new Attendant(manager);
    }

    @Test
    void shouldBeReturnPromoterAnswer(){
        assertEquals("Attendant", attendant.seeAnswer(new Answer(PromoterAnswer.getPromoterAnswer())));
    }

    @Test
    void shouldBeReturnNeutralAnswer(){
        assertEquals("Manager", attendant.seeAnswer(new Answer(NeutralAnswer.getNeutralAnswer())));
    }

    @Test
    void shouldBeReturnDetractorAnswer(){
        assertEquals("Owner", attendant.seeAnswer(new Answer(DetractorAnswer.getDetractorAnswer())));
    }

    @Test
    void shouldBeReturnBlankAnswer(){
        assertEquals("Responta em branco", attendant.seeAnswer(new Answer(BlankAnswer.getBlankAnswer())));
    }

}