import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("임시 테스트")
    void testMethod() {
        Person person = new Person("신짱구", 20L, "한강대로 중구");
        assertThat(person.getAge()).isEqualTo(20L);
    }

    @Getter
    @Setter
    public static class Person {
        @NonNull
        private String name;
        @NonNull
        private Long age;
        @NonNull
        private String address;

        public Person(@NonNull String name, @NonNull Long age, @NonNull String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}