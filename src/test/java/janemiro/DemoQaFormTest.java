package janemiro;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoQaFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    String url = "https://demoqa.com/automation-practice-form",
            name = "Jee",
            lastName = "Doe",
            email = "jee.doe@gmail.com",
            gender = "Other",
            mobile = "1234567890",
            month = "May",
            year = "1990",
            subject1 = "Commerce",
            subject2 = "Arts",
            hobby = "Music",
            picture = "img/1.jpg",
            address = "Roof, 5",
            state = "Rajasthan",
            city = "Jaipur";


    @Test
    void fillFormTest() {

        // Open URL
        open(url);
        $("#firstName").setValue(name);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(mobile);
        //date of birth

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").click();
        $("#subjectsInput").setValue(subject1).pressEnter();
        $("#subjectsInput").setValue(subject2).pressEnter();
        $("#hobbiesWrapper").findElement(byText(hobby)).click();


        //picture
        $("#uploadPicture").uploadFromClasspath(picture);


        $("#currentAddress").setValue(address);

        $("#state").click();
        $("#stateCity-wrapper").selectOption(state);

        $("#city").click();
       $("#stateCity-wrapper").$(byText(city)).scrollTo().click();

       $("#submit").click();


// check
        //$("#modal-content name").shouldHave(text(name), text(lastName), text(email), text(gender), text(mobile),
        //         text(subject1), text(subject2), text(hobby), text(address), text(state), text(city));
        sleep(6000);
    }


}
