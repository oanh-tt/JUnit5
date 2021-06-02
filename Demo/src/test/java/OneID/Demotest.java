package OneID;

import static  org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class Demotest {
@Test
    void testMethodnhan(){
    Assertions.assertEquals(6,calculator.nhan(2,3));
}
@Test
    void testMethodchia(){
    assertEquals(2.0,calculator.chia(5,2));
}
@Test
    void assertTrue_False(){
    assertTrue(5>4,"5 lớn hơn 4");
    
}
@Test
    void testMethod_String(){
    String say = "Chị không muốn nhiều bug nhưng bug nhiều thì chị phải fix";
    String sayClone = say;
    assertThat(say).isNotNull();
        assertThat(say).startsWith("Chị");

}
@Test
    void testPhonenumber(){
    String phonenum= "0982708746";
    assertThat(phonenum).startsWith("0")
        .hasSize(10)
        .containsOnlyDigits();
}
@Test
    void testEmail(){
    String mail ="abc@onemount.com";
    assertThat(mail).isNotNull()
            .containsPattern("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
}
@Test
    void testCannang(){
    float can =45.5f;
    assertThat(can).isNotNull()
            .isGreaterThan(0f);

}
@Test
    void testArray(){
    String [] arr = new String[]{"168748933","197384766","384738998","974732777","847930876"};
    for (int i=0;i< arr.length;i++) {
        assertThat(arr[i]).isNotNull()
                .hasSize(9)
                .containsOnlyDigits();
    }
    assertThat(arr).doesNotHaveDuplicates();
}


}
