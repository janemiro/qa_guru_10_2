package janemiro;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Name");
        $("#lastName").setValue("Lastname");
        $("#userEmail").setValue("a@mail.com");
        //$("#gender-radio-3").click();
        $("#userNumber").setValue("1234567890");
        //date of birth
        $("#subjectsInput").setValue("Commerce").pressEnter();
        //  $("#hobbies-checkbox-2").click();
        //picture
        $("#currentAddress").setValue("here on");
        $("#state").click();
        //  $(Rajasthan)
        //select city
        $("#submit").click();

        sleep(6000);
    }


}
