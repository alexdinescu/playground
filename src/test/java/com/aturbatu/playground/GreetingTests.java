package com.aturbatu.playground;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GreetingTests {
  @Test
  public void testGreeting() {
    Greeting greeting = new Greeting(1, "test");
    Assert.assertEquals("test", greeting.getContent());
    Assert.assertEquals(1, greeting.getId());
  }
}
