package tchepannou.archetypes.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tchepannou.archetypes.springboot.dto.GreetingDto;
import tchepannou.archetypes.springboot.service.GreetingService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTest {

    @Mock
    private GreetingService service;

    @InjectMocks
    private GreetingController controller;

    @Test
    public void testGreeting() throws Exception {
        // Given
        when(service.say("hello")).thenReturn("hello");

        // When
        GreetingDto result = controller.greeting("hello");

        // Then
        assertThat(result.getContent()).isEqualTo("hello");
        assertThat(result.getId()).isGreaterThan(0);
    }
}
