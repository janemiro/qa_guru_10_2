package janemiro;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    String name = "Jee";
    String lastName = "Doe";
    String email = "jee.doe@gmail.com";
    String gender = "Other";
    String mobile = "1234567890";
    String month = "May";
    String subject1 = "Commerce";
    String subject2 = "Arts";
    String hobby = "Music";
    String address;
    String state;
    String city;


    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(name);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(mobile);
        //date of birth

        $("#dateOfBirthInput").click();


        sleep(3000);


        $("#subjectsInput").setValue(subject1).pressEnter();
        $("#subjectsInput").setValue(subject2).pressEnter();
        $("#hobbiesWrapper").findElement(byText(hobby)).click();


        //picture
        $("#currentAddress").setValue(address);
        $("#state").click();
        //  $(Rajasthan)
        //select city
        $("#submit").click();


// check
        $("#modal-content name").shouldHave(text(name), text(lastName), text(email), text(gender), text(mobile),
                text(subject1), text(subject2), text(hobby), text(address), text(state), text(city));
        sleep(6000);
    }


}
