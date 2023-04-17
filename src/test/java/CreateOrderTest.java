import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(Parameterized.class)
public class CreateOrderTest {
    private final List<String> color;

    public CreateOrderTest(List<String> color) {
        this.color = color;
    }

    @Parameterized.Parameters
    public static Object[][] chooseColor() {
        return new Object[][]{
                {List.of(ScooterColors.BLACK_COLOR)},
                {List.of(ScooterColors.GREY_COLOR)},
                {List.of(ScooterColors.BLACK_COLOR, ScooterColors.GREY_COLOR)},
                {List.of()},
        };
    }

    @Before
    public void setUp() {
        RestAssured.baseURI = BaseURI.BASE_URI;
    }

    //по-хорошему еще нужно доавбить After для удаления заказа

    @Test
    @DisplayName("Create an order using different scooter colors")
    public void createOrderWithDifferentColorsGetSuccess() {
        Order order = new Order("Ирина", "Бобарыкина", "Торжковская 15", "Чёрная речка", "89123456789", 5, "2023-04-23", "Позвонить за час до доставки", color);
        given()
                .header("Content-type", "application/json")
                .and()
                .body(order)
                .when()
                .post(APIs.ORDER_PATH)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .and()
                .body("track", notNullValue());
    }
}
