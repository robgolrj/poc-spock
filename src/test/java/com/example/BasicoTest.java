package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.comparator.BooleanComparator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicoTest {

	@Test
	public void contextLoads() {
		Assert.isTrue(Boolean.TRUE);
	}

}
